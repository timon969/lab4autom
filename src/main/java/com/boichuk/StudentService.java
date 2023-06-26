package com.boichuk;


import java.util.List;

public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getStudentByName(String name, String surname) {

        return studentRepository.getStudentByName(name, surname);
    }

    public List<Student> getStudent() {

        return studentRepository.getStudents();
    }

    public boolean addEmployee(Student student) {

        return studentRepository.addStudent(student);
    }

    public boolean removeStudent(Student student) {

        return studentRepository.removeStudent(student);
    }

    public boolean updateEmployee(Student student) {
        return studentRepository.updateStudent(student);
    }
}
