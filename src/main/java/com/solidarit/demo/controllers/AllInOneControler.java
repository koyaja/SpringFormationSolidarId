package com.solidarit.demo.controllers;

import com.solidarit.demo.entities.Abonnement;
import com.solidarit.demo.services.AbonnementService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import java.util.List;

@Controller
@Slf4j
public class AllInOneControler {
    @Autowired
    private AbonnementService abonnementService;


    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("message", "SPRING BOOT COMPLET FORMATION");
        return "index";
    }

   @RequestMapping(value = { "/listabonne" }, method = RequestMethod.GET)
    public String listAbonne(Model model){

       List<Abonnement> abonnements = abonnementService.getAllAbonnement();
        model.addAttribute("abs", abonnements);
        return "listabonne";
    }

    @RequestMapping(value = { "/addabonne" }, method = RequestMethod.GET)
    public String addAbonne(Model model){

        Abonnement abonnements = new Abonnement();
        model.addAttribute("abs", abonnements);
        return "addabonne";
    }
    @RequestMapping(value = { "/addabonne" }, method = RequestMethod.POST)
    public String addAbonnes(Model model, Abonnement abonnement){
        log.info("Donnee {} ", abonnement );
        abonnementService.add(abonnement);

       model.addAttribute("abs", abonnementService.getAllAbonnement());
        return "listabonne";
    }


}
