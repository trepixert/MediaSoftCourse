package mediasoft.course;

import java.util.Date;

class Candidate extends Person {
    private static int getID=0;
    private final int ID;
    private Education education;
    private Communication communication;
    private PersonalInformation personalInformation;

    Candidate(String name, String surname, String fatherName, int age,
              Date birthday, String email, String phoneNumber, String purpose, String personalInformation,
              String city, String street, int houseNumber, int apartmentNumber, boolean isApartment,
              String level, String periodOfStudy, String theUniversityName, String faculty,
              String speciality){
        super(name,surname,fatherName,age,birthday,city,street,houseNumber,apartmentNumber,isApartment);
        ID = ++getID;
        education = new Education(level,periodOfStudy,theUniversityName,faculty,speciality);
        communication = new Communication(email,phoneNumber);
        this.personalInformation = new PersonalInformation(purpose,personalInformation);
    }

    @Override
    public String toString() {
        return super.toString()+
                communication.toString()+
                education.toString()+
                personalInformation.toString();
    }
}
