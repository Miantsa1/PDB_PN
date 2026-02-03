package com.candidat.app.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "note")
public class Note {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_note")
    private Integer idNote;
    
    @Column(name = "date_note", nullable = false)
    private LocalDate dateNote;
    
    @Column(name = "titre_note", nullable = false)
    private String titreNote;
    
    @Column(name = "contenu_note", nullable = false)
    private String contenuNote;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_candidat", nullable = false)
    private Candidat candidat;

    // Constructeurs
    public Note() {
    }

    public Note(Integer idNote) {
        this.idNote = idNote;
    }

    // Getters
    public Integer getIdNote() {
        return idNote;
    }

    public LocalDate getDateNote() {
        return dateNote;
    }

    public String getTitreNote() {
        return titreNote;
    }

    public String getContenuNote() {
        return contenuNote;
    }

    public Candidat getCandidat() {
        return candidat;
    }

    // Setters
    public void setIdNote(Integer idNote) {
        this.idNote = idNote;
    }

    public void setDateNote(LocalDate dateNote) {
        this.dateNote = dateNote;
    }

    public void setTitreNote(String titreNote) {
        this.titreNote = titreNote;
    }

    public void setContenuNote(String contenuNote) {
        this.contenuNote = contenuNote;
    }

    public void setCandidat(Candidat candidat) {
        this.candidat = candidat;
    }

    @Override
    public String toString() {
        return "Note{" +
                "idNote=" + idNote +
                ", titreNote='" + titreNote + '\'' +
                '}';
    }
}