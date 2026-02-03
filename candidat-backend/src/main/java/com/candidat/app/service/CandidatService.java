package com.candidat.app.service;

import com.candidat.app.dto.CandidatDTO;
import com.candidat.app.entity.Candidat;
import com.candidat.app.mapper.CandidatMapper;
import com.candidat.app.repository.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CandidatService {
    
    private final CandidatRepository candidatRepository;
    private final CandidatMapper candidatMapper;
    
    @Autowired
    public CandidatService(CandidatRepository candidatRepository, CandidatMapper candidatMapper) {
        this.candidatRepository = candidatRepository;
        this.candidatMapper = candidatMapper;
    }
    
    public CandidatDTO createCandidat(CandidatDTO candidatDTO) {
        Candidat candidat = candidatMapper.toEntity(candidatDTO);
        Candidat savedCandidat = candidatRepository.save(candidat);
        return candidatMapper.toDTO(savedCandidat);
    }
    
    @Transactional(readOnly = true)
    public List<CandidatDTO> getAllCandidats() {
        return candidatRepository.findAll()
                .stream()
                .map(candidatMapper::toDTO)
                .collect(Collectors.toList());
    }
    
    @Transactional(readOnly = true)
    public CandidatDTO getCandidatById(String id) {
        Candidat candidat = candidatRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Candidat non trouvé avec l'ID: " + id));
        return candidatMapper.toDTO(candidat);
    }
    
    public CandidatDTO updateCandidat(String id, CandidatDTO candidatDTO) {
        Candidat existingCandidat = candidatRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Candidat non trouvé avec l'ID: " + id));
        
        // Mettre à jour les champs
        existingCandidat.setNomCt(candidatDTO.getNomCt());
        existingCandidat.setPrenomCt(candidatDTO.getPrenomCt());
        existingCandidat.setDateDeNaissance(candidatDTO.getDateDeNaissance());
        existingCandidat.setRegion(candidatDTO.getRegion());
        existingCandidat.setVille(candidatDTO.getVille());
        existingCandidat.setCommune(candidatDTO.getCommune());
        // ... mettre à jour tous les autres champs nécessaires
        
        Candidat updatedCandidat = candidatRepository.save(existingCandidat);
        return candidatMapper.toDTO(updatedCandidat);
    }
    
    public void deleteCandidat(String id) {
        if (!candidatRepository.existsById(id)) {
            throw new RuntimeException("Candidat non trouvé avec l'ID: " + id);
        }
        candidatRepository.deleteById(id);
    }
    
    @Transactional(readOnly = true)
    public List<CandidatDTO> searchCandidats(String keyword) {
        return candidatRepository.searchByKeyword(keyword)
                .stream()
                .map(candidatMapper::toDTO)
                .collect(Collectors.toList());
    }
    
    @Transactional(readOnly = true)
    public List<CandidatDTO> getCandidatsByRegion(String region) {
        return candidatRepository.findByRegion(region)
                .stream()
                .map(candidatMapper::toDTO)
                .collect(Collectors.toList());
    }
    
    @Transactional(readOnly = true)
    public List<CandidatDTO> getCandidatsByStatut(String statut) {
        return candidatRepository.findByStatutCt(statut)
                .stream()
                .map(candidatMapper::toDTO)
                .collect(Collectors.toList());
    }
}