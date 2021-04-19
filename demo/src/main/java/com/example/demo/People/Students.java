package com.example.demo.People;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Students extends People<Student> {

    public Students(Student... student){
        super(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return super.findAll().iterator();
    }

    @Override
    public void forEach(Consumer<? super Student> action) {
        super.forEach(action);
    }

    @Override
    public Spliterator<Student> spliterator() {
        return super.spliterator();
    }

    @Override
    public String toString(){
        String output = "Students: ";
        for(Student s: super.findAll()){
            output += s;
        }
        return output;
    }
}
