package petcc.couser.spring.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import petcc.couser.spring.petclinic.model.Dono;
import petcc.couser.spring.petclinic.repository.DonoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DonoService {

    @Autowired
    private DonoRepository repository;


    public List<Dono> findAllDono(){
        return repository.findAll();
    }

    public Optional<Dono> findDonoById(Integer id){
        return repository.findById(id);
    }

    public List<Dono> findDonoByName(String name){
        return repository.findDonoByName(name);
    }

    public List<Dono> findDonoByEmail(String email){
        return repository.findDonoByEmail(email);
    }

    public List<Dono> findDonoByPhoneNumber(String phone_number){
        return repository.findDonoByPhoneNumber(phone_number);
    }

    public List<Dono> findDonoByAddress(String address){
        return repository.findDonoByAddress(address);
    }

    public void saveDono(Dono dono){
        repository.save(dono);
    }

    public void deleteDonoById(Integer id){
        repository.deleteById(id);
    }
}
