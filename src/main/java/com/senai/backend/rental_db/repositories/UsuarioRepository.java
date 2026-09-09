package com.senai.backend.rental_db.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.senai.backend.rental_db.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email);
} 
