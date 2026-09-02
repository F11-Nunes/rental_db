package com.senai.backend.rental_db.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.rental_db.models.Equipamento;
import com.senai.backend.rental_db.models.Usuario;
import com.senai.backend.rental_db.repositories.EquipamentoRepository;

@Service
public class EquipamentoService {
    
    @Autowired
    private EquipamentoRepository equipamentoRepository;

    public Long countEquipamentos() {
        return equipamentoRepository.count();
    }

    public List<Equipamento> listarEquipamentos() {
        return equipamentoRepository.findAll();
    }

    public Equipamento registrarEquipamento(Equipamento equipamento) {
        return equipamentoRepository.save(equipamento);
    }

    public Equipamento buscarEquipamentoPorId(Integer id) {
        return equipamentoRepository.findById(id).orElse(null);
    }

    public Equipamento atualizarEquipamento(Equipamento equipamento) {
        return equipamentoRepository.save(equipamento);
    }

    public void deletarEquipamento(Integer id) {
        equipamentoRepository.deleteById(id);
    }

}