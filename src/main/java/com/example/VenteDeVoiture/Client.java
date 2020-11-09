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

public class Client {
    @Id
    private int id;
    private String name;
    @OneToMany
    @JoinColumn(name = "client_id")
    @OrderBy("nameCar")
    private List<Voiture> voitures;
}
