package com.solidarit.demo.ressourse.rest;

import com.solidarit.demo.entities.Abonnement;
import com.solidarit.demo.services.AbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ab")
public class AbonnementRessource {
    @Autowired
    private AbonnementService abonnementService;
    @GetMapping
    ResponseEntity<List<Abonnement>> getAll(){
        return ResponseEntity.ok(abonnementService.getAllAbonnement());
    }
    @PostMapping
    ResponseEntity<Abonnement> addAb(@RequestBody Abonnement ab){
        return ResponseEntity.ok(abonnementService.add(ab));
    }
}
