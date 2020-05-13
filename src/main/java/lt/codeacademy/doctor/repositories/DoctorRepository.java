package lt.codeacademy.doctor.repositories;

import lt.codeacademy.doctor.controller.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
