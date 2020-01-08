package com.github.curriculeon;

public class Instructor extends Person implements Teacher {
    public  Instructor(long id, String name){
        super(id, name);
    }
    @Override
    public void teach(Learner learner, double numberOfHours){
        learner.learn(25);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours){
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerLearner);
        }


        }
    }


