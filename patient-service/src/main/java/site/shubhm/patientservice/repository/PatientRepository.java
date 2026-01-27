package site.shubhm.patientservice.repository;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import site.shubhm.patientservice.model.Patient;

import java.util.UUID;

@Repository
public interface  PatientRepository extends JpaRepository<Patient, UUID> {

    boolean existsByEmail(String email);
    boolean existsByEmailAndIdNot(String email, UUID id);
}
