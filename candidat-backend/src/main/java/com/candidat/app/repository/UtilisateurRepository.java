package com.candidat.app.repository;

import com.candidat.app.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    
    Optional<Utilisateur> findByNomUt(String nomUt);
    
    Optional<Utilisateur> findByNomUtAndMotDePasse(String nomUt, String motDePasse);
}