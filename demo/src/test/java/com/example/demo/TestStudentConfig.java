package com.example.demo;

import com.example.demo.Conigurations.ClassroomConfig;
import com.example.demo.Conigurations.StudentConfig;
import com.example.demo.People.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class TestStudentConfig {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private StudentConfig studentConfig;

    @Test
    public void testCurrentStudents(){
        //Arrange
        for(Student s: studentConfig.currentStudents()){
            System.out.println(s);
        }
        //Action
        //Assert
    }
}
