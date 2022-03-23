package petcc.couser.spring.petclinic.model;

import javax.persistence.*;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String status;

    private String dia;

    @ManyToOne
    private Pet pets;

    @ManyToOne
    private Vet vet;

    public Appointment(Integer id, String status, String dia, Pet pets, Vet vet) {
        this.id = id;
        this.status = "espera";
        this.dia = dia;
        this.pets = pets;
        this.vet = vet;
    }

    public Appointment(String status, String dia, Pet pets, Vet vet) {
        this.status = "espera";
        this.dia = dia;
        this.pets = pets;
        this.vet = vet;
    }

    public Appointment() {
        this.status = "espera";
        this.dia = "teste";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public Pet getPets() {
        return pets;
    }

    public void setPets(Pet pets) {
        this.pets = pets;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }
}
