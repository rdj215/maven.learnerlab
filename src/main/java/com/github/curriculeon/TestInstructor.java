package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor(23, "Teacher1");

        Boolean isTeacher = (Object) instructor instanceof Teacher;

        Assert.assertTrue(isTeacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(25, "Teacher1");

        Boolean  isPerson = (Object) instructor instanceof Person;

        Assert.assertTrue(isPerson);
    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(24, "Teacher1");
        Student student = new Student(22,"Student1",25);
        instructor.teach(student, 15);
        double expectedStudyTime = 50;
        double actualStudyTime = student.getTotalStudyTime();

        Assert.assertEquals(expectedStudyTime,actualStudyTime, 0.0);
    }

    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(7,"Teacher2");
        Student[] studentArray = new Student[]{
            new Student(1, "student1",5), new Student(3,"student2",7),
                new Student(4,"student3",30)
        };
        int i = 0;
        Student[] studentArray2 = new Student[]{
                new Student(1, "student1",5), new Student(3,"student2",7),
                new Student(4,"student3",30)
        };

//            System.out.println(initialStudyTime[i].getTotalStudyTime());
        instructor.lecture(studentArray,30);
//        System.out.println(initialStudyTime[i].getTotalStudyTime());

        for ( i = 0; i < studentArray.length; i++) {

            double actualStudyTime = studentArray[i].getTotalStudyTime();
            double expectedStudyTime = studentArray2[i].getTotalStudyTime()+10;
            Assert.assertEquals(actualStudyTime, expectedStudyTime, 0.5);

            ;

        }

        //create array to store expected study hours
//        double[] expectedStudyTime = new double[studentArray.length];
        //Fill array with values
//        for (int i = 0; i < expectedStudyTime.length; i++) {
//            double v = expectedStudyTime[i];
//
//
//
//            }
            
            
        }


    }

