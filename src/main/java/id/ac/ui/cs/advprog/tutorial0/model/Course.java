package id.ac.ui.cs.advprog.tutorial0.model;

import lombok.Getter;
import lombok.Setter;

/*
 [Course]
 courseId - auto-generated - ASCII value of each course' name
 courseName - character
 vacancyStatus - boolean default true
 */

@Getter @Setter
public class Course {
    private String courseId;
    private String courseName;
    private boolean vacancyStatus = true;
}
