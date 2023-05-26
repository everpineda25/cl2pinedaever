package com.cibertec.edu.daw.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cibertec.edu.daw.models.Personal;
import com.cibertec.edu.daw.services.PersonalServiceImpl;

@Controller
@RequestMapping("/lista")
public class IndexController {
	
	@Autowired
	private PersonalServiceImpl personalService;
	
	@Value("${index.titulo.text}")
	private String title;
	
	
	
	@GetMapping({"/index", "/", "", "/lista"})
	public String index(Model model) {
		model.addAttribute("titulo", title);
		return "index";
		
		
		
	}
	
	/*@GetMapping({"/index", "/", "", "/lista"})
	public String index(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model ) {
		model.addAttribute("name", name);
		return "index";
		
		
		
	}*/
	
	@ModelAttribute("personales")
	public List<Personal> obtenerPersonales(){
		List<Personal> personales = personalService.getAllPersonales();
		
		return personales;
	}

}
