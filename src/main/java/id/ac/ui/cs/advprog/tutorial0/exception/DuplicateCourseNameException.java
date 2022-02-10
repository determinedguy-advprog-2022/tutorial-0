package id.ac.ui.cs.advprog.tutorial0.exception;

public class DuplicateCourseNameException extends RuntimeException {

    public DuplicateCourseNameException(String courseName) {
        super(String.format("The course name %s is a duplicate!", courseName));
    }
}
