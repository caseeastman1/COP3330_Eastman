import java.util.regex.Pattern;

public class ContactItem {



    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String email;


    public ContactItem(String firstName, String lastName, String phoneNumber, String email) throws Exception{

        this.firstName = firstName;
        final String regexN = "^(?=.*[A-Z])(?=.*[a-z]).*$";

        if(firstName.length() < 1 || !Pattern.matches(regexN, firstName))
            throw new Exception("invalid first name");

        this.lastName = lastName;

        if (lastName.length() < 1 || !Pattern.matches(regexN, lastName)) {
            throw new Exception("invalid last name");
        }

        this.phoneNumber = phoneNumber;

        final String regexPN = "^\\d{3}-\\d{3}-\\d{4}$";
        if(!Pattern.matches(regexPN, phoneNumber))
            throw new Exception("invalid phone number");

        this.email = email;

        final String regexE = "^([\\w\\.\\-]+)@([\\w\\-]+)((\\.(\\w){2,3})+)$";
        if(email.length() < 1 || !Pattern.matches(regexE, email))
            throw new Exception("invalid email");

    }


    void setFirstName(String firstName) throws Exception {
        if(firstName.length() < 1)
            throw new Exception("invalid first name");
        this.firstName = firstName;
    }

    String getFirstName() {
        return this.firstName;
    }


    void setLastName(String lastName) throws Exception {
        if(lastName.length() < 1)
            throw new Exception("invalid last name");

        this.lastName = lastName;
    }

    String getLastName() {
        return this.lastName;
    }


    void setPhoneNumber(String phoneNumber) throws Exception {
        final String regexPN = "^(1)?[0-9]{3}?[0-9]{3}-?[0-9]{4}$";
        if(!Pattern.matches(regexPN, phoneNumber))
            throw new Exception("invaid phone number");
        this.phoneNumber = phoneNumber;
    }

    String getPhoneNumber() {
        return this.phoneNumber;
    }



    void setEmail(String email) throws Exception {
        if(email.length() < 1)
            throw new Exception("invalid email");
        this.email = email;
    }

    String getEmail() {
        return this.email;
    }



























}
