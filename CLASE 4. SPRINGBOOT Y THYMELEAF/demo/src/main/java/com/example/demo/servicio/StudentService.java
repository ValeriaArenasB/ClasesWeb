package com.example.demo.servicio;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.example.demo.entidad.Student;


public interface StudentService { // NO es una clase es una interfaz

    public Student SearchbyId(int id);


    public Collection<Student> SearchAll();
}
