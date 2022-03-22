package petcc.couser.spring.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import petcc.couser.spring.petclinic.model.Dono;

import java.util.List;


public interface DonoRepository extends JpaRepository<Dono, Integer> {
    List<Dono> findDonoByName(String name);
    List<Dono> findDonoByEmail(String email);
    List<Dono> findDonoByPhoneNumber(String phoneNumber);
    List<Dono> findDonoByAddress(String address);
}
