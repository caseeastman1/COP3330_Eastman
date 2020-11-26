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

    public void addContact(String firstName, String lastName, String phoneNumber, String email) throws Exception {
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


    public void editContact(int index, String firstName, String lastName, String phoneNumber, String email) throws Exception {
        ContactItem i = new ContactItem(firstName, lastName, phoneNumber, email);

        contact.set(index, i);
    }



    public void removeList(int index2){
        contact.remove(index2);
    }

    public boolean validPhoneNumber(String phoneNumber){
            final String regexPN = "^\\d{3}-\\d{3}-\\d{4}$";
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


        final String regexFN = "^(?=.*[A-Z])(?=.*[a-z]).*$";

        if(count >= 1 || Pattern.matches(regexFN, firstName))
            return true;
        else
            return false;
    }


    public boolean validLastName(String lastName){
        int count = 0;

        for(int i = 0; i < lastName.length(); i++){
            count++;
        }

        final String regexLN = "^(?=.*[A-Z])(?=.*[a-z]).*$";




        if(count >= 1 || Pattern.matches(regexLN, lastName))
            return true;
        else
            return false;
    }


    public boolean validEmail(String email){
        int count = 0;

        for(int i = 0; i < email.length(); i++){
            count++;
        }

        final String regexE = "^([\\w\\.\\-]+)@([\\w\\-]+)((\\.(\\w){2,3})+)$";


        if(count >= 1 || Pattern.matches(regexE, email))
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
                saver.write(i.getFirstName() + "\t" + i.getLastName() + "\t" + i.getPhoneNumber() + "\t" + i.getEmail() + "\n");
                saver.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public void fileLoadContact() {
        try {
            System.out.println("Enter the filename to load: ");
            String name = input.nextLine();

            Scanner s = new Scanner(new File(name + ".txt"));

            while(s.hasNextLine()){
                String[] temp = new String[4];
                temp = s.nextLine().split("\\t");
                ContactItem tempContact = new ContactItem(temp[0], temp[1], temp[2], temp[3]);
                contact.add(tempContact);
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        public void clearAll() {
            contact.clear();
        }


        public int contactSize(){
            return contact.size();
        }







    }









































