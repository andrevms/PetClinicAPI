package petcc.couser.spring.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import petcc.couser.spring.petclinic.model.Appointment;
import petcc.couser.spring.petclinic.model.Pet;
import petcc.couser.spring.petclinic.model.Vet;
import petcc.couser.spring.petclinic.repository.VetRepository;

import java.util.List;
import java.util.Optional;
@Service
public class VetService{

    @Autowired
    private VetRepository repository;

    @Autowired
    private AppointmentService appointmentService;

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

    public void aceitarConsulta(Integer consultaId, Integer vetId ){
        Optional<Appointment> consulta = appointmentService.findAppointmentByIdAndVet(consultaId,vetId);
        if (consulta.isPresent()){
            consulta.get().setStatus("aceita");
        }
        appointmentService.saveAppointment(consulta.get());
    }

    public void recusarConsulta(Integer consultaId, Integer vetId ){
        Optional<Appointment> consulta = appointmentService.findAppointmentByIdAndVet(consultaId,vetId);
        if (consulta.isPresent()){
            consulta.get().setStatus("recusar");
        }
        appointmentService.saveAppointment(consulta.get());
    }
}
