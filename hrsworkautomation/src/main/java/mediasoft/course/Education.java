package mediasoft.course;

class Education {
    private String level;
    private String periodOfStudy;
    private String theUniversityName;
    private String faculty;
    private String speciality;

    Education(String level, String periodOfStudy, String theUniversityName, String faculty, String speciality){
        this.level=level;
        this.periodOfStudy=periodOfStudy;
        this.theUniversityName=theUniversityName;
        this.faculty=faculty;
        this.speciality=speciality;
    }

    @Override
    public String toString(){
        return String.format("Образование: %s\n" +
                "Период обучения: %s\n" +
                "Название университета: %s\n" +
                "Факультет: %s\n" +
                "Специальность: %s\n",
                level,periodOfStudy,theUniversityName,faculty,speciality);
    }
}
