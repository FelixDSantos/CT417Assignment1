
/**
 * Created by FelixDSantos on 28/09/2016.
 */
import com.felix.ct417.Student;
import org.joda.time.LocalDate;


import static org.junit.Assert.*;

public class StudentTest {
    @org.junit.Test
    public void getUsername() throws Exception {
        Student student = new Student("Jim","Bob",new LocalDate("1996-03-15"), 13376931);

        String studentUsername=student.getUsername(student.getFirstName(),student.getLastName(), student.getAge());
        assertEquals(studentUsername,"JimBob20");
    }

}
