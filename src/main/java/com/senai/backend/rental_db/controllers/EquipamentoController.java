package com.senai.backend.rental_db.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.backend.rental_db.models.Equipamento;
import com.senai.backend.rental_db.services.EquipamentoService;

@RestController
@RequestMapping("/equipamento")
public class EquipamentoController {

    private final EquipamentoService equipamentoService;

    EquipamentoController(EquipamentoService equipamentoService) {
        this.equipamentoService = equipamentoService;
    }

    @GetMapping("/contar")
    public long contarEquipamentos() {
        return equipamentoService.countEquipamentos();
    } 

    @GetMapping("/buscar/{id}")
    public Equipamento buscarEquipamento(@PathVariable Integer id) {
        return equipamentoService.buscarEquipamentoPorId(id);
    } 

    @GetMapping("/listar")
    public List<Equipamento> listarEquipamentos() {
        return equipamentoService.listarEquipamentos();
    } 

    @DeleteMapping("/deletar/{id}")
    public String deletarEquipamento(@PathVariable Integer id) {
        equipamentoService.deletarEquipamento(id);
        return "Equipamento removido com sucesso";
        
    } 

    @PostMapping("/salvar")
    public Equipamento cadastrarEquipamento(@RequestBody Equipamento equipamento) {
        return equipamentoService.registrarEquipamento(equipamento);
    } 

    @PutMapping("/atualizar/{id}")
    public String atualizarEquipamento(@PathVariable Integer id, @RequestBody Equipamento equipamento) {
        equipamento.setId(id);
        if (equipamentoService.atualizarEquipamento(equipamento) != null) {
            return "Equipamento atualizado com sucesso";
        }
        return "Falha ao atualizar Equipamento.";
    } 
}