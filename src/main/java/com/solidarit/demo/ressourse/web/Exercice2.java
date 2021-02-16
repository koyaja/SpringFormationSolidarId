package com.solidarit.demo.ressourse.web;


import com.solidarit.demo.entities.Modele1;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/exo2")
public class Exercice2 {

    private static List<Modele1> data = new ArrayList<>();

    public Exercice2(){

        data.add(new Modele1(1,"KOMACLO 1", "Jacques"));
        data.add(new Modele1(2,"KOMACLO 2", "Jacques"));
        data.add(new Modele1(3,"KOMACLO 3", "Jacques"));


    }


    @GetMapping("/list")
    public List<Modele1> getAll(){
        return data;
    }

    @PostMapping("add")
    public Modele1 add(@RequestBody Modele1 pAdd){
        data.add(pAdd);
        return pAdd;
    }

    @PutMapping("/update/{id}")
    public Modele1 update( @PathVariable(name = "id") Integer oldValue, @RequestBody Modele1 newValue){
     Modele1 ancienModel = null;
// recuperer le model
     for (Modele1 m: data){
         if(m.getId()==oldValue){
             ancienModel =m;
     }
     }
     ancienModel.setNom(newValue.getNom());
     ancienModel.setPrenom(newValue.getPrenom());
     
        return ancienModel;
    }

    @DeleteMapping("/delete/{id}")
    public String delete( @PathVariable(name = "id") Integer oldValue){
        Modele1 ancienModel = new Modele1();
        ancienModel.setId(oldValue);
        boolean result=   data.remove(ancienModel);
     if(result){
         return "sucess";
     }
        return "not exist";
    }

}
