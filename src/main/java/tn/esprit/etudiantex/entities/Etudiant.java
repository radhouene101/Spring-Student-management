package tn.esprit.etudiantex.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEtudiant")
    private long idEtudiant;
    @Column(name = "nomEtudiant")
    private String nomEt;
    @Column(name="prenomEt")
    private String prenomEt;
    @Column(name = "CIN")
    private long cin;
    @Column(name = "Ecole")
    private String ecole;
    @Column(name = "dateNaissance")
    private Date dateNaissance;
}
