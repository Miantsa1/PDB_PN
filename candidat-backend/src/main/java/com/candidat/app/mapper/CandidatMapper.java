package com.candidat.app.mapper;

import com.candidat.app.dto.CandidatDTO;
import com.candidat.app.entity.Candidat;
import org.springframework.stereotype.Component;

@Component
public class CandidatMapper {
    
    public Candidat toEntity(CandidatDTO dto) {
        if (dto == null) {
            return null;
        }
        
        Candidat candidat = new Candidat();
        candidat.setIdCandidat(dto.getIdCandidat());
        candidat.setNomCt(dto.getNomCt());
        candidat.setPrenomCt(dto.getPrenomCt());
        candidat.setDateDeNaissance(dto.getDateDeNaissance());
        candidat.setRegion(dto.getRegion());
        candidat.setVille(dto.getVille());
        candidat.setCommune(dto.getCommune());
        candidat.setAdresseCt(dto.getAdresseCt());
        candidat.setNomPere(dto.getNomPere());
        candidat.setOccupationPere(dto.getOccupationPere());
        candidat.setPrenomPere(dto.getPrenomPere());
        candidat.setTelPere(dto.getTelPere());
        candidat.setStatutPere(dto.getStatutPere());
        candidat.setNomMere(dto.getNomMere());
        candidat.setPrenomMere(dto.getPrenomMere());
        candidat.setOccupationMere(dto.getOccupationMere());
        candidat.setPhotoCt(dto.getPhotoCt());
        candidat.setTelMere(dto.getTelMere());
        candidat.setStatutMere(dto.getStatutMere());
        candidat.setNbrFreres(dto.getNbrFreres());
        candidat.setNbrSoeurs(dto.getNbrSoeurs());
        candidat.setRang(dto.getRang());
        candidat.setAutresInformations(dto.getAutresInformations());
        candidat.setGenre(dto.getGenre());
        candidat.setScoreAuBacc(dto.getScoreAuBacc());
        candidat.setTestEntree(dto.getTestEntree());
        candidat.setPhotoDeFamille(dto.getPhotoDeFamille());
        candidat.setMotivation(dto.getMotivation());
        candidat.setVisiteADomicile(dto.getVisiteADomicile());
        candidat.setOrientation(dto.getOrientation());
        candidat.setResultatL0(dto.getResultatL0());
        candidat.setResultatL1(dto.getResultatL1());
        candidat.setResultatL2(dto.getResultatL2());
        candidat.setResultatL3(dto.getResultatL3());
        candidat.setEducateur(dto.getEducateur());
        candidat.setReferentOng(dto.getReferentOng());
        candidat.setEnCasUrgence(dto.getEnCasUrgence());
        candidat.setClub(dto.getClub());
        candidat.setFoyer(dto.getFoyer());
        candidat.setAutonomie(dto.getAutonomie());
        candidat.setUniversite(dto.getUniversite());
        candidat.setParcours(dto.getParcours());
        candidat.setStageL0(dto.getStageL0());
        candidat.setStageL1(dto.getStageL1());
        candidat.setStageL2(dto.getStageL2());
        candidat.setStageL3(dto.getStageL3());
        candidat.setSoutenance(dto.getSoutenance());
        candidat.setCategorie(dto.getCategorie());
        candidat.setEmbauche(dto.getEmbauche());
        candidat.setStatutCt(dto.getStatutCt());
        candidat.setMiseAJour(dto.getMiseAJour());
        candidat.setDateMiseAJourCt(dto.getDateMiseAJourCt());
        candidat.setBourse(dto.getBourse());
        candidat.setBatch(dto.getBatch());
        candidat.setQuartile(dto.getQuartile());
        candidat.setLieuDeNaissance(dto.getLieuDeNaissance());
        candidat.setCni(dto.getCni());
        candidat.setTelCt(dto.getTelCt());
        candidat.setMailCt(dto.getMailCt());
        
        return candidat;
    }
    
    public CandidatDTO toDTO(Candidat entity) {
        if (entity == null) {
            return null;
        }
        
        CandidatDTO dto = new CandidatDTO();
        dto.setIdCandidat(entity.getIdCandidat());
        dto.setNomCt(entity.getNomCt());
        dto.setPrenomCt(entity.getPrenomCt());
        dto.setDateDeNaissance(entity.getDateDeNaissance());
        dto.setRegion(entity.getRegion());
        dto.setVille(entity.getVille());
        dto.setCommune(entity.getCommune());
        dto.setAdresseCt(entity.getAdresseCt());
        dto.setNomPere(entity.getNomPere());
        dto.setOccupationPere(entity.getOccupationPere());
        dto.setPrenomPere(entity.getPrenomPere());
        dto.setTelPere(entity.getTelPere());
        dto.setStatutPere(entity.getStatutPere());
        dto.setNomMere(entity.getNomMere());
        dto.setPrenomMere(entity.getPrenomMere());
        dto.setOccupationMere(entity.getOccupationMere());
        dto.setPhotoCt(entity.getPhotoCt());
        dto.setTelMere(entity.getTelMere());
        dto.setStatutMere(entity.getStatutMere());
        dto.setNbrFreres(entity.getNbrFreres());
        dto.setNbrSoeurs(entity.getNbrSoeurs());
        dto.setRang(entity.getRang());
        dto.setAutresInformations(entity.getAutresInformations());
        dto.setGenre(entity.getGenre());
        dto.setScoreAuBacc(entity.getScoreAuBacc());
        dto.setTestEntree(entity.getTestEntree());
        dto.setPhotoDeFamille(entity.getPhotoDeFamille());
        dto.setMotivation(entity.getMotivation());
        dto.setVisiteADomicile(entity.getVisiteADomicile());
        dto.setOrientation(entity.getOrientation());
        dto.setResultatL0(entity.getResultatL0());
        dto.setResultatL1(entity.getResultatL1());
        dto.setResultatL2(entity.getResultatL2());
        dto.setResultatL3(entity.getResultatL3());
        dto.setEducateur(entity.getEducateur());
        dto.setReferentOng(entity.getReferentOng());
        dto.setEnCasUrgence(entity.getEnCasUrgence());
        dto.setClub(entity.getClub());
        dto.setFoyer(entity.getFoyer());
        dto.setAutonomie(entity.getAutonomie());
        dto.setUniversite(entity.getUniversite());
        dto.setParcours(entity.getParcours());
        dto.setStageL0(entity.getStageL0());
        dto.setStageL1(entity.getStageL1());
        dto.setStageL2(entity.getStageL2());
        dto.setStageL3(entity.getStageL3());
        dto.setSoutenance(entity.getSoutenance());
        dto.setCategorie(entity.getCategorie());
        dto.setEmbauche(entity.getEmbauche());
        dto.setStatutCt(entity.getStatutCt());
        dto.setMiseAJour(entity.getMiseAJour());
        dto.setDateMiseAJourCt(entity.getDateMiseAJourCt());
        dto.setBourse(entity.getBourse());
        dto.setBatch(entity.getBatch());
        dto.setQuartile(entity.getQuartile());
        dto.setLieuDeNaissance(entity.getLieuDeNaissance());
        dto.setCni(entity.getCni());
        dto.setTelCt(entity.getTelCt());
        dto.setMailCt(entity.getMailCt());
        
        return dto;
    }
}