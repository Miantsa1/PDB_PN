package com.candidat.app.Miantsa.dto;

import java.time.LocalDate;

public class CandidatDTO {
    private String idCandidat;
    private String nomCt;
    private String prenomCt;
    private LocalDate dateDeNaissance;
    private String region;
    private String ville;
    private String commune;
    private String adresseCt;
    private String nomPere;
    private String occupationPere;
    private String prenomPere;
    private String telPere;
    private String statutPere;
    private String nomMere;
    private String prenomMere;
    private String occupationMere;
    private String photoCt;
    private String telMere;
    private String statutMere;
    private Integer nbrFreres;
    private Integer nbrSoeurs;
    private Integer rang;
    private String autresInformations;
    private String genre;
    private String scoreAuBacc;
    private String testEntree;
    private String photoDeFamille;
    private String motivation;
    private String visiteADomicile;
    private String orientation;
    private String resultatL0;
    private String resultatL1;
    private String resultatL2;
    private String resultatL3;
    private String educateur;
    private String referentOng;
    private String enCasUrgence;
    private String club;
    private String foyer;
    private String autonomie;
    private String universite;
    private String parcours;
    private String stageL0;
    private String stageL1;
    private String stageL2;
    private String stageL3;
    private String soutenance;
    private String categorie;
    private String embauche;
    private String statutCt;
    private String miseAJour;
    private LocalDate dateMiseAJourCt;
    private String bourse;
    private String batch;
    private String quartile;
    private String lieuDeNaissance;
    private String cni;
    private String telCt;
    private String mailCt;

    
    public CandidatDTO() {
    }

