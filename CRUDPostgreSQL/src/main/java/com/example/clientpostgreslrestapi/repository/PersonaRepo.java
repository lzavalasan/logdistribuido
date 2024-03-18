package com.example.clientpostgreslrestapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.clientpostgreslrestapi.models.Persona;

public interface PersonaRepo extends CrudRepository<Persona,Integer> {
    
}
