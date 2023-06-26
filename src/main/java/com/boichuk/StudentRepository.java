package com.boichuk;



import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private List<Student> students;

    public StudentRepository(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudentByName(String name, String surname) {
        for (Student student : students) {
            if (student.getName().equals(name) && student.getSurname().equals(surname)) {
                return student;
            }
        }
        return null;
    }

    public boolean addStudent(Student student) {

        return students.add(student);
    }

    public boolean removeStudent(Student student) {

        return students.remove(student);
    }

    public boolean updateStudent(Student student) {
        for (Student student1 : students) {
            if (student1.getName().equals(student.getName()) && student1.getSurname().equals(student.getSurname()) ){
                student1.setUniversity(student.getUniversity());
                student1.setYearOfStudying(student.getYearOfStudying());
                return true;
            }
        }
        return false;
    }
}
