package com.boichuk;

import com.boichuk.Student;
import com.boichuk.StudentRepository;
import com.boichuk.StudentService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {

    private List<Student> students;
    private StudentRepository studentRepository;
    private StudentService studentService;


    @BeforeEach
    public void init() {

        Student employee1 = new Student("John0", "Smith0", "Developer", 1000);
        Student employee2 = new Student("John1", "Smith1", "Developer", 1000);
        Student employee3 = new Student("John2", "Smith2", "Developer", 1000);
        Student employee4 = new Student("John3", "Smith3", "Developer", 1000);
        Student employee5 = new Student("John4", "Smith4", "Developer", 1000);
        Student employee6 = new Student("John5", "Smith5", "Developer", 1000);
        Student employee7 = new Student("John6", "Smith6", "Developer", 1000);
        Student employee8 = new Student("John7", "Smith7", "Developer", 1000);
        students = new ArrayList<>(List.of(
                employee1,  employee2,  employee3,  employee4, employee5,  employee6,  employee7,  employee8
        ));
        studentRepository = new StudentRepository(students);
        studentService = new StudentService(studentRepository);
    }

    @Test
    public void getByNameFromRepository() {
        Student student = new Student("John", "Smith", "Developer", 1000);
            studentRepository.addStudent(student);
        Student found = studentRepository.getStudentByName("John", "Smith");
        Assertions.assertEquals(student, found);
    }

    @Test
    public void getByNameFromService() {
        Student student = new Student("John", "Smith", "Developer", 1000);
        studentRepository.addStudent(student);
        Student found = studentService.getStudentByName("John","Smith");
        Assertions.assertEquals(student, found);
    }

    @Test
    public void removeEmployeeFromRepository() {
        Student student = new Student("John", "Smith", "Developer", 1000);
        studentRepository.addStudent(student);
        Assertions.assertTrue(studentRepository.removeStudent(student));
        Assertions.assertNull(studentRepository.getStudentByName("John", "Smith"));
    }

   /* @Test
    public void removeEmployeeFromService() {
        Student employee = new Employee("John", "Smith", "Developer", 1000);
        employeeRepository.addEmployee(employee);
        Assertions.assertTrue(employeeService.removeEmployee(employee));
        Assertions.assertNull(employeeService.getEmployeeByName("John"));
    }

    @Test
    public void updateEmployeeFromRepository() {
        Employee employee = new Employee("John", "Smith", "Developer", 1000);
        employeeRepository.addEmployee(employee);
        Employee employee1 = new Employee("John", "Smith", "Developer", 2000);
        Assertions.assertTrue(employeeRepository.updateEmployee(employee1));
        Assertions.assertEquals(employee1, employeeRepository.getEmployeeByName("John"));
    }

    @Test
    public void updateEmployeeFromService() {
        Employee employee = new Employee("John", "Smith", "Developer", 1000);
        employeeRepository.addEmployee(employee);
        Employee employee1 = new Employee("John", "Smith", "Developer", 2000);
        Assertions.assertTrue(employeeService.updateEmployee(employee1));
        Assertions.assertEquals(employee1, employeeService.getEmployeeByName("John"));
    }*/


}
