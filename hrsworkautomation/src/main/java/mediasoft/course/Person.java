package mediasoft.course;

import java.util.Date;

abstract class Person {
    private String name;
    private String surname;
    private String fatherName;
    private Date birthday;
    private int age;
    private Address address;

    protected Person(String name, String surname, String fatherName, int age,Date birthday,
                     String city, String street, int houseNumber, int apartmentNumber, boolean isApartment){
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.age = age;
        this.birthday = birthday;
        address = new Address(city,street,houseNumber,apartmentNumber,isApartment);
    }

    @Override
    public String toString() {
        return  "ФИО: "+surname+" "+name+" "+fatherName+"\n"+
                "Дата рождения: "+birthday+"\n"+
                "Возраст: "+age+"\n" +
                address.toString();
    }
}
