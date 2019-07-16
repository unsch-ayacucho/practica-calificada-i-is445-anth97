package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Service.DocenteService;
@Controller
@RequestMapping("/admin")
public class HomeController {
	
	@Autowired(required=true)
	private DocenteService docenteService;
	
		
	@GetMapping("/home")	
	public String Docente(Model model) {
		
		model.addAttribute("listarDocente", docenteService.retornar());
		return "/views/home";				
		
	}
		
}
