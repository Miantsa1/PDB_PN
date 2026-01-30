package com.example.backend_pnm.repository;

import com.example.backend_pnm.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    // Spring va chercher la variable "nomUt" définie dans le modèle
    Optional<Utilisateur> findByNomUt(String nomUt);
}