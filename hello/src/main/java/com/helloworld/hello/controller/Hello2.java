package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/objetivos")
public class Hello2 {
	
	@GetMapping
	public String objetivos() {
		String objetivos = "Objetivo da semana:\n Compreender os assuntos de back end! ";
				return objetivos;
	}

}
