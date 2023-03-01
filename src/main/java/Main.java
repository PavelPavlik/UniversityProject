public class Main {
  public static void main(String[] args) {
	University university1 = new University("3165", "Первый Санкт-Петербургский государственный " +
			"медицинский университет им. акад. И.П. Павлова", "ПСПбГМУ", 1897, StudyProfile.MEDICINE);
	University university2 = new University("3639", "Федеральное государственное бюджетное образовательное" +
			" учреждение высшего образования\n" +
			"Санкт-Петербургский государственный аграрный университет", "СПБГАУ", 1904, StudyProfile.AGRONOMY);
	University university3 = new University("3595", "Московский педагогический государственный университет",
			"МПГУ", 1872, StudyProfile.BIOLOGY);
	University university4 = new University("3785", "Санкт-Петербургский государственный университет",
			"СПбГУ", 1724, StudyProfile.POLICY);
	Student student1 = new Student("Павлик Павел Сергеевич", "3165", 2, 4.68f);
	Student student2 = new Student("Вавилов Пётр Яковлевич", "3639", 3, 4.75f);
	Student student3 = new Student("Петров Владимир Олегович", "3595", 4, 4.66f);
	Student student4 = new Student("Смирнов Алексей Давыдович","3785",1,4.51f);
	System.out.println(university1);
	System.out.println();
	System.out.println(student1);

  }
}
