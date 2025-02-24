package org.example.controller;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.example.dto.Student;
import org.example.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Student")
@CrossOrigin
@RequiredArgsConstructor

public class StudentController {
    final StudentService studentService;

   @GetMapping("/get-All")
   public List<Student> getAll(){
       return studentService.getAll();


   }
   @GetMapping("/version")
    public String getVersion(){
       return studentService.getVirion();

   }
   @PostMapping("/add-student")
    public void addStudent(@RequestBody Student student){
       studentService.addStudent(student);
   }
   @GetMapping("/Search-by-id/{id}")
    public Student searchByID(@PathVariable Integer id){
      Student student=studentService.searchByID(id);
      return student;
   }
   @PostMapping("/Update-Student")
    public  void updateStudent(@RequestBody Student student){
       studentService.updateStudent(student);
   }

   @DeleteMapping("/Student-Delete/id}")
    public void deleteStudent( @PathVariable Integer id){
       studentService.deleteStident(id);


   }

}
