import model.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

	@Test
	public void getFullNameTest() {
		Student student = new Student();
		student.setFullName("Tom");
		assertEquals("Tom",student.getFullName());
	}
}