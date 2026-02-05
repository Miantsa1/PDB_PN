package com.candidat.app.Miantsa.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "notification")
public class Notification {
    
    @EmbeddedId
    private NotificationId id;
    
    @ManyToOne
    @MapsId("idCandidat")
    @JoinColumn(name = "id_candidat")
    private Candidat candidat;
    
    @ManyToOne
    @MapsId("idUt")
    @JoinColumn(name = "id_ut")
    private Utilisateur utilisateur;
    
    @Column(name = "historique", nullable = false)
    private String historique;
    
    @Column(name = "date_historique", nullable = false)
    private LocalDate dateHistorique;

    
    public Notification() {
    }

    public Notification(NotificationId id) {
        this.id = id;
    }

    
    public NotificationId getId() { return id; }
    public Candidat getCandidat() { return candidat; }
    public Utilisateur getUtilisateur() { return utilisateur; }
    public String getHistorique() { return historique; }
    public LocalDate getDateHistorique() { return dateHistorique; }

  
    public void setId(NotificationId id) { this.id = id; }
    public void setCandidat(Candidat candidat) { this.candidat = candidat; }
    public void setUtilisateur(Utilisateur utilisateur) { this.utilisateur = utilisateur; }
    public void setHistorique(String historique) { this.historique = historique; }
    public void setDateHistorique(LocalDate dateHistorique) { this.dateHistorique = dateHistorique; }

    @Override
    public String toString() {
        return "Notification{" +
                "id=" + id +
                ", historique='" + historique + '\'' +
                '}';
    }
}