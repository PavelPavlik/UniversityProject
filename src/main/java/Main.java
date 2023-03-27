import comparators.StudentComparator;
import enums.StudentCompareEnum;
import io.ReadXlsx;
import model.*;
import util.*;

import java.io.IOException;
import java.util.List;

public class Main {
	public static final String URL = "src/main/resources/universityInfo.xlsx";

	public static void main(String[] args) throws IOException {
//		List<Student> students = ReadXlsx.readStudent(URL, "Студенты");
//		List<University> universities = ReadXlsx.readUniversity(URL, "Университеты");
//		StudentComparator nameStudent = ComparatorUtil.getStudentComparator(StudentCompareEnum.NAME);
//		StudentComparator universityId = ComparatorUtil.getStudentComparator(StudentCompareEnum.UNIVERSITY_ID);
//		StudentComparator course = ComparatorUtil.getStudentComparator(StudentCompareEnum.COURSE);
//		StudentComparator score = ComparatorUtil.getStudentComparator(StudentCompareEnum.EXAM_SCORE);
//		students.stream()
//				.map(s->JsonUtil.getJsonFromStudentCollection(students))
//				.map(JsonUtil::getListStudentFromJsonStudent)
//				.forEach(System.out::println);

//		UniversityComparator id = ComparatorUtil.getUniversityComparator(UniversityCompareEnum.ID);
//		UniversityComparator nameUniversity = ComparatorUtil.getUniversityComparator(UniversityCompareEnum.NAME);
//		UniversityComparator shortName = ComparatorUtil.getUniversityComparator(UniversityCompareEnum.SHORT_NAME);
//		UniversityComparator year = ComparatorUtil.getUniversityComparator(UniversityCompareEnum.YEAR_OF_FOUNDATION);
//		UniversityComparator profile = ComparatorUtil.getUniversityComparator(UniversityCompareEnum.MAIN_PROFILE);
//		universities.stream()
//				.sorted(year)
//				.forEach(System.out::println);
	}
}