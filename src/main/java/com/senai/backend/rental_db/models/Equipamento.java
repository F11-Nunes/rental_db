package com.senai.backend.rental_db.models;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipamento")
public class Equipamento {

    @Id
    @Generated(value = "org.hibernate.id.UUIDGenerator")
    @Column (name= "id")
    private Integer id;

    @Column (name= "nome")
    private String nome;

    @Column (name= "marca")
    private String marca;

    @Column (name= "modelo")
    private String modelo;

    @Column (name= "categoria")
    private String categoria;

    @Column (name= "qtd_total")
    private Integer qtd_total;

    @Column (name= "qtd_estoque_minimo")
    private Integer qtd_estoque_minimo;

    public Equipamento(Integer id, String nome, String marca, String modelo, String categoria, Integer qtd_total,
            Integer qtd_estoque_minimo) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.categoria = categoria;
        this.qtd_total = qtd_total;
        this.qtd_estoque_minimo = qtd_estoque_minimo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getQtd_total() {
        return qtd_total;
    }

    public void setQtd_total(Integer qtd_total) {
        this.qtd_total = qtd_total;
    }

    public Integer getQtd_estoque_minimo() {
        return qtd_estoque_minimo;
    }

    public void setQtd_estoque_minimo(Integer qtd_estoque_minimo) {
        this.qtd_estoque_minimo = qtd_estoque_minimo;
    }

    
}
