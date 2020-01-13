package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test(){

        //given
        Students student = Students.getInstance();

        //when
        Boolean isStudent = (Object)  student instanceof Students;

        //then
        Assert.assertTrue(isStudent);
    }

}
