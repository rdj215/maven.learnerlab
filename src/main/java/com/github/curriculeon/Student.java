package com.github.curriculeon;


public class Student extends Person implements Learner {
   private double totalStudyTime ; //Student attribute


    public Student(long id, String name, double totalStudyTime) {
        super(id, name);
        this.totalStudyTime = totalStudyTime;
    }

    public void learn(double numberOfHours){
        totalStudyTime += numberOfHours;


    }



    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

}
