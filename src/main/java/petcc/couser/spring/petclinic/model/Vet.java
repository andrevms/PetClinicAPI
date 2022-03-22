package petcc.couser.spring.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Vet extends Person{

    @NotNull
    @Column(unique = true)
    private String registro;

    public Vet(String name, String email, String registro) {
        super(name, email);
        this.registro = registro;
    }

    public Vet() {
        super();
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
}
