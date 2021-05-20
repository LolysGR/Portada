package com.lolys.portada.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;


@Controller
public class DemoController {
	@GetMapping("Portada")
	public String Portada() {
	return "Portada";
	
}
}
