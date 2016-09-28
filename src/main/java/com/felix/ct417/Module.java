/**
 * Created by FelixDSantos on 28/09/2016.
 */
package com.felix.ct417;

import java.util.ArrayList;

public class Module {

    private String moduleName;
    private String id;
    private ArrayList<Student> students;

    public Module(String moduleName, String ID){
        this.moduleName=moduleName;
        this.id=ID;
        students = new ArrayList<Student>();
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getID() {
        return id;
    }

    public void addStudent(Student student){
        students.add(student);

    }
    public void addStudents(ArrayList<Student> students){
        this.students.addAll(students);

    }
    public ArrayList<Student> getStudents() {
        return students;
    }

}
