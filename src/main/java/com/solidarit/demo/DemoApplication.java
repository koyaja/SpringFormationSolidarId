package com.solidarit.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@SpringBootApplication
@RestController
//@RequestMapping("hw")
public class DemoApplication {


	private UUID id;

	Map map = new HashMap();


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("hw/{noms}")
	public String hello(@PathVariable(name = "noms") String nom, @RequestParam(required = false, defaultValue ="1", name = "a") int age){

		return "hello word Mr/Mme "+ nom + " Vous avez "+ age + " ans";

	}
	@PostMapping(path = "hw")
	public Map pshello(@RequestBody Map map){
		map.put("Nom", "Jean");
		map.put("Age", "20");
		map.put("P", "Informatique");
		return map;

	}
	@PutMapping("hw")
	public Map pthello(@RequestBody Map map,@RequestParam( required = false, defaultValue = "") String nom){
		map.put("Nom", "Jean");
		map.put("Age", "20");
		map.put("P", "Informatique");
		if(!nom.isBlank()){
			map.put("Nom", nom);
		}

		return map;

	}

	@DeleteMapping("hw")
	public void dlhello(){


	}
	@PatchMapping("hw")
	public Map pathello(){
		return new HashMap();

	}

	@RequestMapping(method = RequestMethod.HEAD, path = "hw")
	public String all(){
		return "";
	}

}
