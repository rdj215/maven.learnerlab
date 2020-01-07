package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    private void constructorTest(long expectedId, String expectedName){
        Person person = new Person(expectedId, expectedName);

        //When
        long actualId = person.getId();
        String actualName = person.getName();

        //Then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);

    }
    @Test
    public void test0(){
        constructorTest(22, "Ryan");
    }

    @Test
    public void test1(){
        constructorTest( 55, "Dave");
    }
    @Test
    public void test2(){
        constructorTest(0, null );
    }
}

