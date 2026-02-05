package com.candidat.app.Miantsa.dto;

import java.time.LocalDate;

public class NoteDTO {
    private Integer idNote;
    private LocalDate dateNote;
    private String titreNote;
    private String contenuNote;
    private String idCandidat;

    
    public NoteDTO() {
    }

    public NoteDTO(Integer idNote) {
        this.idNote = idNote;
    }

   
    public Integer getIdNote() { return idNote; }
    public LocalDate getDateNote() { return dateNote; }
    public String getTitreNote() { return titreNote; }
    public String getContenuNote() { return contenuNote; }
    public String getIdCandidat() { return idCandidat; }

   
    public void setIdNote(Integer idNote) { this.idNote = idNote; }
    public void setDateNote(LocalDate dateNote) { this.dateNote = dateNote; }
    public void setTitreNote(String titreNote) { this.titreNote = titreNote; }
    public void setContenuNote(String contenuNote) { this.contenuNote = contenuNote; }
    public void setIdCandidat(String idCandidat) { this.idCandidat = idCandidat; }

    @Override
    public String toString() {
        return "NoteDTO{" +
                "idNote=" + idNote +
                ", titreNote='" + titreNote + '\'' +
                '}';
    }
}