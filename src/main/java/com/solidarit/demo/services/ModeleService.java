package com.solidarit.demo.services;

import com.solidarit.demo.entities.Modele1;

import java.util.List;

public interface ModeleService {
  public Modele1 save(Modele1 modeladd);
  public Modele1 update(Modele1 model, Integer id);
  public Modele1 getOne(Integer id);
  public Modele1 findByName(String nom);
  public void delete(Integer id);

    public List<Modele1> list();
    public List<Modele1> search(String value);
}
