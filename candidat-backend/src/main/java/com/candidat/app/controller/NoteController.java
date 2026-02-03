package com.candidat.app.controller;

import com.candidat.app.dto.NoteDTO;
import com.candidat.app.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
@CrossOrigin(origins = {"http://localhost:8081", "http://localhost:3000"})
public class NoteController {
    
    private final NoteService noteService;
    
    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }
    
    @PostMapping
    public ResponseEntity<NoteDTO> createNote(@RequestBody NoteDTO noteDTO) {
        NoteDTO createdNote = noteService.createNote(noteDTO);
        return new ResponseEntity<>(createdNote, HttpStatus.CREATED);
    }
    
    @GetMapping
    public ResponseEntity<List<NoteDTO>> getAllNotes() {
        List<NoteDTO> notes = noteService.getAllNotes();
        return ResponseEntity.ok(notes);
    }
    
    @GetMapping("/candidat/{candidatId}")
    public ResponseEntity<List<NoteDTO>> getNotesByCandidatId(@PathVariable String candidatId) {
        List<NoteDTO> notes = noteService.getNotesByCandidatId(candidatId);
        return ResponseEntity.ok(notes);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<NoteDTO> updateNote(@PathVariable Integer id, @RequestBody NoteDTO noteDTO) {
        NoteDTO updatedNote = noteService.updateNote(id, noteDTO);
        return ResponseEntity.ok(updatedNote);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNote(@PathVariable Integer id) {
        noteService.deleteNote(id);
        return ResponseEntity.noContent().build();
    }
}