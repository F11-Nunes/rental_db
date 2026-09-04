package com.senai.backend.rental_db.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senai.backend.rental_db.models.Movimentacao;
import com.senai.backend.rental_db.repositories.MovimentacaoRepository;

@Service
public class MovimentacaoService {

    private final MovimentacaoRepository movimentacaoRepository;

    MovimentacaoService(MovimentacaoRepository movimentacaoRepository) {
        this.movimentacaoRepository = movimentacaoRepository;
    }

    public long contarMovimentacoes() {
        return movimentacaoRepository.count();
    }

    public List<Movimentacao> listarMovimentacoes() {
        return movimentacaoRepository.findAll();
    }

    public Movimentacao registrarMovimentacao(Movimentacao movimentacao) {
        return movimentacaoRepository.save(movimentacao);
    }

    public Movimentacao consultarMovimentacaoPorId(Integer id) {
        return movimentacaoRepository.findById(id).orElse(null);
    }

    public Movimentacao atualizarMovimentacao(Movimentacao movimentacao) {
        return movimentacaoRepository.save(movimentacao);
    }

    public boolean deletarMovimentacao(Integer id) {
        if (movimentacaoRepository.existsById(id)) {
            movimentacaoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}