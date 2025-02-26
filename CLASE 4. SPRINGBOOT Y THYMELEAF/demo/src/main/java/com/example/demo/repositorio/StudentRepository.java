package com.example.demo.repositorio;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.demo.entidad.Student;

@Repository
public class StudentRepository {
    private Map<Integer, Student> data = new HashMap<>();
    public StudentRepository(){
        data.put(1, new Student("Juan", "Ing. en Sistemas", 5, "hLb8y@example.com"));
        data.put(2, new Student("Carla", "Ing. en Sistemas", 7, "8b6M8@example.com"));
        data.put(3, new Student("Pedro", "Ing. en Sistemas", 9, "3gM7v@example.com"));
        data.put(4, new Student("Ana", "Ing. en Sistemas", 3, "h8b6M8@example.com"));
    }


    public Student findById(int id){
        return data.get(id);
    }


    public Collection<Student> findAll(){
        return data.values();
    }

}
