package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestPeople {

    @Test
    public void testAdd(){

        //Given
        People people = new People();
        people.add( new Student(2, "Ryan", 45));
//                new Student(15,"James",100);
        int expectedListCount = 1;

        //When
        int actualListCount = people.count();

        //Then
        Assert.assertEquals(expectedListCount,actualListCount);

    }

    @Test
    public void testRemove(){
        People people = new People();
        people.add(new Student(2, "Ryan", 45));
        people.add(new Student(8, "TRyan", 75));
        people.remove(8);
        int expectedCount = 1;
        int actualCount =people.count();


        Assert.assertEquals(expectedCount, actualCount);



    }

}
