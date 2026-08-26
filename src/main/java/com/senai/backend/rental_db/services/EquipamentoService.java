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

    public static long contartUsuarios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contartUsuarios'");
    }

    public static Equipamento buscarUsuarioPorId(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarUsuarioPorId'");
    }

    public static List<Usuario> listarUsuarios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarUsuarios'");
    }

    public static boolean deletarUsuario(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletarUsuario'");
    }

    public static Equipamento cadastrarUsuario(Object usuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarUsuario'");
    }

    public static Object atualizarUsuario(Integer id, Equipamento equipamento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarUsuario'");
    }
}