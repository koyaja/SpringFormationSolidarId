package com.solidarit.demo.ressourse.web;


import com.solidarit.demo.entities.Modele1;
import com.solidarit.demo.services.impl.ModeleServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exo2bd")
public class Exercice2Bd {

    // @Autowired
   private final ModeleServiceImp modeleService;

    public Exercice2Bd(ModeleServiceImp modeleService) {
        this.modeleService = modeleService;
    }


    @GetMapping("/list")
    public List<Modele1> getAll(){
        return modeleService.list();
    }

    @PostMapping("add")
    public Modele1 add(@RequestBody Modele1 pAdd){

        return modeleService.save(pAdd);
    }

    @GetMapping("searchByName")
    public Modele1 searchByNamed(@RequestParam String name){

        return modeleService.findByName(name);
    }
    @GetMapping("search")
    public List<Modele1> search(@RequestParam String value){

        return modeleService.search(value);
    }
    @GetMapping("searchnp")
    public List<Modele1> searchNp(@RequestParam(name = "n") String nom, @RequestParam(name = "p") String prenom){

        return modeleService.searchbyNp(nom,prenom);
    }

    @PutMapping("/update/{id}")
    public Modele1 update( @PathVariable(name = "id") Integer oldValue, @RequestBody Modele1 newValue){

        return modeleService.update(newValue, oldValue);
    }

    @DeleteMapping("/delete/{id}")
    public void delete( @PathVariable(name = "id") Integer oldValue){
         modeleService.delete(oldValue);
    }

}
