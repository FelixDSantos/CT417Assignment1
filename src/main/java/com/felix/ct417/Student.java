package com.felix.ct417;
/**
 * Created by FelixDSantos on 28/09/2016.
 */
import org.joda.time.LocalDate;
import org.joda.time.Years;


public class Student {

    private String firstName,lastName;
    private LocalDate dob;
    private int id;
    private int studentAge;
    private String username;

    public Student(String firstName,String lastName, LocalDate dob, int id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.dob=dob;
        LocalDate presentTime = new LocalDate().now();
        this.studentAge= Years.yearsBetween(dob,presentTime).getYears();
        this.id=id;
        this.username=getUsername(firstName,lastName,this.studentAge);

    }
    public String getUsername(String firstName, String lastName, int age){
        String ageToConcat= Integer.toString(age);
        return (firstName+lastName+ageToConcat);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return studentAge;
    }

    public LocalDate getDob() {
        return dob;
    }

    public int getId() {
        return id;
    }
}
