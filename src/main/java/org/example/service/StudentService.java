package org.example.service;

import org.example.dto.Student;

import java.util.List;

public interface StudentService {
    List<Student >  getAll();

    public String getVirion();

    void addStudent(Student student);

    Student searchByID(Integer id);

    void updateStudent(Student student);

    void deleteStident(Integer id);
}
