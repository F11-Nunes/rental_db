package com.senai.backend.rental_db.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senai.backend.rental_db.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    
} 