    public CandidatDTO(String idCandidat) {
        this.idCandidat = idCandidat;
    }

    
    public String getIdCandidat() { return idCandidat; }
    public String getNomCt() { return nomCt; }
    public String getPrenomCt() { return prenomCt; }
    public LocalDate getDateDeNaissance() { return dateDeNaissance; }
    public String getRegion() { return region; }
    public String getVille() { return ville; }
    public String getCommune() { return commune; }
    public String getAdresseCt() { return adresseCt; }
    public String getNomPere() { return nomPere; }
    public String getOccupationPere() { return occupationPere; }
    public String getPrenomPere() { return prenomPere; }
    public String getTelPere() { return telPere; }
    public String getStatutPere() { return statutPere; }
    public String getNomMere() { return nomMere; }
    public String getPrenomMere() { return prenomMere; }
    public String getOccupationMere() { return occupationMere; }
    public String getPhotoCt() { return photoCt; }
    public String getTelMere() { return telMere; }
    public String getStatutMere() { return statutMere; }
    public Integer getNbrFreres() { return nbrFreres; }
    public Integer getNbrSoeurs() { return nbrSoeurs; }
    public Integer getRang() { return rang; }
    public String getAutresInformations() { return autresInformations; }
    public String getGenre() { return genre; }
    public String getScoreAuBacc() { return scoreAuBacc; }
    public String getTestEntree() { return testEntree; }
    public String getPhotoDeFamille() { return photoDeFamille; }
    public String getMotivation() { return motivation; }
    public String getVisiteADomicile() { return visiteADomicile; }
    public String getOrientation() { return orientation; }
    public String getResultatL0() { return resultatL0; }
    public String getResultatL1() { return resultatL1; }
    public String getResultatL2() { return resultatL2; }
    public String getResultatL3() { return resultatL3; }
    public String getEducateur() { return educateur; }
    public String getReferentOng() { return referentOng; }
    public String getEnCasUrgence() { return enCasUrgence; }
    public String getClub() { return club; }
    public String getFoyer() { return foyer; }
    public String getAutonomie() { return autonomie; }
    public String getUniversite() { return universite; }
    public String getParcours() { return parcours; }
    public String getStageL0() { return stageL0; }
    public String getStageL1() { return stageL1; }
    public String getStageL2() { return stageL2; }
    public String getStageL3() { return stageL3; }
    public String getSoutenance() { return soutenance; }
    public String getCategorie() { return categorie; }
    public String getEmbauche() { return embauche; }
    public String getStatutCt() { return statutCt; }
    public String getMiseAJour() { return miseAJour; }
    public LocalDate getDateMiseAJourCt() { return dateMiseAJourCt; }
    public String getBourse() { return bourse; }
    public String getBatch() { return batch; }
    public String getQuartile() { return quartile; }
    public String getLieuDeNaissance() { return lieuDeNaissance; }
    public String getCni() { return cni; }
    public String getTelCt() { return telCt; }
    public String getMailCt() { return mailCt; }

   
    public void setIdCandidat(String idCandidat) { this.idCandidat = idCandidat; }
    public void setNomCt(String nomCt) { this.nomCt = nomCt; }
    public void setPrenomCt(String prenomCt) { this.prenomCt = prenomCt; }
    public void setDateDeNaissance(LocalDate dateDeNaissance) { this.dateDeNaissance = dateDeNaissance; }
    public void setRegion(String region) { this.region = region; }
    public void setVille(String ville) { this.ville = ville; }
    public void setCommune(String commune) { this.commune = commune; }
    public void setAdresseCt(String adresseCt) { this.adresseCt = adresseCt; }
    public void setNomPere(String nomPere) { this.nomPere = nomPere; }
    public void setOccupationPere(String occupationPere) { this.occupationPere = occupationPere; }
    public void setPrenomPere(String prenomPere) { this.prenomPere = prenomPere; }
    public void setTelPere(String telPere) { this.telPere = telPere; }
    public void setStatutPere(String statutPere) { this.statutPere = statutPere; }
    public void setNomMere(String nomMere) { this.nomMere = nomMere; }
    public void setPrenomMere(String prenomMere) { this.prenomMere = prenomMere; }
    public void setOccupationMere(String occupationMere) { this.occupationMere = occupationMere; }
    public void setPhotoCt(String photoCt) { this.photoCt = photoCt; }
    public void setTelMere(String telMere) { this.telMere = telMere; }
    public void setStatutMere(String statutMere) { this.statutMere = statutMere; }
    public void setNbrFreres(Integer nbrFreres) { this.nbrFreres = nbrFreres; }
    public void setNbrSoeurs(Integer nbrSoeurs) { this.nbrSoeurs = nbrSoeurs; }
    public void setRang(Integer rang) { this.rang = rang; }
    public void setAutresInformations(String autresInformations) { this.autresInformations = autresInformations; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setScoreAuBacc(String scoreAuBacc) { this.scoreAuBacc = scoreAuBacc; }
    public void setTestEntree(String testEntree) { this.testEntree = testEntree; }
    public void setPhotoDeFamille(String photoDeFamille) { this.photoDeFamille = photoDeFamille; }
    public void setMotivation(String motivation) { this.motivation = motivation; }
    public void setVisiteADomicile(String visiteADomicile) { this.visiteADomicile = visiteADomicile; }
    public void setOrientation(String orientation) { this.orientation = orientation; }
    public void setResultatL0(String resultatL0) { this.resultatL0 = resultatL0; }
    public void setResultatL1(String resultatL1) { this.resultatL1 = resultatL1; }
    public void setResultatL2(String resultatL2) { this.resultatL2 = resultatL2; }
    public void setResultatL3(String resultatL3) { this.resultatL3 = resultatL3; }
    public void setEducateur(String educateur) { this.educateur = educateur; }
    public void setReferentOng(String referentOng) { this.referentOng = referentOng; }
    public void setEnCasUrgence(String enCasUrgence) { this.enCasUrgence = enCasUrgence; }
    public void setClub(String club) { this.club = club; }
    public void setFoyer(String foyer) { this.foyer = foyer; }
    public void setAutonomie(String autonomie) { this.autonomie = autonomie; }
    public void setUniversite(String universite) { this.universite = universite; }
    public void setParcours(String parcours) { this.parcours = parcours; }
    public void setStageL0(String stageL0) { this.stageL0 = stageL0; }
    public void setStageL1(String stageL1) { this.stageL1 = stageL1; }
    public void setStageL2(String stageL2) { this.stageL2 = stageL2; }
    public void setStageL3(String stageL3) { this.stageL3 = stageL3; }
    public void setSoutenance(String soutenance) { this.soutenance = soutenance; }
    public void setCategorie(String categorie) { this.categorie = categorie; }
    public void setEmbauche(String embauche) { this.embauche = embauche; }
    public void setStatutCt(String statutCt) { this.statutCt = statutCt; }
    public void setMiseAJour(String miseAJour) { this.miseAJour = miseAJour; }
    public void setDateMiseAJourCt(LocalDate dateMiseAJourCt) { this.dateMiseAJourCt = dateMiseAJourCt; }
    public void setBourse(String bourse) { this.bourse = bourse; }
    public void setBatch(String batch) { this.batch = batch; }
    public void setQuartile(String quartile) { this.quartile = quartile; }
    public void setLieuDeNaissance(String lieuDeNaissance) { this.lieuDeNaissance = lieuDeNaissance; }
    public void setCni(String cni) { this.cni = cni; }
    public void setTelCt(String telCt) { this.telCt = telCt; }
    public void setMailCt(String mailCt) { this.mailCt = mailCt; }

    @Override
    public String toString() {
        return "CandidatDTO{" +
                "idCandidat='" + idCandidat + '\'' +
                ", nomCt='" + nomCt + '\'' +
                ", prenomCt='" + prenomCt + '\'' +
                '}';
    }
}