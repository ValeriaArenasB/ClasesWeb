package com.example.demo.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.servicio.StudentService;

@RequestMapping("/student")
@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

@GetMapping("/all")
    public String mostrarEstudiantes(Model model){
        model.addAttribute("estudiantes", studentService.SearchAll());
        return "mostrar_todos_estudiantes";

    }

    //http://localhost:8090/student/find1

@GetMapping("/find/{id}")
    public String mostrarInfoEstudiante(Model model, @PathVariable("id") int identificacion){
        model.addAttribute("estudiante", studentService.SearchbyId(identificacion));
        return "mostrar_estudiante";
 
    }
    
    //http://localhost:8090/student/find?id=1

@GetMapping("/find")
    public String mostrarInfoEstudiante2(Model model, @RequestParam("id") int identificacion){
        model.addAttribute("estudiante", studentService.SearchbyId(identificacion));
        return "mostrar_estudiante";
 
    }


    
}
