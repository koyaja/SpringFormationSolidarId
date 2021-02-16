package com.solidarit.demo.repositories;

import com.solidarit.demo.entities.Modele1;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Modele1Repository extends JpaRepository<Modele1,Integer> {
    Modele1 findByNom(String name);
    Modele1 findByNomLike(String name);
   List<Modele1>  findByNomContaining(String name);
}
