package com.example.VenteDeVoiture;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import java.util.List;

@Entity
@Data

public class Marque {
    @Id
    private int id;
    private String nameMarque;
    @OneToMany
    @JoinColumn(name = "marque_id")
    @OrderBy("nameCar")
    private List<Voiture> voitures;
}
