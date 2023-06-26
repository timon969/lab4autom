package com.boichuk;

import java.util.Objects;

public class Student {

    private String name;

    private String surname;

    private String university;

    private int yearOfStudying;

    public Student() {
    }

    public Student(String name, String surname, String university, int yearOfStudying) {
        this.name = name;
        this.surname = surname;
        this.university = university;
        this.yearOfStudying = yearOfStudying;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getYearOfStudying() {
        return yearOfStudying;
    }

    public void setYearOfStudying(int yearOfStudying) {
        this.yearOfStudying = yearOfStudying;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.yearOfStudying, yearOfStudying) == 0 && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(university, student.university);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, university, yearOfStudying);
    }
}
