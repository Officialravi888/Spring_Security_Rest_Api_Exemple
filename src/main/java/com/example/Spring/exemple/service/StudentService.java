package com.example.Spring.exemple.service;

import com.example.Spring.exemple.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
    public List<Student> getStudent();
    public void save(Student student);
    public Student findById(Integer Id);
    public void delete(Student student);

}
