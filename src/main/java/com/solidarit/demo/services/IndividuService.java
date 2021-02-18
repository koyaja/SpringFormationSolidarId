package com.solidarit.demo.services;

import com.solidarit.demo.entities.Individu;

import java.util.List;

public interface IndividuService {

    Individu add( Individu individu);
    Individu update( Individu individu, Integer id);
    List<Individu> getAllIndividu();

}
