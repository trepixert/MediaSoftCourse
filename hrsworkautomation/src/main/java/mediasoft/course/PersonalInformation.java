package mediasoft.course;

class PersonalInformation {
    private String purpose;
    private String personalInformation;

    PersonalInformation(String purpose, String personalInformation){
        this.purpose = purpose;
        this.personalInformation = personalInformation;
    }

    public String toString(){
        return String.format("Цель: %s\n" +
                "Персональная информация: %s\n",
                purpose,personalInformation);
    }
}
