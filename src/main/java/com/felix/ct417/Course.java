package com.felix.ct417;

import  org.joda.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by FelixDSantos on 28/09/2016.
 */
public class Course {

    private String courseName;
    private ArrayList<Module> courseModules;
    private LocalDate startDate,endDate;

    public Course(String courseName, LocalDate startDate, LocalDate endDate){
        this.courseName = courseName;
        this.startDate=startDate;
        this.endDate=endDate;
        courseModules= new ArrayList<Module>();
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Module> getCourseModules() {
        return courseModules;
    }

    public void addCourseModules(ArrayList<Module> courseModules) {
        this.courseModules = courseModules;
    }

    public void addCourseModule(Module module){
        courseModules.add(module);
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

}
