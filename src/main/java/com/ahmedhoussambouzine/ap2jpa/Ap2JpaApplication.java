package com.ahmedhoussambouzine.ap2jpa;

import com.ahmedhoussambouzine.ap2jpa.entities.*;
import com.ahmedhoussambouzine.ap2jpa.repository.MedecinRepository;
import com.ahmedhoussambouzine.ap2jpa.repository.PatientRepository;
import com.ahmedhoussambouzine.ap2jpa.repository.RendezVousRepository;
import com.ahmedhoussambouzine.ap2jpa.service.IHospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class Ap2JpaApplication {


    public static void main(String[] args) {
        SpringApplication.run(Ap2JpaApplication.class, args);
    }
    @Bean
    CommandLineRunner  start(IHospital HospitalService, PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository) {
        return args -> {
        Stream.of("houssam", "bouzine", "ahmed").
                forEach(name -> {
                    Patient patient = new Patient();
                    patient.setNom(name);
                    patient.setDateNaissance(new Date());
                    patient.setMalade(true);
                    HospitalService.savePatient(patient);
                    patientRepository.save(patient);
                });
        Patient patient = patientRepository.searchPatient(1);
        System.out.println(patient.toString());
    };
    }

}
