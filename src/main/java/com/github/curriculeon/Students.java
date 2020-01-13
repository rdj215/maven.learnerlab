package com.github.curriculeon;

import java.util.ArrayList;

public final class  Students <Student> extends People
{

    private static final Students INSTANCE = Students.getInstance();

    private Students()
    {


    }

    public static Students getInstance()
    {
        return INSTANCE;
    }


}







