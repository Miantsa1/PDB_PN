package com.candidat.app.controller;

import com.candidat.app.dto.CandidatDTO;
import com.candidat.app.service.CandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidats")
@CrossOrigin(origins = {"http://localhost:8081", "http://localhost:3000"})
public class CandidatController {
    
    private final CandidatService candidatService;
    
    @Autowired
    public CandidatController(CandidatService candidatService) {
        this.candidatService = candidatService;
    }
    
    @PostMapping
    public ResponseEntity<CandidatDTO> createCandidat(@RequestBody CandidatDTO candidatDTO) {
        CandidatDTO createdCandidat = candidatService.createCandidat(candidatDTO);
        return new ResponseEntity<>(createdCandidat, HttpStatus.CREATED);
    }
    
    @GetMapping
    public ResponseEntity<List<CandidatDTO>> getAllCandidats() {
        List<CandidatDTO> candidats = candidatService.getAllCandidats();
        return ResponseEntity.ok(candidats);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<CandidatDTO> getCandidatById(@PathVariable String id) {
        CandidatDTO candidat = candidatService.getCandidatById(id);
        return ResponseEntity.ok(candidat);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<CandidatDTO> updateCandidat(@PathVariable String id, @RequestBody CandidatDTO candidatDTO) {
        CandidatDTO updatedCandidat = candidatService.updateCandidat(id, candidatDTO);
        return ResponseEntity.ok(updatedCandidat);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCandidat(@PathVariable String id) {
        candidatService.deleteCandidat(id);
        return ResponseEntity.noContent().build();
    }
    
    @GetMapping("/search")
    public ResponseEntity<List<CandidatDTO>> searchCandidats(@RequestParam String keyword) {
        List<CandidatDTO> candidats = candidatService.searchCandidats(keyword);
        return ResponseEntity.ok(candidats);
    }
    
    @GetMapping("/region/{region}")
    public ResponseEntity<List<CandidatDTO>> getCandidatsByRegion(@PathVariable String region) {
        List<CandidatDTO> candidats = candidatService.getCandidatsByRegion(region);
        return ResponseEntity.ok(candidats);
    }
    
    @GetMapping("/statut/{statut}")
    public ResponseEntity<List<CandidatDTO>> getCandidatsByStatut(@PathVariable String statut) {
        List<CandidatDTO> candidats = candidatService.getCandidatsByStatut(statut);
        return ResponseEntity.ok(candidats);
    }
}