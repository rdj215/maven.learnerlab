package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        //given
        Student student = new Student(2, "Ryan", 45);

        //when
        Boolean isPerson = (Object) student instanceof Person;

        //then
        Assert.assertTrue(isPerson);

    }

    @Test
    public void testInheritance(){
        Student student = new Student(2, "Ryan", 45);

        Boolean isLearner = (Object) student instanceof Learner;

        Assert.assertTrue(isLearner);
    }

    @Test
    public void testLearn(){
        Student student = new Student(2, "Ryan", 45);
        student.learn(22);
        double actualStudyTime = student.getTotalStudyTime();
        double expectedStudyTime = 67;

        Assert.assertEquals(expectedStudyTime, actualStudyTime, 0.0);
    }
}
