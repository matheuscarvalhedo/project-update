package com.testejava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RefeicaoController {
	
	@GetMapping(path = {"/inicio", "/"})
	public String inicio() {
		return "inicio";
	}

}
