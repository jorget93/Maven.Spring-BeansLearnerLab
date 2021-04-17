package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public abstract class People <PersonType extends Person> implements Iterable <PersonType>{

    private List<PersonType> personList;

    public People(List<PersonType> list){
        this.personList = list;
    }

    public People(PersonType... person){
        personList = new ArrayList<>();
        personList.addAll(Arrays.asList(person));
    }

    public void add(PersonType p) { personList.add(p); }

    public void remove(PersonType p) { personList.remove(p); }

    public int size(){ return personList.size(); }

    public void clear(){ personList.removeAll(personList); }

    public void addAll(Iterable<? extends PersonType> types){
        for(PersonType p: types){ personList.add(p); }
    }

    public PersonType findById(long id){
        for(PersonType p: personList){
            if(p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public List<PersonType> findAll(){
        return personList;
    }
}
