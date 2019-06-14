package mediasoft.course;

class Address {
    private String city;
    private String street;
    private int houseNumber;
    private int apartmentNumber;
    private boolean isApartment;

    Address(String city, String street, int houseNumber,
            int apartmentNumber, boolean isApartment){
        this.city=city;
        this.street=street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = isApartment?apartmentNumber:-1;
    }

    public String toString(){
        return String.format("Город: %s\n" +
                "Улица: %s\n" +
                "Номер дома: %s\n" +
                "Номер квартиры: %s\n",
                city,street,houseNumber,apartmentNumber);
    }
}
