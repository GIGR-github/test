package com.example.demo.controller;

import com.example.demo.dto.PersonSaveDto;
import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class LoginController {
    private final PersonRepository personRepository;

    @Autowired
    public LoginController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping("/save")
    void login(@RequestBody PersonSaveDto personSaveDto) {

        Person entity = new Person();
        entity.setName(personSaveDto.getName());
        entity.setAge(personSaveDto.getAge());
        personRepository.save(entity);

    }

    @GetMapping("/list")
    String getUsers() {
        return "All users from database";
    }

    @GetMapping("/delete")
    String delete() {
        return "Delete user";
    }

    void run(){
        System.out.println("from another comp");
    }

    void auth() {
        System.out.println("Auth user");
    }
}
