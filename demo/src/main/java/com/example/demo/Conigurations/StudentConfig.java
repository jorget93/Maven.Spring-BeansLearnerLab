package com.example.demo.Conigurations;

import com.example.demo.People.Student;
import com.example.demo.People.Students;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents(){

        Student jorge = new Student(1L, "Jorge");
        Student greg = new Student(2L, "Greg");
        Student kelly = new Student(3L, "Kelly");
        Student chris = new Student(4L, "Chris");
        Student ryan = new Student( 5L, "Ryan");
        Student theresa = new Student(6L, "Theresa");
        Student ashley = new Student(7L, "Ashley");
        Student monali = new Student(8L, "Monali");
        Student justin = new Student(9L, "Justin");
        Student lena = new Student(10L, "Lena");
        Student xiong = new Student(11L, "Xiong");
        Student mike = new Student(12L, "Mike");
        Student hazel = new Student(13L, "Hazel");
        Student abe = new Student(14L, "Abe");

        return new Students(jorge, greg, kelly, chris, ryan, theresa,
                ashley, monali, justin, lena, xiong, mike, hazel, abe);
    }

    public Students previousStudents(){

        Student josh = new Student(1L, "Josh");
        Student jack = new Student( 2L, "Jack");
        Student eric = new Student(3L, "Eric");
        Student chung = new Student(4L, "Chung");
        Student alex = new Student(5L, "Alex");
        Student han = new Student(6L, "Han");

        return new Students(josh, jack, eric, chung, alex, han);
    }
}
