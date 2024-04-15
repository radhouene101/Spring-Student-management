package tn.esprit.etudiantex.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBloc")
    private Integer idBloc;
    @Column(name = "nomBloc")
    private String nomBloc;
    @Column(name = "capaciteBloc")
    private long capaciteBloc;
    @OneToMany(mappedBy = "bloc")
    private List<Chambre> chambres;
    @ManyToOne
    private Foyer foyer;
}
