package com.senai.backend.rental_db.controllers;

import com.senai.backend.rental_db.services.MovimentacaoService;

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

import com.senai.backend.rental_db.models.Movimentacao;
import com.senai.backend.rental_db.models.Usuario;
import com.senai.backend.rental_db.services.MovimentacaoService;

@RestController
@RequestMapping("/usuario")
public class MovimentacaoController {

    @Autowired
    private MovimentacaoService usuarioService;
    private Object usuario;

    @GetMapping("/contar-movimentacao")
        public long contaUsarios() {
            return MovimentacaoService.contartUsuarios();
        } 
        
    @GetMapping("/buscar-usuarios/{id}")
        public Movimentacao buscarUsuario(@PathVariable Integer id) {
            return MovimentacaoService.buscarUsuarioPorId(id);
        } 

    @GetMapping("/listar-usuarios")
        public List<Usuario> listarUsuarios() {
            return MovimentacaoService.listarUsuarios();
        } 

    @DeleteMapping("/deletar-usuario/id")
        public String deletarUsuario(@PathVariable Integer id) {
            if (MovimentacaoService.deletarUsuario(id)) {
                return "Movimentacao removido com sucesso";
            }
            return "Falha ao remover Movimentacao";
        } 
    
    @PostMapping("/salvar-usuario")
        public Movimentacao cadastrarUsuario(@RequestBody Movimentacao movimentacao) {
            return MovimentacaoService.cadastrarUsuario(usuario);
        } 

    @PutMapping("/atualizar-usuario/{id}")
        public String atualizarUsuario(@PathVariable Integer id, @RequestBody Movimentacao movimentacao) {
            if (MovimentacaoService.atualizarUsuario(id, movimentacao) != null) {
                return "Movimentacao atualizado com sucesso";
            }
            return "Falha ao atualizar Movimentacao.";
        } 
}