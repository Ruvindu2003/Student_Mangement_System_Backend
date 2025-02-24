package org.example.service;

import org.example.dto.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public class StudentServiceVerion2 implements StudentService{
    @Override
    public List<Student> getAll() {
        return List.of();
    }

    @Override
    public String getVirion() {
        return "2.0.0V";
    }

    @Override
    public void addStudent(Student student) {


    }

    @Override
    public Student searchByID(Integer id) {
        return null;
    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public void deleteStident(Integer id) {

    }
}
