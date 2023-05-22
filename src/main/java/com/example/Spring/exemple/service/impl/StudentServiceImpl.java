package com.example.Spring.exemple.service.impl;
import com.example.Spring.exemple.model.Student;
import com.example.Spring.exemple.repository.StudentRepository;
import com.example.Spring.exemple.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }
    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }
    @Override
    public Student findById(Integer Id) {
        Optional<Student> studentResult= studentRepository.findById(Id);
        Student student=null;
        if (studentResult.isPresent()){
            student=studentResult.get();
        }
        return student;
    }
    @Override
    public void delete(Student student) {
    studentRepository.delete(student);
    }
}
