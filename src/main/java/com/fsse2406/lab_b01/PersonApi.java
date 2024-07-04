package com.fsse2406.lab_b01;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonApi {
    List<Person> people = new ArrayList<>();


    @PostMapping("/person/create")
    public Person createPerson (@RequestBody Person createPerson){
        people.add(createPerson);
        return createPerson;
    }

    @GetMapping("/person/all")
    public List<Person> getAllPeople (){
        return people;
    }

    @PutMapping("/person/update")
    public Person updatePerson (@RequestBody Person updatePerson){
//        for (int i=0 ; i< people.size();i++){
//            if(people.get(i).getHkid().equals(updatePerson.getHkid())){
//                people.set(i, updatePerson);
//                return ResponseEntity.ok(people.get(i));
//            }
//        }

        for(Person person: people){
            if(person.getHkid().equals(updatePerson.getHkid())){
                person.setFirstName(updatePerson.getFirstName());
                person.setLastName(updatePerson.getLastName());
                return person;
            }
        }
        throw new PersonNotFoundException();
    }

    @DeleteMapping("/person/delete")
    public ResponseEntity<Person> deletePerson (@RequestParam String hkid){
//        for (int i=0 ; i< people.size();i++){
//            if(people.get(i).getHkid().equals(hkid)){
//                Person removePerson = people.get(i);
//                people.remove(i);
//                return ResponseEntity.ok(removePerson);
//            }
//        }

        for (Person person: people){
            if(person.getHkid().equals(hkid)){
                people.remove(person);
                return ResponseEntity.ok(person);
            }
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
