package com.example.demo.People;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Instructors extends People<Instructor>{

    public Instructors(Instructor... instructor){
        super(instructor);
    }

    @Override
    public Iterator<Instructor> iterator() {
        return super.findAll().iterator();
    }

    @Override
    public void forEach(Consumer<? super Instructor> action) {
        super.forEach(action);
    }

    @Override
    public Spliterator<Instructor> spliterator() {
        return super.spliterator();
    }

    @Override
    public String toString(){
        String output = "Students: ";
        for(Instructor i: super.findAll()){
            output += i;
        }
        return output;
    }
}
