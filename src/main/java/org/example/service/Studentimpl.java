package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.Student;
import org.example.entity.Studententity;
import org.example.repository.Studentrepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor

public class Studentimpl implements StudentService{
    final ModelMapper modelMapper;
    final Studentrepository studentrepository;

    @Override
    public List<Student> getAll() {
        List<Student> studentList=new ArrayList<>();
        List<Studententity>all=studentrepository.findAll();
        all.forEach(Studententity->{
            studentList.add(modelMapper.map(Studententity,Student.class));

        });
        return studentList;
    }

     @Override
        public String getVirion() {
        return "1.0.0V";
    }

    @Override
    public void addStudent(Student student) {
        studentrepository.save(modelMapper.map(student,Studententity.class));

    }

    @Override
    public Student searchByID(Integer id) {
        return modelMapper.map(studentrepository.findById(id),Student.class);
    }

    @Override
    public void updateStudent(Student student) {
        studentrepository.save(modelMapper.map(student,Studententity.class));

    }

    @Override
    public void deleteStident(Integer id) {
        studentrepository.deleteById(id);
    }
}
