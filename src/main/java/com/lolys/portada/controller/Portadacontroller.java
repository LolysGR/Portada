package com.lolys.portada.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Portadacontroller {
@GetMapping("portada")
	public String Portada() {
	return "portada";
	
}
}
