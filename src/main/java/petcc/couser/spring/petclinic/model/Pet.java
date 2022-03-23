package petcc.couser.spring.petclinic.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    private String aniversario;

    @ManyToOne
    @NotNull
    private Dono dono;

    //Constructor

    public Pet(){
        this.name = "test";
        this.aniversario = "aniversario";
    }
    public Pet(Integer id, String name, String aniversario, Dono dono) {
        this.id = id;
        this.name = name;
        this.aniversario = aniversario;
        this.dono = dono;
    }
    public Pet(String name, String aniversario, Dono dono) {
        this.name = name;
        this.aniversario = aniversario;
        this.dono = dono;
    }


    //Getters & Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }
}
