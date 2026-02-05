package com.candidat.app.Miantsa.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ut")
    private Integer idUt;
    
    @Column(name = "fonction")
    private String fonction;
    
    @Column(name = "nom_ut", nullable = false)
    private String nomUt;
    
    @Column(name = "prenom_ut")
    private String prenomUt;
    
    @Column(name = "mot_de_passe", nullable = false)
    private String motDePasse;
    
    @Column(name = "nouveau_mot_de_passe", nullable = false)
    private String nouveauMotDePasse;
    
    @Column(name = "photo_ut", nullable = false)
    private String photoUt;

    
    public Utilisateur() {
    }

    public Utilisateur(Integer idUt) {
        this.idUt = idUt;
    }

    
    public Integer getIdUt() { return idUt; }
    public String getFonction() { return fonction; }
    public String getNomUt() { return nomUt; }
    public String getPrenomUt() { return prenomUt; }
    public String getMotDePasse() { return motDePasse; }
    public String getNouveauMotDePasse() { return nouveauMotDePasse; }
    public String getPhotoUt() { return photoUt; }

  
    public void setIdUt(Integer idUt) { this.idUt = idUt; }
    public void setFonction(String fonction) { this.fonction = fonction; }
    public void setNomUt(String nomUt) { this.nomUt = nomUt; }
    public void setPrenomUt(String prenomUt) { this.prenomUt = prenomUt; }
    public void setMotDePasse(String motDePasse) { this.motDePasse = motDePasse; }
    public void setNouveauMotDePasse(String nouveauMotDePasse) { this.nouveauMotDePasse = nouveauMotDePasse; }
    public void setPhotoUt(String photoUt) { this.photoUt = photoUt; }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "idUt=" + idUt +
                ", nomUt='" + nomUt + '\'' +
                '}';
    }
}