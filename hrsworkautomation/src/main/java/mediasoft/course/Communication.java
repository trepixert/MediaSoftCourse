package mediasoft.course;

public class Communication {
    private String email;
    private String phoneNumber;

    Communication(String email, String phoneNumber){
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    @Override
    public String toString(){
        return String.format("Электронная почта: %s\n" +
                "Номер телефона: %s\n",
                email,phoneNumber);
    }
}
