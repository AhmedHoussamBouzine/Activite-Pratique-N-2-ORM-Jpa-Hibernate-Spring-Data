package com.ahmedhoussambouzine.ap2jpa.web;

import com.ahmedhoussambouzine.ap2jpa.entities.Patient;
import com.ahmedhoussambouzine.ap2jpa.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class PatientRestController {
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping ("/patients")
    public List<Patient> patients(){
        return patientRepository.findAll();
    }

    @GetMapping ("/patients/{id}")
    public Patient patient(@PathVariable Long id){
        return patientRepository.findById(id).get();
    }
}
