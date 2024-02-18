package tn.esprit.etudiantex.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBloc")
    private long idBloc;
    @Column(name = "nomBloc")
    private String nomBloc;
    @Column(name = "capaciteBloc")
    private long capaciteBloc;
}
