package petcc.couser.spring.petclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import petcc.couser.spring.petclinic.model.Pet;
import petcc.couser.spring.petclinic.model.Vet;
import petcc.couser.spring.petclinic.service.VetService;

import javax.validation.Valid;
import javax.xml.ws.Response;

@RestController
@RequestMapping(value = "/vet")
public class VetController {

    @Autowired
    private VetService service;

    @GetMapping
    public ResponseEntity<?> searchVets(){
        return ResponseEntity.ok(service.findAllVet());
    }

    @GetMapping(value = "/buscar/id/{id}")
    public ResponseEntity<?> searchVetById(@PathVariable Integer id){
        return ResponseEntity.ok(service.findVetById(id));
    }

    @GetMapping(value = "/buscar/nome/{nome}")
    public ResponseEntity<?> searchVetByName(@PathVariable String nome){
        return ResponseEntity.ok(service.findVByName(nome));
    }

    @GetMapping(value = "/buscar/registro/{registro}")
    public ResponseEntity<?> searchVetByRegistro(@PathVariable Integer registro){
        return ResponseEntity.ok(service.findVetByRegistro(registro));
    }

    @PostMapping
    public ResponseEntity<?> saveVet(@RequestBody @Valid Vet vet){
        service.saveVet(vet);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deletePet(@PathVariable Integer id){
        service.deleteVetById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
