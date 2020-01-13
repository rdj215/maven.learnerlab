package com.github.curriculeon;

public class Classroom implements Teacher {
    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();
    private static final Classroom INSTANCE = new Classroom();
     private Classroom()
     {

     }

     public static Classroom getInstance()
     {
         return INSTANCE;
     }
    public void hostLecture(Teacher teacher, double numberOfHours)
    {
        lecture(students, numberOfHours);
    }
}
