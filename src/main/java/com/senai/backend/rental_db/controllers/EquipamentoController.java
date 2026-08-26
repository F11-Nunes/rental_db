package com.senai.backend.rental_db.controllers;

import org.springframework.web.bind.annotation.RestController;

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

import com.senai.backend.rental_db.models.Equipamento;
import com.senai.backend.rental_db.models.Usuario;
import com.senai.backend.rental_db.services.EquipamentoService;

@RestController
@RequestMapping("/usuario")
public class EquipamentoController{

    @Autowired
    private EquipamentoService equipamentoService;
    private Object usuario;

    @GetMapping("/contar-movimentacao")
        public long contaUsarios() {
            return EquipamentoService.contartUsuarios();
        } 
        
    @GetMapping("/buscar-usuarios/{id}")
        public Equipamento buscarUsuario(@PathVariable Integer id) {
            return EquipamentoService.buscarUsuarioPorId(id);
        } 

    @GetMapping("/listar-usuarios")
        public List<Usuario> listarUsuarios() {
            return EquipamentoService.listarUsuarios();
        } 

    @DeleteMapping("/deletar-usuario/id")
        public String deletarUsuario(@PathVariable Integer id) {
            if (EquipamentoService.deletarUsuario(id)) {
                return "Equipamento removido com sucesso";
            }
            return "Falha ao remover Equipamento";
        } 
    
    @PostMapping("/salvar-usuario")
        public Equipamento cadastrarUsuario(@RequestBody Equipamento equipamento) {
            return EquipamentoService.cadastrarUsuario(usuario);
        } 

    @PutMapping("/atualizar-usuario/{id}")
        public String atualizarUsuario(@PathVariable Integer id, @RequestBody Equipamento equipamento) {
            if (EquipamentoService.atualizarUsuario(id, equipamento) != null) {
                return "Equipamento atualizado com sucesso";
            }
            return "Falha ao atualizar Equipamento.";
        } 
}