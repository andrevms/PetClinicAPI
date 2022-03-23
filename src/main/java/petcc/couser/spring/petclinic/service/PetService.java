package petcc.couser.spring.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import petcc.couser.spring.petclinic.model.Dono;
import petcc.couser.spring.petclinic.model.Pet;
import petcc.couser.spring.petclinic.repository.PetRepository;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class PetService {

    @Autowired
    private PetRepository repository;

    @Autowired
    private DonoService donoService;

    public List<Pet> findAllPets(){
        return repository.findAll();
    }
    public Optional<Pet> findPetById(Integer id){
      return repository.findById(id);
    }

    public void savePet(Pet pet){
        Optional<Dono> dono = donoService.findDonoById(pet.getDono().getId());
        if (dono.isPresent()) {
            repository.save(pet);
        }
    }

    public void deletePetById(Integer id){
        repository.deleteById(id);
    }


}
