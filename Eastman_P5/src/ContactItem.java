public class ContactItem {



    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String email;


    public ContactItem(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    void setFirstName(String a) {
        this.firstName = a;
    }

    String getFirstName() {
        return this.firstName;
    }


    void setLastName(String b) {
        this.lastName = b;
    }

    String getLastName() {
        return this.lastName;
    }


    void setPhoneNumber(String c) {
        this.phoneNumber = c;
    }

    String getPhoneNumber() {
        return this.phoneNumber;
    }



    void setEmail(String d) {
        this.email = d;
    }

    String getEmail() {
        return this.email;
    }



























}
