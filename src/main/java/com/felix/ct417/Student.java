package com.felix.ct417;
/**
 * Created by FelixDSantos on 28/09/2016.
 */
import org.joda.time.LocalDate;
import org.joda.time.Years;

import java.util.Date;

public class Student {

    private String name;
    private LocalDate dob;
    private int id;
    private int age;
    private String username;

    public Student(String name, LocalDate dob, int id){
        this.name=name;
        this.dob=dob;
        LocalDate presentTime = new LocalDate().now();
        int studentAge= Years.yearsBetween(presentTime,dob).getYears();
        this.id=id;
        this.username=getUsername(name,studentAge);

    }
    public String getUsername(String name, int age){
        String ageToConcat= Integer.toString(age);
        return (name+ageToConcat);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public int getId() {
        return id;
    }
}
