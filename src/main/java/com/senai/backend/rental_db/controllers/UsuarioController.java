package com.senai.backend.rental_db.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.rental_db.models.Usuario;
import com.senai.backend.rental_db.services.UsuarioService;
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/cadastrar-usuario")
        public Usuario cadastrarUsuario1(@RequestBody Usuario usuario) {
            return usuarioService.registrarUsuario(usuario);
        }

    @GetMapping("/contar-usuarios")
        public long contaUsarios() {
            return usuarioService.countUsuarios();
        } 
        
    @GetMapping("/buscar-usuarios/{id}")
        public Usuario buscarUsuario(@PathVariable Integer id) {
            return usuarioService.buscarUsuarioPorId(id);
        } 

    @GetMapping("/listar-usuarios")
        public List<Usuario> listarUsuarios() {
            return usuarioService.listarUsuarios();
        } 

    @DeleteMapping("/deletar-usuario/{id}")
        public String deletarUsuario(@PathVariable Integer id) {
            if (usuarioService.deletarUsuario(id)) {
                return "Usuário removido com sucesso";
            }
            return "Falha ao remover usuário";
        } 
    
    @PostMapping("/salvar-usuario")
        public boolean cadastrarUsuario(@RequestBody Usuario usuario) {
            return usuarioService.cadastrarUsuario(usuario);
        } 

    @PutMapping("/atualizar-usuario/{id}")
        public String atualizarUsuario(@PathVariable Integer id, @RequestBody Usuario usuario) {
            if (usuarioService.atualizarUsuario(usuario) != null) {
                return "Usuario atualizado com sucesso";
            }
            return "Falha ao atualizar usuário.";
        } 
}