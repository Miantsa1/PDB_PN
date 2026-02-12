package com.candidat.app.Miantsa.repository;

import com.candidat.app.Miantsa.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer> {
    
    List<Note> findByCandidat_IdCandidat(String idCandidat);
    
    List<Note> findByTitreNoteContainingIgnoreCase(String titre);
}