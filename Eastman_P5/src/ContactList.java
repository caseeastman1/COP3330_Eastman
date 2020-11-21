import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ContactList {


    ArrayList<ContactItem> contact;

    public ContactList() {
        contact = new ArrayList<>();
    }


    Scanner input = new Scanner(System.in);

    public void addContact(String firstName, String lastName, String phoneNumber, String email) {
        ContactItem i = new ContactItem(firstName, lastName, phoneNumber, email);
        int arraySize = 0;

        contact.add(i);
        for(ContactItem l : contact) {
            arraySize++;
        }
    }



    public void printContact() {
        int number = 0;

        for(ContactItem i : contact){
            System.out.println(number + ") Name: "+ i.getFirstName() + " "+ i.getLastName());
            System.out.println("Phone: " + i.getPhoneNumber());
            System.out.println("Email: " + i.getEmail());
            number++;
        }
    }



    public void printMenu(){
        System.out.println("Main Menu");
        System.out.println("---------\n");
        System.out.println("1) create a new list");
        System.out.println("2) load an existing list");
        System.out.println("3) quit");
    }




    public void printOperationContact() {
        System.out.println("List Operation Menu");
        System.out.println("---------\n");
        System.out.println("1) view the list");
        System.out.println("2) add an item");
        System.out.println("3) edit an item");
        System.out.println("4) remove an item");
        System.out.println("5) save the current list");
        System.out.println("6) quit to the main menu");
    }


    public void editContact(int index, String firstName, String lastName, String phoneNumber, String email){
        ContactItem i = new ContactItem(firstName, lastName, phoneNumber, email);

        contact.set(index, i);
    }



    public void removeList(int index2){
        contact.remove(index2);
    }

    public boolean validPhoneNumber(String phoneNumber){
            final String regexPN = "^(1)?[0-9]{3}?[0-9]{3}-?[0-9]{4}$";
            if(Pattern.matches(regexPN, phoneNumber))
                return true;
            else
                return false;
    }

    public boolean validFirstName(String firstName){
        int count = 0;

        for(int i = 0; i < firstName.length(); i++){
            count++;
        }

        if(count >= 1)
            return true;
        else
            return false;
    }


    public boolean validLastName(String lastName){
        int count = 0;

        for(int i = 0; i < lastName.length(); i++){
            count++;
        }
        if(count >= 1)
            return true;
        else
            return false;
    }


    public boolean validEmail(String email){
        int count = 0;

        for(int i = 0; i < email.length(); i++){
            count++;
        }

        if(count >= 1)
            return true;
        else
            return false;
    }


    public void fileCreatorContact() {
        try {
            System.out.println("Enter the filename to save as: ");
            String name = input.nextLine();

            File file = new File(name + ".txt");

            if (file.createNewFile())
                System.out.println("contact list has been saved");

            FileWriter saver = new FileWriter(file);
            for (ContactItem i : contact) {
                saver.write(i.getFirstName() + "\\t" + i.getLastName() + "\\t" + i.getPhoneNumber() + "\\t" + i.getEmail() + "\n");
                saver.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

        public void clearAll() {
            contact.clear();
        }






    }








































}
