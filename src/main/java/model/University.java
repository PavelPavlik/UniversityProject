package model;

import com.google.gson.annotations.SerializedName;
import enums.StudyProfile;

public class University {
	@SerializedName("UniverId")
	String id;
	@SerializedName("Name")
	String fullName;
	@SerializedName("ShName")
	String shortName;
	@SerializedName("Year")
	int yearOfFoundation;
	@SerializedName("Profile")
	StudyProfile mainProfile;

	public University(){

	}

	public String getId() {
		return id;
	}

	public University setId(String id) {
		this.id = id;
		return this;
	}

	public String getFullName() {
		return fullName;
	}

	public University setFullName(String fullName) {
		this.fullName = fullName;
		return this;
	}

	public String getShortName() {
		return shortName;
	}

	public University setShortName(String shortName) {
		this.shortName = shortName;
		return this;
	}

	public int getYearOfFoundation() {
		return yearOfFoundation;
	}

	public University setYearOfFoundation(int yearOfFoundation) {
		this.yearOfFoundation = yearOfFoundation;
		return this;
	}

	public StudyProfile getMainProfile() {
		return mainProfile;
	}

	public University setMainProfile(StudyProfile mainProfile) {
		this.mainProfile = mainProfile;
		return this;
	}

	@Override
	public String toString() {
		return " Университет { " +
				"id:'" + id + '\'' +
				",\n Полное наименование: '" + fullName + '\'' +
				",\n Короткое наименование: '" + shortName + '\'' +
				",\n Год основания: " + yearOfFoundation +
				",\n Направление: " + mainProfile +
				'}';
	}
}
