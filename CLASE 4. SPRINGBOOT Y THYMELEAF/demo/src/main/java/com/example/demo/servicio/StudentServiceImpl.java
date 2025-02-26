package com.example.demo.servicio;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidad.Student;
import com.example.demo.repositorio.StudentRepository;
 @Service

public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository repo;

    @Override
    public Student SearchbyId(int id) {
        return repo.findById(id);
    }

    @Override
    public Collection<Student> SearchAll() {
        return repo.findAll();
    }
    
}
