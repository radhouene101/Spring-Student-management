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
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUniversite")
    private Integer idUniversite;
    @Column(name = "nomUniversite")
    private String nomUniversite;
    @Column(name = "adresse")
    private String adresse;
    @OneToOne(mappedBy = "universite")
    private Foyer foyer;
}
