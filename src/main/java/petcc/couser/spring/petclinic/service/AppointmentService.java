package petcc.couser.spring.petclinic.service;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import petcc.couser.spring.petclinic.model.Appointment;
import petcc.couser.spring.petclinic.model.Dono;
import petcc.couser.spring.petclinic.model.Pet;
import petcc.couser.spring.petclinic.model.Vet;
import petcc.couser.spring.petclinic.repository.AppointmentRepository;

import javax.validation.constraints.Null;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository repository;

    @Autowired
    private PetService petService;

    @Autowired
    private VetService vetService;

    public List<Appointment> findAllAppointment(){
        return repository.findAll();
    }

    public Optional<Appointment> findAppointmentById(Integer id){
        return repository.findById(id);
    }

    public List<Appointment> findAppointmentByStatus(String status){
        return repository.findAppointmentByStatus(status);
    }

    public List<Appointment> findAppointmentByDia(String dia){
        return repository.findAppointmentByDia(dia);
    }

    public List<Appointment> findAppointmentByPets(Integer id){
        Optional<Pet> pet = petService.findPetById(id);
        return pet.isPresent() ? repository.findAppointmentByPets(id) : null;
    }

    public Optional<Appointment> findAppointmentByIdAndVet(Integer consultaId, Integer vetId){
        return repository.findAppointmentByIdAndVet(consultaId, vetId);
    }

    public void saveAppointment(Appointment appointment){
        Optional<Vet> vet = vetService.findVetById(appointment.getVet().getId());
        Optional<Pet> pet = petService.findPetById(appointment.getPets().getId());
        if (vet.isPresent() && pet.isPresent()) {
            repository.save(appointment);
        }
    }

    public void deleteAppointmentById(Integer id){
        repository.deleteById(id);
    }

}
