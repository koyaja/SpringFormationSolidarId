package com.solidarit.demo.services.impl;

import com.solidarit.demo.entities.Individu;
import com.solidarit.demo.repositories.IndividuRepository;
import com.solidarit.demo.services.IndividuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class IndividuServiceImp implements IndividuService {
    @Autowired
    private IndividuRepository individuRepository;
    @Override
    public Individu add(Individu individu) {
        individu.setDateCreated(new Date());

        return individuRepository.save(individu);
    }

    @Override
    public Individu update(Individu individu, Integer id) {
        return null;
    }

    @Override
    public List<Individu> getAllIndividu() {
        return individuRepository.findAll();
    }
}
