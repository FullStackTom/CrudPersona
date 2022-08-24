package com.tomdev.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tomdev.Model.Persona;
import com.tomdev.Repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService {
	
	@Autowired
	private PersonaRepository repository;

	@Override
	public List<Persona> listarPersonas() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	

	@Override
	public void guardarPersona(Persona persona) {
		// TODO Auto-generated method stub
		repository.save(persona);

	}

	@Override
	public void eliminarPersona(Persona persona) {
		// TODO Auto-generated method stub
		repository.delete(persona);

	}

	@Override
	public void actualizarPersona(Persona persona) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(persona);

	}



	 @Override
	 @Transactional(readOnly = true)	
	public Persona EncontrarPersona(Persona persona) {
		// TODO Auto-generated method stub
		return repository.findById(persona.getIdPersona()).orElse(null);
	}

}
