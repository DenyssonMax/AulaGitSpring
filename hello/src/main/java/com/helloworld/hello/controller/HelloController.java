package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/habilidades")
public class HelloController {
	
	@GetMapping
	public String habilidades () {
		String mentalidades = "Mentalidades\n  -Persistência. \n";
		String habilidades = " habilidades\n -Trabalho em equipe;\n -Atenção aos detalhes; \n -Comunicação.";
		
	return mentalidades + habilidades;
	}
	
	

}
