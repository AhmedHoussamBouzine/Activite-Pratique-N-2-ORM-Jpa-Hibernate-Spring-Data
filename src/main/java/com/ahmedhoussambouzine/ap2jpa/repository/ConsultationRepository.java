package com.ahmedhoussambouzine.ap2jpa.repository;

import com.ahmedhoussambouzine.ap2jpa.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository  extends JpaRepository<Consultation, Long> {}