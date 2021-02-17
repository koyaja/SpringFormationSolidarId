package com.solidarit.demo.services;

import com.solidarit.demo.entities.Abonnement;

import java.util.List;

public interface AbonnementService {


    Abonnement add(Abonnement abonnement);
    List<Abonnement> getAllAbonnement();
}
