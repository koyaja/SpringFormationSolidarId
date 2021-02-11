package com.solidarit.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/exo2bd")
public class Exercice2Bd {
    // Create Read Update Delete
    private static List<Modele1> data = new ArrayList<>();

    @Autowired
    private Modele1Repository modele1Repository;

    public Exercice2Bd(){

        data.add(new Modele1(1,"KOMACLO 1", "Jacques"));
        data.add(new Modele1(2,"KOMACLO 2", "Jacques"));
        data.add(new Modele1(3,"KOMACLO 3", "Jacques"));


    }


    @GetMapping("/list")
    public List<Modele1> getAll(){
        return modele1Repository.findAll();
    }

    @PostMapping("add")
    public Modele1 add(@RequestBody Modele1 pAdd){

        return modele1Repository.save(pAdd);
    }

    @PutMapping("/update/{id}")
    public Modele1 update( @PathVariable(name = "id") Integer oldValue, @RequestBody Modele1 newValue){
 // recuperer le model
        Modele1 ancienModel = modele1Repository.findById(oldValue).get();
        ancienModel.setNom(newValue.getNom());
        ancienModel.setPrenom(newValue.getPrenom());
     
        return modele1Repository.saveAndFlush(ancienModel);
    }

    @DeleteMapping("/delete/{id}")
    public void delete( @PathVariable(name = "id") Integer oldValue){
         modele1Repository.deleteById(oldValue);
    }

}
