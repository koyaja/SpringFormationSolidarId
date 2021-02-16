package com.solidarit.demo.services.impl;

import com.solidarit.demo.entities.Modele1;
import com.solidarit.demo.repositories.Modele1Repository;
import com.solidarit.demo.services.ModeleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class ModeleServiceImp implements ModeleService {
    private static Logger logger = Logger.getLogger(String.valueOf(ModeleServiceImp.class));
    @Autowired
    private Modele1Repository modele1Repository;
    @Override
    public Modele1 save(Modele1 modeladd) {
        logger.info("Add modele");
        return modele1Repository.save(modeladd);
    }

    @Override
    public Modele1 update(Modele1 model, Integer id) {
        Modele1 ancienModel = modele1Repository.findById(id).get();

        if(!model.getNom().isBlank()) {
            ancienModel.setNom(model.getNom());
        }
        if(!model.getPrenom().isBlank()) {
            ancienModel.setPrenom(model.getPrenom());
        }


        return modele1Repository.saveAndFlush(ancienModel);
    }

    @Override
    public Modele1 getOne(Integer id) {
        return modele1Repository.findById(id).get();
    }

    @Override
    public Modele1 findByName(String nom) {
        return modele1Repository.findByNomLike(nom);
    }

    @Override
    public void delete(Integer id) {
        modele1Repository.deleteById(id);
    }

    @Override
    public List<Modele1> list() {
        return modele1Repository.findAll();
    }

    @Override
    public List<Modele1> search(String value) {
        return modele1Repository.findByNomContaining(value);
    }
}
