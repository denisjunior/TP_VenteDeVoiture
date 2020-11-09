package com.example.VenteDeVoiture.Repository;

import com.example.VenteDeVoiture.Marque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "marque")
public interface MarqueRepository extends JpaRepository<Marque, Integer> {
}
