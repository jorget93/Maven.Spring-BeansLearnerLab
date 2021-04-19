package com.example.demo.Conigurations;

import com.example.demo.People.Classroom;
import com.example.demo.People.Instructors;
import com.example.demo.People.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean("currentCohort")
    public Classroom currentCohort(Instructors instructors, Students students){
        return new Classroom(instructors, students);
    }

    @Bean("previousStudents")
    @DependsOn
    public Classroom previousCohort(Instructors instructors, Students previousStudents){
        return new Classroom( instructors, previousStudents);
    }
}
