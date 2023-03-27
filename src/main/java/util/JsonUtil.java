package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import model.*;

import java.util.List;

public class JsonUtil {
	private JsonUtil() {
	}

	public static String getJsonFromStudent(Student student){
		return new GsonBuilder().setPrettyPrinting().create().toJson(student);
	}

	public static String getJsonFromStudentCollection(List<Student> students){
		return new GsonBuilder().setPrettyPrinting().create().toJson(students);
	}

	public static String getJsonFromUniversity(University university){
		return new GsonBuilder().setPrettyPrinting().create().toJson(university);
	}

	public static String getJsonFromUniversityCollection(List<University> universities){
		return new GsonBuilder().setPrettyPrinting().create().toJson(universities);
	}

	public static Student getObjectFromJsonStudent(String json){
		return new Gson().fromJson(json,Student.class);
	}

	public static List<Student> jsonToStudentList(String json) {
		return new Gson().fromJson(json, new TypeToken<List<Student>>() {}.getType());
	}

	public static University getObjectFromJsonUniversity(String json){
		return new Gson().fromJson(json,University.class);
	}

	public static List<University> jsonToUniversityList(String json) {
		return new Gson().fromJson(json, new TypeToken<List<University>>() {}.getType());
	}
}
