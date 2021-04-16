package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public abstract class People <PersonType extends Person> implements Iterable <PersonType>{

    private List<Person> personList = new ArrayList<>();

    public People(List<Person> list){
        this.personList = list;
    }



}
