package tn.esprit.etudiantex.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFoyer")
    private long idFoyer;
    @Column(name = "nomFoyer")
    private String nomFoyer;
    @Column(name = "capaciteFoyer")
    private long capaciteFoyer;
    @OneToMany
    private List<Bloc> blocs;
    @OneToOne
    private Universite universite;
}
