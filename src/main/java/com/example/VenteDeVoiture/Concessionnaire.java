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
public class Concessionnaire {
    @Id
    private int id;
    private String nameConce;
    @OneToMany
    @JoinColumn(name = "conce_id")
    @OrderBy("LibelleAdresse")
    private List<Adresse> adresses;
}
