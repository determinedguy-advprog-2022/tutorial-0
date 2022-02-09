package id.ac.ui.cs.advprog.tutorial0.repository;

import id.ac.ui.cs.advprog.tutorial0.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Repository
public class StudentRepository {

    private List<Student> studentsInMemory = new ArrayList<>();

    public Student create(Student student) {
        studentsInMemory.add(student);
        return student;
    }

    public Iterator<Student> findAll() {
        return studentsInMemory.iterator();
    }
}
