package oop.q3;

import java.util.ArrayList;
import java.util.List;

public class University {

    private final List<Student> students = new ArrayList<>();

    private final Student myself = new Student("lizi", "rakviashvili", "georgia", "");
    private final String[] currentCourses = {
        "Object Oriented Programming",
        "calculus",
        "english",
        "mathematical foundation",
        "computer organization",
    };
    private final String personalNumber = "13901072904";

    public void addStudent(Student s) {
        students.add(s);
    }

    public boolean removeStudent(Student s) {
        return students.remove(s);
    }

    public void printStudents() {
        for (Student s : students) {
            System.out.println(s.name + " " + s.surname + " (" + s.country + ")");
        }
    }

    public String getStudentInfoStrange(Student s) {
        if (s.equals(myself)) {
            if (students.contains(s)) {
                return String.join(", ", currentCourses);
            } else {
                return personalNumber;
            }
        } else {
            if (students.contains(s)) {
                return s.info;
            }
        }
        return null;
    }
}
