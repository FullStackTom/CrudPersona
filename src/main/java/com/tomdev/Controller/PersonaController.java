package com.tomdev.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tomdev.Model.Persona;
import com.tomdev.Service.PersonaService;

@Controller

public class PersonaController {
	
	@Autowired
	private PersonaService service;
	
	@GetMapping("/")
	public String inicio(Model model) {
		
		var personas = service.listarPersonas();
		model.addAttribute("personas", personas);
		return "index";
	}
	
	
	@GetMapping("/agregar")
	public String agregar(Persona persona) {
		return "modificar";
		
	}
	
	
	@PostMapping("/guardar")
	public String guardar(Persona persona) {
		service.guardarPersona(persona);
		return "redirect:/";
	}

	
	@GetMapping("/editar/{idPersona}")
	public String editar(Persona persona, Model model) {
		persona= service.EncontrarPersona(persona);
		model.addAttribute("persona", persona);
		return "modificar";
		
	}
	
	@GetMapping("/eliminar/{idPersona}")
	public String eliminar(Persona persona) {
		
		service.eliminarPersona(persona);
		return "redirect:/";
	}
	
	
	
	
}
