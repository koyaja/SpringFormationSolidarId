package com.solidarit.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/exo")
public class Exercice1 {

    private static ArrayList<String> data = new ArrayList<>();

    public Exercice1(){

        data.add("Test 1");
        data.add("Test 2");
        data.add("Test 3");

    }
    public  Exercice1(String nom){

        data.add("Test 1");
        data.add("Test 2");
        data.add("Test 3");

    }

    @GetMapping("/list")
    public List<String> getAll(){
        return data;
    }

    @PostMapping("add")
    public String add(@RequestParam(name = "p") String pAdd){
        data.add(pAdd);
        return pAdd;
    }

    @PutMapping("/update/{id}")
    public String update( @PathVariable(name = "id") String oldValue, @RequestBody String newValue){
     boolean rs=   data.remove(oldValue);
     if(rs){
         data.add(newValue);
         return newValue;
     }

     else 
        return "not found";
    }

    @DeleteMapping("/delete/{id}")
    public String delete( @PathVariable(name = "id") String oldValue){
     boolean result=   data.remove(oldValue);
     if(result){
         return "sucess";
     }
        return "not exist";
    }

}
