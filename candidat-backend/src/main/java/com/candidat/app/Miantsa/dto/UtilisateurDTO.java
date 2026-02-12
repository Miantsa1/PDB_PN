package com.candidat.app.Miantsa.dto;

public class UtilisateurDTO {
    private Integer idUt;
    private String fonction;
    private String nomUt;
    private String prenomUt;
    private String motDePasse;
    private String nouveauMotDePasse;
    private String photoUt;

   
    public UtilisateurDTO() {
    }

    public UtilisateurDTO(Integer idUt) {
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
        return "UtilisateurDTO{" +
                "idUt=" + idUt +
                ", nomUt='" + nomUt + '\'' +
                '}';
    }
}