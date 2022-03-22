package petcc.couser.spring.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import petcc.couser.spring.petclinic.model.Appointment;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
    List<Appointment> findAppointmentByStatus(Boolean bool);
    List<Appointment> findAppointmentByDia(String dia);
}
