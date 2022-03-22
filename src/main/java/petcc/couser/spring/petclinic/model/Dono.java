package petcc.couser.spring.petclinic.model;

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

    public Dono() {
        super();
    }

    public String getPhone_number() {
        return phoneNumber;
    }

    public void setPhone_number(String phone_number) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
