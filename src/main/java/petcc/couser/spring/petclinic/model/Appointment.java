package petcc.couser.spring.petclinic.model;

import javax.persistence.*;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Boolean status;

    private String dia;

    @ManyToOne
    private Pet pets;

    @ManyToOne
    private Vet vet;
}
