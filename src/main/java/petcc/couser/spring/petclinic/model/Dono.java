package petcc.couser.spring.petclinic.model;

import io.swagger.models.auth.In;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Dono extends Person{

    @NotNull
    private String phoneNumber;
    @NotNull
    private String address;

    public Dono(String name, String email, String phoneNumber, String address) {
        super(name, email);
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Dono(Integer id, String name, String email, String phoneNumber, String address) {
        super(id, name, email);
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Dono() {
        super();
        this.address = "testAddress";
        this.phoneNumber = "testPhone";
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
