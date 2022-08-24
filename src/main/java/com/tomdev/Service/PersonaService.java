package com.tomdev.Service;

import java.util.List;

import com.tomdev.Model.Persona;

public interface PersonaService {
	
	List<Persona> listarPersonas();
	public Persona EncontrarPersona(Persona persona);
	void guardarPersona(Persona persona);
	void eliminarPersona(Persona persona);
	void actualizarPersona(Persona persona);

}
