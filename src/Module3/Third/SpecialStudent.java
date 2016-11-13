package Module3.Third;

/**
 * Created by Vladymyr on 12.11.2016.
 */
public class SpecialStudent extends CollegeStudent {
    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private long secretKey;
    private String email;

     public SpecialStudent(long secretKey){

        this.secretKey = secretKey;
    }

    public SpecialStudent(String firstName,String lastName, int group){

        super(firstName,lastName,group);
    }

    public SpecialStudent(String lastName,Course...coursesTaken){

        super(lastName,coursesTaken);
    }

    SpecialStudent(){

    }



}

