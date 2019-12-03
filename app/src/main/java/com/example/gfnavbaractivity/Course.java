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
    String endTime;      //not sure what
                        // values time gives
                       //use String for now...

    public Course(String courseName, Boolean m, Boolean t,
                  Boolean w, Boolean r, Boolean f, Boolean sA,
                  Boolean sU, String sTime, String eTime){
        title = courseName;
        monday = m;
        tuesday = t;
        wednesday = w;
        thursday = r;
        friday = f;
        saturday = sA;
        sunday = sU;
        startTime = sTime;
        endTime = eTime;
    }
}
