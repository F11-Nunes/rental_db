package com.senai.backend.rental_db.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senai.backend.rental_db.models.Usuario;
import com.senai.backend.rental_db.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    
    private final UsuarioRepository usuarioRepository;

    UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Long countUsuarios() {
        return usuarioRepository.count();
    }

    public Usuario registrarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario buscarUsuarioPorId(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario atualizarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public boolean deletarUsuario(Integer id) {
    if (usuarioRepository.existsById(id)) {
        usuarioRepository.deleteById(id);
        return true;
    }
    return false;
}

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public boolean cadastrarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
        return true;
    }
    }
    

