import java.util.Date;

/**
 * Created by FelixDSantos on 28/09/2016.
 */
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
        this.username=getUsername(this.name,this.age);
    }
    private String getUsername(String name, int age){
        String ageToConcat= Integer.toString(age);
        return ageToConcat;
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

    public static void main(String[] args){
        Student student = new Student("Felix", 20, new Date(1996,03,15), 13376931);
        String username= student.getUsername(student.getName(), student.getAge());
        System.out.println(username);
        System.out.println(student.getDob().toString());
    }
}
