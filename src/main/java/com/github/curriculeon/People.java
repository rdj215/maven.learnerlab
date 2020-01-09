package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class People implements Iterable<Person> {
    private List<Person> personList;

    public People() {
        this.personList = new ArrayList<>();
    }



    public void add(Person personObject) {
        personList.add(personObject);
    }


    public List<Person> findById(long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                return personList;
            }
        }
        return personList;

    }

    public void remove(long id) {

        for (Person person : personList) {
            if (person.getId() == id) {
             personList.remove(person);
                System.out.println(personList);
//

            }

        }

    }

    public void removeAll() {
        personList.clear();
        ;
    }

    public int count() {
        return personList.size();

    }

    public Person[] toArray() {
        return (Person[]) personList.toArray();
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}


