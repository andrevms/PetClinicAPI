package petcc.couser.spring.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import petcc.couser.spring.petclinic.model.Vet;
import petcc.couser.spring.petclinic.repository.VetRepository;

import java.util.List;
import java.util.Optional;
@Service
public class VetService{

    @Autowired
    private VetRepository repository;

    public Optional<Vet> findVetByRegistro(Integer registro){
        return repository.findVetByRegistro(registro);
    }

    public List<Vet> findAllVet(){
        return repository.findAll();
    }

    public Optional<Vet> findVetById(Integer id){
        return repository.findById(id);
    }

    public List<Vet> findVByName(String name){
        return repository.findPersonByName(name);
    }

    public Optional<Vet> findVetByEmail(String email){
        return repository.findPersonByEmail(email);
    }

    public void saveVet(Vet vet){
        repository.save(vet);
    }

    public void deleteVetById(Integer id){
        repository.deleteById(id);
    }
}
