
/**
 * Created by FelixDSantos on 28/09/2016.
 */
import com.felix.ct417.Student;

import java.util.Date;

import static org.junit.Assert.*;

public class StudentTest {
    @org.junit.Test
    public void getUsername() throws Exception {
        Student student = new Student("Felix",20,new Date(826848000), 13376931);

        String studentUsername=student.getUsername(student.getName(), student.getAge());
        assertEquals(studentUsername,"Felix20");
    }

}
