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
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idChambre")
    private long idChambre;
    @Column(name = "numeroChambre")
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre TypeC;
    @ManyToOne
    private Bloc bloc;

    @OneToMany
    private List<Reservation> reservations;
}
