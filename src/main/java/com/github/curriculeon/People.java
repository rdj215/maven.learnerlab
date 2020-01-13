package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public abstract class People <E> implements Iterable<Person> {
    private List<Person> personList;

    public <E> People () {
        this.personList = new ArrayList<>();
    }



    public <E> void add( Person personObject) {
        personList.add(personObject);
    }


    public List<E> findById(long id) {
        for (Person person : personList) {
            if (person.getId() == id) {
                return (List<E>) personList;
            }
        }
        return (List<E>) personList;

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

    }

    public int count() {
        return personList.size();

    }

    public abstract <E> Person[] getArray();
//    {
//        return (Person[]) personList.toArray();
//    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}


