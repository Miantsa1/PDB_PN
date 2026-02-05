package com.candidat.app.Miantsa.repository;

import com.candidat.app.Miantsa.entity.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidatRepository extends JpaRepository<Candidat, String> {
    
    List<Candidat> findByNomCtContainingIgnoreCase(String nom);
    
    List<Candidat> findByPrenomCtContainingIgnoreCase(String prenom);
    
    List<Candidat> findByRegion(String region);
    
    List<Candidat> findByStatutCt(String statutCt);
    
    @Query("SELECT c FROM Candidat c WHERE LOWER(c.nomCt) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
           "LOWER(c.prenomCt) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
           "LOWER(c.mailCt) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Candidat> searchByKeyword(@Param("keyword") String keyword);
}