package com.example.VenteDeVoiture.Repository;

import com.example.VenteDeVoiture.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "voiture")
public interface VoitureRepository extends JpaRepository<Voiture, Integer> {
}
