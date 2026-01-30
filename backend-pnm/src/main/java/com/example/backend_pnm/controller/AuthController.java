package com.example.backend_pnm.controller;

import com.example.backend_pnm.model.Utilisateur;
import com.example.backend_pnm.repository.UtilisateurRepository;
import com.example.backend_pnm.dto.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody Utilisateur user) {
        user.setMotDePasse(passwordEncoder.encode(user.getMotDePasse()));
        user.setNouveauMotDePasse(user.getMotDePasse());
        utilisateurRepository.save(user);
        return ResponseEntity.ok("Utilisateur créé avec succès !");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        return utilisateurRepository.findByNomUt(loginRequest.getUsername())
            .map(user -> {
                if (passwordEncoder.matches(loginRequest.getPassword(), user.getMotDePasse())) {
                    return ResponseEntity.ok("Connexion réussie !");
                }
                return ResponseEntity.status(401).body("Mot de passe incorrect.");
            })
            .orElse(ResponseEntity.status(404).body("Utilisateur non trouvé."));
    }
}