package com.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "api", url = "http://localhost:8080")
public interface PersonClient {
    @RequestMapping(method = RequestMethod.GET, value = "/persons")
    CollectionModel<Person> getPersons();

    @RequestMapping(method = RequestMethod.GET, value = "/persons/{id}")
    EntityModel<Person> getPerson(@PathVariable("id") long id);
}
