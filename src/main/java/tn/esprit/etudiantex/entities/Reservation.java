package tn.esprit.etudiantex.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idR")
    private long idReservation;

    @Column(name = "aneeUniversitaire")
    private Date anneeUniversitaire;

    @Column(name = "isValide")
    private boolean estValide;

    @ManyToMany(mappedBy = "reservations")
    private List<Etudiant> etudiants;

}
