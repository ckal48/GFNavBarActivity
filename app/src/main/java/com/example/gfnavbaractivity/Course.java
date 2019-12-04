package com.example.gfnavbaractivity;

public class Course {
    String title;
    Boolean monday;
    Boolean tuesday;
    Boolean wednesday;
    Boolean thursday;
    Boolean friday;
    Boolean saturday;
    Boolean sunday;
    String startTime;



    public Course(String courseName,
                  //Boolean m, Boolean t, Boolean w, Boolean r, Boolean f, Boolean sA, Boolean sU,
                  String sTime){
        title = courseName;
        /*
        monday = m;
        tuesday = t;
        wednesday = w;
        thursday = r;
        friday = f;
        saturday = sA;
        sunday = sU;
         */
        startTime = sTime;
    }

    public String makeListItem(){
        return title + " \n" + startTime;
    }
}
