package id.ac.ui.cs.advprog.tutorial0.service;

import id.ac.ui.cs.advprog.tutorial0.exception.DuplicateCourseNameException;
import id.ac.ui.cs.advprog.tutorial0.model.Course;
import id.ac.ui.cs.advprog.tutorial0.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course create(Course course) {
        generateCourseId(course);
        validateCourseName(course);
        // TODO: boolean vacancy status
        courseRepository.create(course);
        return course;
    }

    private void validateCourseName(Course course) {
        List<Course> allCourses = findAll();
        for(Course dbCourse: allCourses) {
            if(dbCourse.getCourseName().equals(course.getCourseName())) {
                throw new DuplicateCourseNameException(course.getCourseName());
            }
        }
    }

    private void generateCourseId(Course course) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char letter: course.getCourseName().toCharArray()) {
            stringBuilder.append(String.valueOf((int)letter));
        }
        String npm = stringBuilder.toString();
        course.setCourseId(npm);
    }

    @Override
    public List<Course> findAll() {
        Iterator<Course> courseIterator = courseRepository.findAll();
        List<Course> allCourses = new ArrayList<>();
        courseIterator.forEachRemaining(allCourses::add);
        return allCourses;
    }
}