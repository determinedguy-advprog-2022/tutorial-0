package id.ac.ui.cs.advprog.tutorial0.service;

import id.ac.ui.cs.advprog.tutorial0.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MockStudentServiceImpl implements StudentService{

    @Override
    public Student create(Student student) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }
}
