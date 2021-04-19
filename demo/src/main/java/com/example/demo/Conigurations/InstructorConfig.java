package com.example.demo.Conigurations;

import com.example.demo.People.Instructor;
import com.example.demo.People.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InstructorConfig {

    @Bean
    public Instructors tcUsaInstructors(){
        Instructor mathew = new Instructor(1L, "Matthew Laudon");
        Instructor bart = new Instructor(2L, "Bart Romanowicz");
        Instructor sarah = new Instructor(3L, "Sarah Wenning");
        Instructor jennifer = new Instructor(4L, "Jennifer Rocha");
        Instructor christopher = new Instructor(5L, "Christopher Erb");
        Instructor richard = new Instructor(6L, "Richard Erb");
        Instructor denise = new Instructor(7L, "Denise Lee");
        Instructor regina = new Instructor(8L, "Regina Remazzini");
        Instructor laura = new Instructor(9L, "Laura Benold");
        Instructor chelsea = new Instructor(10L, "Chelsea Collier");
        Instructor derek = new Instructor(11L, "Derek Mayer");
        Instructor nick = new Instructor(12L, "Nick Kacsandi");
        Instructor tara = new Instructor(13L, "Tara Luddy-Cotia");
        Instructor susan = new Instructor(14L, "Susan Stewart Morgan");
        Instructor dalia = new Instructor(15L, "Dalia Yablon");
        return new Instructors(mathew,bart,sarah,jennifer,christopher,richard,
                denise,regina,laura,chelsea,derek,nick,tara,susan,dalia);
    }


}
