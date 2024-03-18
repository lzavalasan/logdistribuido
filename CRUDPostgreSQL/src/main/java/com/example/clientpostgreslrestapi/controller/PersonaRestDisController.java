package com.example.clientpostgreslrestapi.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clientpostgreslrestapi.models.Persona;
import com.example.clientpostgreslrestapi.repository.PersonaRepo;
import com.util.LogDis;

@RestController
@RequestMapping("/personasDis")
public class PersonaRestDisController {
	

	@Autowired
	private PersonaRepo repo;

	@GetMapping
	public List<Persona> listar() {
		LogDis.info("listar Personas");
		return StreamSupport.stream(repo.findAll().spliterator(), false).collect(Collectors.toList());
	}

	@PostMapping
	public void insertar(@RequestBody Persona per) {
		LogDis.info("insertar persona " + per);
		repo.save(per);
	}

	@PutMapping
	public void modificar(@RequestBody Persona per) {
		LogDis.info("modificar persona " + per);
		repo.save(per);
	}

	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		LogDis.info("eliminar persona " + id);
		repo.deleteById(id);
	}

}
