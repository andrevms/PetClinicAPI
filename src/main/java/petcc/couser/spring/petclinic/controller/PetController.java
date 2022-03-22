package petcc.couser.spring.petclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import petcc.couser.spring.petclinic.model.Pet;
import petcc.couser.spring.petclinic.service.PetService;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/pet")
public class PetController {

    @Autowired
    private PetService service;

    @GetMapping
    public ResponseEntity<?> searchPets(){
        return ResponseEntity.ok(service.findAllPets());
    }

    @GetMapping(value = "/buscar/id/{id}")
    public ResponseEntity<?> searchPetsById(@PathVariable Integer id){
       return ResponseEntity.ok(service.findPetById(id));
    }

    @GetMapping(value = "/buscar/nome/{nome}")
    public ResponseEntity<?> searchPetsById(@PathVariable String nome){
        return ResponseEntity.ok(service.findAllPets());
    }

    @PostMapping
    public ResponseEntity<?> savePet(@RequestBody @Valid Pet pet){
        service.savePet(pet);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> deletePet(@PathVariable Integer id){
        service.deletePetById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
