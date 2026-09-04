package com.senai.backend.rental_db.models;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "movimentacao")
public class Movimentacao {
    
    @Id
    @Generated(value = "org.hibernate.id.UUIDGenerator")
    @Column (name= "id")
    private Integer id;

    @Column (name= "id_equipamento")
    private Integer id_equipamento;

    @Column (name= "id_usuario")
    private Integer id_usuario;

    @Column (name= "tipo_movimentacao")
    private String tipo_movimentacao;

    @Column (name= "quantidade")
    private Integer quantidade;

    @Column (name= "observacao_status")
    private String observacao_status;

    public Movimentacao() {
    }

    public Movimentacao(Integer id, Integer id_equipamento, Integer id_usuario, String tipo_movimentacao,
            Integer quantidade, String observacao_status) {
        this.id = id;
        this.id_equipamento = id_equipamento;
        this.id_usuario = id_usuario;
        this.tipo_movimentacao = tipo_movimentacao;
        this.quantidade = quantidade;
        this.observacao_status = observacao_status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_equipamento() {
        return id_equipamento;
    }

    public void setId_equipamento(Integer id_equipamento) {
        this.id_equipamento = id_equipamento;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getTipo_movimentacao() {
        return tipo_movimentacao;
    }

    public void setTipo_movimentacao(String tipo_movimentacao) {
        this.tipo_movimentacao = tipo_movimentacao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getObservacao_status() {
        return observacao_status;
    }

    public void setObservacao_status(String observacao_status) {
        this.observacao_status = observacao_status;
    }

    
}