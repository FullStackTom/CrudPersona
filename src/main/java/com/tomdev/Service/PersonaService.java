package com.tomdev.Service;

import java.util.List;

import com.tomdev.Model.Persona;

public interface PersonaService {
	
	List<Persona> listarPersonas();
	Persona ObtenerIdPersona(Integer id);
	void guardarPersona(Persona persona);
	void eliminarPersona(Integer id);
	void actualizarPersona(Persona persona);

}
