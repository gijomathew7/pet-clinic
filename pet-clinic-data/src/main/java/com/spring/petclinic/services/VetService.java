package com.spring.petclinic.services;

import com.spring.petclinic.model.Pet;
import com.spring.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
