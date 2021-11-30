package com.example.demo.student;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private long ID;
    private String name;

    @Transient
    private int age;
    private LocalDate DOB;
    private String email;

    public Student(long ID, String name, LocalDate DOB, String email) {
        this.ID = ID;
        this.name = name;
        this.DOB = DOB;
        this.email = email;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return Period.between(DOB, LocalDate.now()).getYears();
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public String getEmail() {
        return email;
    }

    public Student(){

    }

    public Student(String name, LocalDate DOB, String email) {
        this.ID = ID;
        this.name = name;
        this.DOB = DOB;
        this.email = email;
    }
}
