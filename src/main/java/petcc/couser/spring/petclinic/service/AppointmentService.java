package petcc.couser.spring.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import petcc.couser.spring.petclinic.model.Appointment;
import petcc.couser.spring.petclinic.model.Vet;
import petcc.couser.spring.petclinic.repository.AppointmentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository repository;

    public List<Appointment> findAllAppointment(){
        return repository.findAll();
    }

    public Optional<Appointment> findAppointmentById(Integer id){
        return repository.findById(id);
    }

    public List<Appointment> findAppointmentByStatus(Boolean bool){
        return repository.findAppointmentByStatus(bool);
    }

    public List<Appointment> findAppointmentByDia(String dia){
        return repository.findAppointmentByDia(dia);
    }

    public void saveAppointment(Appointment appointment){
        repository.save(appointment);
    }

    public void deleteAppointmentById(Integer id){
        repository.deleteById(id);
    }

}
