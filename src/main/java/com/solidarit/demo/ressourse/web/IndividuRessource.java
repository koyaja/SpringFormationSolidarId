package com.solidarit.demo.ressourse.web;

import com.solidarit.demo.entities.Abonnement;
import com.solidarit.demo.entities.Individu;
import com.solidarit.demo.services.AbonnementService;
import com.solidarit.demo.services.IndividuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("in")
public class IndividuRessource {

    @Autowired
    private AbonnementService abonnementService;
    @Autowired
    private IndividuService individuService;
    @GetMapping
    ResponseEntity<List<Individu>> getAll(){
        return ResponseEntity.ok(individuService.getAllIndividu());
    }
    @PostMapping
    ResponseEntity<Individu> addAb(@RequestBody Individu in){
        return ResponseEntity.ok(individuService.add(in));
    }
}
