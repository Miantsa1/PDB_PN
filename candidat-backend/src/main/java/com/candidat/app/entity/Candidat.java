package com.candidat.app.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "candidat")
public class Candidat {
    
    @Id
    @Column(name = "id_candidat")
    private String idCandidat;
    
    @Column(name = "nom_ct", nullable = false)
    private String nomCt;
    
    @Column(name = "prenom_ct", nullable = false)
    private String prenomCt;
    
    @Column(name = "date_de_naissance", nullable = false)
    private LocalDate dateDeNaissance;
    
    @Column(name = "region", nullable = false)
    private String region;
    
    @Column(name = "ville")
    private String ville;
    
    @Column(name = "commune", nullable = false)
    private String commune;
    
    @Column(name = "adresse_ct", nullable = false)
    private String adresseCt;
    
    @Column(name = "nom_pere", nullable = false)
    private String nomPere;
    
    @Column(name = "occupation_pere", nullable = false)
    private String occupationPere;
    
    @Column(name = "prenom_pere", nullable = false)
    private String prenomPere;
    
    @Column(name = "tel_pere", nullable = false)
    private String telPere;
    
    @Column(name = "statut_pere", nullable = false)
    private String statutPere;
    
    @Column(name = "nom_mere", nullable = false)
    private String nomMere;
    
    @Column(name = "prenom_mere", nullable = false)
    private String prenomMere;
    
    @Column(name = "occupation_mere", nullable = false)
    private String occupationMere;
    
    @Column(name = "photo_ct", nullable = false)
    private String photoCt;
    
    @Column(name = "tel_mere", nullable = false)
    private String telMere;
    
    @Column(name = "statut_mere", nullable = false)
    private String statutMere;
    
    @Column(name = "nbr_freres", nullable = false)
    private Integer nbrFreres;
    
    @Column(name = "nbr_soeurs", nullable = false)
    private Integer nbrSoeurs;
    
    @Column(name = "rang", nullable = false)
    private Integer rang;
    
    @Column(name = "autres_informations", nullable = false)
    private String autresInformations;
    
    @Column(name = "genre", nullable = false)
    private String genre;
    
    @Column(name = "score_au_bacc", nullable = false)
    private String scoreAuBacc;
    
    @Column(name = "test_entree", nullable = false)
    private String testEntree;
    
    @Column(name = "photo_de_famille", nullable = false)
    private String photoDeFamille;
    
    @Column(name = "motivation", nullable = false)
    private String motivation;
    
    @Column(name = "visite_a_domicile", nullable = false)
    private String visiteADomicile;
    
    @Column(name = "orientation", nullable = false)
    private String orientation;
    
    @Column(name = "resultat_l0", nullable = false)
    private String resultatL0;
    
    @Column(name = "resultat_l1", nullable = false)
    private String resultatL1;
    
    @Column(name = "resultat_l2", nullable = false)
    private String resultatL2;
    
    @Column(name = "resultat_l3", nullable = false)
    private String resultatL3;
    
    @Column(name = "educateur", nullable = false)
    private String educateur;
    
    @Column(name = "referent_ong", nullable = false)
    private String referentOng;
    
    @Column(name = "en_cas_urgence", nullable = false)
    private String enCasUrgence;
    
    @Column(name = "club", nullable = false)
    private String club;
    
    @Column(name = "foyer", nullable = false)
    private String foyer;
    
    @Column(name = "autonomie", nullable = false)
    private String autonomie;
    
    @Column(name = "universite", nullable = false)
    private String universite;
    
    @Column(name = "parcours", nullable = false)
    private String parcours;
    
    @Column(name = "stage_l0", nullable = false)
    private String stageL0;
    
    @Column(name = "stage_l1", nullable = false)
    private String stageL1;
    
    @Column(name = "stage_l2", nullable = false)
    private String stageL2;
    
    @Column(name = "stage_l3", nullable = false)
    private String stageL3;
    
    @Column(name = "soutenance", nullable = false)
    private String soutenance;
    
    @Column(name = "categorie", nullable = false)
    private String categorie;
    
    @Column(name = "embauche", nullable = false)
    private String embauche;
    
    @Column(name = "statut_ct", nullable = false)
    private String statutCt;
    
    @Column(name = "mise_a_jour", nullable = false)
    private String miseAJour;
    
    @Column(name = "date_mise_a_jour_ct", nullable = false)
    private LocalDate dateMiseAJourCt;
    
    @Column(name = "bourse", nullable = false)
    private String bourse;
    
    @Column(name = "batch", nullable = false)
    private String batch;
    
    @Column(name = "quartile", nullable = false)
    private String quartile;
    
    @Column(name = "lieu_de_naissance")
    private String lieuDeNaissance;
    
    @Column(name = "cni", nullable = false)
    private String cni;
    
    @Column(name = "tel_ct", nullable = false)
    private String telCt;
    
    @Column(name = "mail_ct", nullable = false)
    private String mailCt;
    
    @OneToMany(mappedBy = "candidat", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Note> notes;

    // Constructeurs
    public Candidat() {
    }

    public Candidat(String idCandidat) {
        this.idCandidat = idCandidat;
    }

    // Getters
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
    public List<Note> getNotes() { return notes; }

    // Setters
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
    public void setNotes(List<Note> notes) { this.notes = notes; }

    @Override
    public String toString() {
        return "Candidat{" +
                "idCandidat='" + idCandidat + '\'' +
                ", nomCt='" + nomCt + '\'' +
                ", prenomCt='" + prenomCt + '\'' +
                '}';
    }
}