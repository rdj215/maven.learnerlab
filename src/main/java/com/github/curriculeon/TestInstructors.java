package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void test(){

        //given
        Instructors instructors = Instructors.getInstance();

        //when
        Boolean isInstructor = (Object) instructors instanceof Instructors;

        //then
        Assert.assertTrue(isInstructor);
    }
}
