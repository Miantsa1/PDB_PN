package com.candidat.app.service;

import com.candidat.app.dto.NoteDTO;
import com.candidat.app.entity.Candidat;
import com.candidat.app.entity.Note;
import com.candidat.app.mapper.NoteMapper;
import com.candidat.app.repository.CandidatRepository;
import com.candidat.app.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class NoteService {
    
    private final NoteRepository noteRepository;
    private final CandidatRepository candidatRepository;
    private final NoteMapper noteMapper;
    
    @Autowired
    public NoteService(NoteRepository noteRepository, CandidatRepository candidatRepository, NoteMapper noteMapper) {
        this.noteRepository = noteRepository;
        this.candidatRepository = candidatRepository;
        this.noteMapper = noteMapper;
    }
    
    public NoteDTO createNote(NoteDTO noteDTO) {
        // Vérifier si le candidat existe
        Candidat candidat = candidatRepository.findById(noteDTO.getIdCandidat())
                .orElseThrow(() -> new RuntimeException("Candidat non trouvé avec l'ID: " + noteDTO.getIdCandidat()));
        
        Note note = noteMapper.toEntity(noteDTO);
        note.setCandidat(candidat);
        
        Note savedNote = noteRepository.save(note);
        return noteMapper.toDTO(savedNote);
    }
    
    @Transactional(readOnly = true)
    public List<NoteDTO> getNotesByCandidatId(String candidatId) {
        return noteRepository.findByCandidat_IdCandidat(candidatId)
                .stream()
                .map(noteMapper::toDTO)
                .collect(Collectors.toList());
    }
    
    @Transactional(readOnly = true)
    public List<NoteDTO> getAllNotes() {
        return noteRepository.findAll()
                .stream()
                .map(noteMapper::toDTO)
                .collect(Collectors.toList());
    }
    
    public NoteDTO updateNote(Integer id, NoteDTO noteDTO) {
        Note existingNote = noteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Note non trouvée avec l'ID: " + id));
        
        existingNote.setDateNote(noteDTO.getDateNote());
        existingNote.setTitreNote(noteDTO.getTitreNote());
        existingNote.setContenuNote(noteDTO.getContenuNote());
        
        // Si l'ID du candidat change, mettre à jour la relation
        if (noteDTO.getIdCandidat() != null && 
            (existingNote.getCandidat() == null || 
             !existingNote.getCandidat().getIdCandidat().equals(noteDTO.getIdCandidat()))) {
            
            Candidat candidat = candidatRepository.findById(noteDTO.getIdCandidat())
                    .orElseThrow(() -> new RuntimeException("Candidat non trouvé avec l'ID: " + noteDTO.getIdCandidat()));
            existingNote.setCandidat(candidat);
        }
        
        Note updatedNote = noteRepository.save(existingNote);
        return noteMapper.toDTO(updatedNote);
    }
    
    public void deleteNote(Integer id) {
        if (!noteRepository.existsById(id)) {
            throw new RuntimeException("Note non trouvée avec l'ID: " + id);
        }
        noteRepository.deleteById(id);
    }
}