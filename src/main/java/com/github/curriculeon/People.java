package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements  Iterable <Person>{
  private  List <Person> personList;

  public People(){
      this.personList = new ArrayList<>();
  }


    @Override
    public Iterator<Person> iterator() {
        return null;
    }


    public void add(Person personObject){
        personList.add(personObject);
    }

    public  findById(long id ){
        for (Person person : personList) {
            if(person.getId() == id){
                return
            }
        }
    }
}


