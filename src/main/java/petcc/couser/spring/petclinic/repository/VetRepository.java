package petcc.couser.spring.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import petcc.couser.spring.petclinic.model.Vet;

import java.util.List;
import java.util.Optional;

public interface VetRepository extends JpaRepository<Vet, Integer> {
    Optional<Vet> findVetByRegistro(Integer registro);
    List<Vet> findPersonByName(String name);
    Optional<Vet> findPersonByEmail(String email);
}
