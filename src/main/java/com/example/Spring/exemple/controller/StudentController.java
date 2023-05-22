package com.example.Spring.exemple.controller;

import com.example.Spring.exemple.model.Student;
import com.example.Spring.exemple.repository.StudentRepository;
import com.example.Spring.exemple.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/student")
    public List<Student> getStudent() {
        return studentService.getStudent();
    }

    @PostMapping("/student")
    public Student save(@RequestBody Student student) {
        studentService.save(student);
        return student;
    }

    @DeleteMapping("/student/{UserId}")
    public void delete(@PathVariable Student UserId) {
        studentService.delete(UserId);
    }



    @PutMapping("/student/{UserId}")
    public Student updateStudent(@RequestBody Student student, @PathVariable Student UserId ){
        Student student1 = studentService.findById(UserId.getUserId());
        student1.setName(student.getName());
        studentService.save(student1);
        return student1;
    }
}