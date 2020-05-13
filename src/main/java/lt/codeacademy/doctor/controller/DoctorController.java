package lt.codeacademy.doctor.controller;


import lt.codeacademy.doctor.services.DoctorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/doctors")
public class DoctorController {

    private DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }


    @GetMapping("/product")
    public String createDoctorForm(Model model) {
        model.addAttribute("product", new Doctor());
        return "doctorform";
    }

    @GetMapping
    public String getAllDoctors(Model model){
        List<Doctor> doctors = doctorService.getAllDoctors();
        model.addAttribute("doctors", doctors);
        return "doctorlist";
    }


}
