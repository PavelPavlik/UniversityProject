public enum StudyProfile {
  MEDICINE("Медицина"),
  AGRONOMY("Агрономия"),
  BIOLOGY("Биология"),
  POLICY("Политика");

  private final String profileName;

  StudyProfile(String profileName) {
	this.profileName = profileName;
  }

  @Override
  public String toString() {
    return profileName;
  }
}
