package com.ahmedhoussambouzine.ap2jpa.service;

import com.ahmedhoussambouzine.ap2jpa.entities.Consultation;
import com.ahmedhoussambouzine.ap2jpa.entities.Medecin;
import com.ahmedhoussambouzine.ap2jpa.entities.Patient;
import com.ahmedhoussambouzine.ap2jpa.entities.RendezVous;

public interface IHospital {
    Patient savePatient(Patient p);
    Medecin saveMedecin(Medecin m);
    RendezVous saveRendezVous(RendezVous r);
    Consultation saveConsultation(Consultation c);
}
