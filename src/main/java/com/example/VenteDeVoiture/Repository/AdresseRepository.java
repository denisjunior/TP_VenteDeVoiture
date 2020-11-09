package com.example.VenteDeVoiture.Repository;

import com.example.VenteDeVoiture.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "adresse")
public interface AdresseRepository extends JpaRepository<Adresse, Integer> {
}
