package petcc.couser.spring.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import petcc.couser.spring.petclinic.model.Appointment;

import java.util.List;
import java.util.Optional;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
    List<Appointment> findAppointmentByStatus(String status);
    List<Appointment> findAppointmentByDia(String dia);
    List<Appointment> findAppointmentByPets(Integer id);
    Optional<Appointment> findAppointmentByIdAndVet(Integer idConsulta, Integer idVet);
}
