package com.senai.backend.rental_db.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.backend.rental_db.models.Movimentacao;
import com.senai.backend.rental_db.models.Usuario;
import com.senai.backend.rental_db.repositories.MovimentacaoRepository;

@Service
public class MovimentacaoService {
    
    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

    public Movimentacao registrarMovimentacao(Movimentacao movimentacao) {
        return movimentacaoRepository.save(movimentacao);
    }

    public Movimentacao consultarMovimentacaoPorId(Integer id) {
        return movimentacaoRepository.findById(id).orElse(null);
    }

	public static long contartUsuarios() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'contartUsuarios'");
	}

    public static Movimentacao buscarUsuarioPorId(Integer id) {
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

    public static Movimentacao cadastrarUsuario(Object usuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarUsuario'");
    }

    public static Object atualizarUsuario(Integer id, Movimentacao movimentacao) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarUsuario'");
    }

}