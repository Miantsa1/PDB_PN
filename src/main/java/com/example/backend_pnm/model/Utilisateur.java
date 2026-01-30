package com.example.backend_pnm.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Utilisateur")
@Data
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ut;

    @Column(name = "nom_ut", nullable = false, unique = true)
    private String nomUt; // Java utilisera nomUt pour les méthodes du Repository

    private String prenom_ut;
    private String fonction;
    
    @Column(name = "mot_de_passe", nullable = false)
    private String motDePasse;

    @Column(name = "nouveau_mot_de_passe", nullable = false)
    private String nouveauMotDePasse;

    private String photo_ut;
}