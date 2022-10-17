package org.example.repository;


import org.example.entity.Student;

public interface StudentRepository {
    Student findById(Long id);

}
