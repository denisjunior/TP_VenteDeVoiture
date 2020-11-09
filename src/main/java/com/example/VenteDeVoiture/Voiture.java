package com.example.VenteDeVoiture;


import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data

public class Voiture {
    @Id
    private int id;
    private String nameCar;
    @ManyToOne
    private Marque marque;
    @ManyToOne
    private Client client;

    public Voiture(){
    }
}
