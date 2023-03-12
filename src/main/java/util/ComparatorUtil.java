package util;

import comparators.*;
import enums.StudentCompareEnum;
import enums.UniversityCompareEnum;

public class ComparatorUtil {
	private ComparatorUtil() {

	}

	public static StudentComparator getStudentComparator(StudentCompareEnum studentCompareEnum) {
		return switch (studentCompareEnum) {
			case NAME -> new StudentFullNameComparator();
			case UNIVERSITY_ID -> new StudentUniversityIdComparator();
			case COURSE -> new StudentCurrentCourseNumberComparator();
			case EXAM_SCORE -> new StudentAvgExamScoreComparator();
			default -> new StudentFullNameComparator();
		};
	}

	public static UniversityComparator getUniversityComparator(UniversityCompareEnum universityCompareEnum) {
		return switch (universityCompareEnum) {
			case ID -> new UniversityIdComparator();
			case NAME -> new UniversityFullNameComparator();
			case SHORT_NAME -> new UniversityShortNameComparator();
			case YEAR_OF_FOUNDATION -> new UniversityYearOfFoundationComparator();
			case MAIN_PROFILE -> new UniversityMainProfileComparator();
			default -> new UniversityFullNameComparator();
		};
	}
}
