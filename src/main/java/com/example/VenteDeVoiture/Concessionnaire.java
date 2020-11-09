package com.example.VenteDeVoiture;

import lombok.Data;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import java.util.List;
import java.util.Set;

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

    @ManyToMany(cascade = CascadeType.DETACH)
    @JoinTable(name = "Type",joinColumns = @JoinColumn(name = "conce_id"), inverseJoinColumns = @JoinColumn(name = "marque_id"))
    Set<Marque> typeMarque;
}
