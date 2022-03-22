package petcc.couser.spring.petclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import petcc.couser.spring.petclinic.model.Appointment;
import petcc.couser.spring.petclinic.service.AppointmentService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService service;

    @GetMapping
    public ResponseEntity<?> searchAppointment(){
        return ResponseEntity.ok(service.findAllAppointment());
    }

    @GetMapping(value = "/buscar/id/{id}")
    public ResponseEntity<?> searchAppointmentById(@PathVariable Integer id){
        return ResponseEntity.ok(service.findAppointmentById(id));
    }

    @PostMapping
    public ResponseEntity<?> saveAppointment(@RequestBody @Valid Appointment appointment){
        service.saveAppointment(appointment);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteAppointment(@PathVariable Integer id){
        service.deleteAppointmentById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

