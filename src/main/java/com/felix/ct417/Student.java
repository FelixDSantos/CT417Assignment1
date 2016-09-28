package com.felix.ct417;
/**
 * Created by FelixDSantos on 28/09/2016.
 */
import java.util.Date;

public class Student {

    private String name;
    private int age;
    private Date dob;
    private int id;
    private String username;

    public Student(String name, int age, Date dob, int id){
        this.name=name;
        this.age=age;
        this.dob=dob;
        this.id=id;
        this.username=getUsername(name,age);

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

    public Date getDob() {
        return dob;
    }

    public int getId() {
        return id;
    }
}
