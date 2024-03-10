package com.ahmedhoussambouzine.ap2jpa.service;

import com.ahmedhoussambouzine.ap2jpa.entities.Consultation;
import com.ahmedhoussambouzine.ap2jpa.entities.Medecin;
import com.ahmedhoussambouzine.ap2jpa.entities.Patient;
import com.ahmedhoussambouzine.ap2jpa.entities.RendezVous;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
@Service
@Transactional
public class IHospitalImpl  implements IHospital{
    @Override
    public Patient savePatient(Patient p) {
        return null;
    }

    @Override
    public Medecin saveMedecin(Medecin m) {
        return null;
    }

    @Override
    public RendezVous saveRendezVous(RendezVous r) {
        return null;
    }

    @Override
    public Consultation saveConsultation(Consultation c) {
        return null;
    }
}
