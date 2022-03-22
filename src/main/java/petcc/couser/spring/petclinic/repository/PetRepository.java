package petcc.couser.spring.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import petcc.couser.spring.petclinic.model.Pet;

import java.util.List;
import java.util.Optional;

public interface PetRepository extends JpaRepository<Pet, Integer> {

    Optional<Pet> findPetById(Integer id);
}
