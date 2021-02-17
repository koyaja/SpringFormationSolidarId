package com.solidarit.demo.repositories;

import com.solidarit.demo.entities.Individu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndividuRepository extends JpaRepository<Individu, Long> {
}
