package petcc.couser.spring.petclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import petcc.couser.spring.petclinic.model.Dono;
import petcc.couser.spring.petclinic.service.DonoService;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/dono")
public class DonoController {

    @Autowired
    private DonoService service;

    @GetMapping
    public ResponseEntity<?> searchDono() {
        return ResponseEntity.ok(service.findAllDono());
    }

    @GetMapping(value = "/buscar/id/{id}")
    public ResponseEntity<?> searchDonoById(@PathVariable Integer id){
        return ResponseEntity.ok(service.findDonoById(id));
    }

    @GetMapping(value = "/buscar/nome/{name}")
    public ResponseEntity<?> searchDonoByName(@PathVariable String name){
        return ResponseEntity.ok(service.findDonoByName(name));
    }

    @GetMapping(value = "/buscar/email/{email}")
    public ResponseEntity<?> searchDonoByEmail(@PathVariable String email){
        return ResponseEntity.ok(service.findDonoByEmail(email));
    }

    @GetMapping(value = "/buscar/phone_number/{phone_number}")
    public ResponseEntity<?> searchDonoByPhoneNumber(@PathVariable String phone_number){
        return ResponseEntity.ok(service.findDonoByPhoneNumber(phone_number));
    }

    @GetMapping(value = "/buscar/address/{address}")
    public ResponseEntity<?> searchDonoByAddress(@PathVariable String address){
        return ResponseEntity.ok(service.findDonoByAddress(address));
    }

    @PostMapping
    public ResponseEntity<?> saveDono(@RequestBody @Valid Dono dono){
        service.saveDono(dono);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deleteDono(@PathVariable Integer id){
        service.deleteDonoById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
