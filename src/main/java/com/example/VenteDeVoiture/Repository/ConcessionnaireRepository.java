package com.example.VenteDeVoiture.Repository;

import com.example.VenteDeVoiture.Concessionnaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "concessionnaire")
public interface ConcessionnaireRepository extends JpaRepository<Concessionnaire, Integer> {
}
