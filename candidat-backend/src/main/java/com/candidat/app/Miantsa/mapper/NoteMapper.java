package com.candidat.app.Miantsa.mapper;

import com.candidat.app.Miantsa.dto.NoteDTO;
import com.candidat.app.Miantsa.entity.Note;
import com.candidat.app.Miantsa.entity.Candidat;
import org.springframework.stereotype.Component;

@Component
public class NoteMapper {
    
    public Note toEntity(NoteDTO dto) {
        if (dto == null) {
            return null;
        }
        
        Note note = new Note();
        note.setIdNote(dto.getIdNote());
        note.setDateNote(dto.getDateNote());
        note.setTitreNote(dto.getTitreNote());
        note.setContenuNote(dto.getContenuNote());
        
        // Créer un objet Candidat avec juste l'ID
        if (dto.getIdCandidat() != null) {
            Candidat candidat = new Candidat();
            candidat.setIdCandidat(dto.getIdCandidat());
            note.setCandidat(candidat);
        }
        
        return note;
    }
    
    public NoteDTO toDTO(Note entity) {
        if (entity == null) {
            return null;
        }
        
        NoteDTO dto = new NoteDTO();
        dto.setIdNote(entity.getIdNote());
        dto.setDateNote(entity.getDateNote());
        dto.setTitreNote(entity.getTitreNote());
        dto.setContenuNote(entity.getContenuNote());
        
        if (entity.getCandidat() != null) {
            dto.setIdCandidat(entity.getCandidat().getIdCandidat());
        }
        
        return dto;
    }
}