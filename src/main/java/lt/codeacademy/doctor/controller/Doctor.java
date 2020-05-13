package lt.codeacademy.doctor.controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Doctors")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "doctor_id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "region")
    private String region;
    @Column(name = "specialization")
    private String specialization;

}
