package model;

import com.google.gson.annotations.SerializedName;

public class Student {
	@SerializedName("Name")
	String fullName;
	@SerializedName("Course")
	int currentCourseNumber;
	@SerializedName("UniverId")
	String universityId;
	@SerializedName("Score")
	float avgExamScore;

	public Student() {

	}

	public String getFullName() {
		return fullName;
	}

	public Student setFullName(String fullName) {
		this.fullName = fullName;
		return this;
	}

	public String getUniversityId() {
		return universityId;
	}

	public Student setUniversityId(String universityId) {
		this.universityId = universityId;
		return this;
	}

	public int getCurrentCourseNumber() {
		return currentCourseNumber;
	}

	public Student setCurrentCourseNumber(int currentCourseNumber) {
		this.currentCourseNumber = currentCourseNumber;
		return this;
	}

	public float getAvgExamScore() {
		return avgExamScore;
	}

	public Student setAvgExamScore(float avgExamScore) {
		this.avgExamScore = avgExamScore;
		return this;
	}

	@Override
	public String toString() {
		return " Студент {" +
				"\n Полное имя: '" + fullName + '\'' +
				",\n Id университета: '" + universityId + '\'' +
				",\n Номер текущего курса: " + currentCourseNumber +
				",\n Средний балл: " + avgExamScore +
				'}';
	}
}
