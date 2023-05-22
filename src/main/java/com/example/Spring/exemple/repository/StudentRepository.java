package com.example.Spring.exemple.repository;

import com.example.Spring.exemple.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student save(Student student);
    void delete(Student UserId);
}
