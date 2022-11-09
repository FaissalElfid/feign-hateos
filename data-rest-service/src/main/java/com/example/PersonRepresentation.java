package com.example;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.hateoas.EntityModel;
//import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/test")
public class PersonRepresentation {
    @Autowired
    private PersonRepository personRepository;

//    @GetMapping("/{id}")
//    public EntityModel<Person> retrievePerson(@PathVariable("id") long id) {
//        Optional<Person> Person = personRepository.findById(id);
//
//        if (!Person.isPresent()) System.out.println("person not found");;
//
//        EntityModel<Person> resource = EntityModel.of(Person.get());
//
//        WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllPersons());
//
//        resource.add(linkTo.withRel("all-Persons"));
//
//        return resource;
//    }
//    @GetMapping("/person/{id}")
//    public Person getPersonById(@PathVariable("id") long id) {
//        return personRepository.findById(id).get();
//    }
//    @GetMapping("/")
//    public EntityModel<String> retrieveAllPersons() {
//        return EntityModel.of("hello world !!");
//    }
}
