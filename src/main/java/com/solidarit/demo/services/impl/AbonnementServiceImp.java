package com.solidarit.demo.services.impl;


import com.solidarit.demo.entities.Abonnement;
import com.solidarit.demo.repositories.AbonnementRepository;
import com.solidarit.demo.services.AbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbonnementServiceImp implements AbonnementService {
   @Autowired
    private AbonnementRepository abonnementRepository;
    @Override
    public Abonnement add(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public List<Abonnement> getAllAbonnement() {
        return abonnementRepository.findAll();
    }
}
