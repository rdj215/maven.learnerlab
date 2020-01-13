package com.github.curriculeon;

public class Instructors extends People {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors()
    {
        new People();
    }

    public static  Instructors getInstance(){
        return INSTANCE;
    }
}
