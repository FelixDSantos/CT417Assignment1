
/**
 * Created by FelixDSantos on 28/09/2016.
 */
import com.felix.ct417.Course;
import com.felix.ct417.Student;
import org.joda.time.LocalDate;


import static org.junit.Assert.*;

public class StudentTest {
    @org.junit.Test
    public void getUsername() throws Exception {
        Course csit= new Course("Computer Science and Information Technology",new LocalDate("2016-09-05") ,new LocalDate("2020-05-10"));
        Student student = new Student("Jim","Bob",new LocalDate("1996-03-15"), 13376931, csit);

        String studentUsername=student.getUsername(student.getFirstName(),student.getLastName(), student.getAge());
        assertEquals(studentUsername,"JimBob20");
    }

}
