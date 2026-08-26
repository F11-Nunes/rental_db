package com.senai.backend.rental_db.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senai.backend.rental_db.models.Equipamento;

public interface EquipamentoRepository extends JpaRepository<Equipamento, Integer>{
   
}