import java.util.Scanner;

public class ContactApp {

    public void contactApplication() throws Exception {
        ContactList contact = new ContactList();

        Scanner input = new Scanner(System.in);

        while(true){
            contact.printMenu();

            int number;
            int operation;

            number = input.nextInt();
            input.nextLine();
            switch (number) {
                case 1:
                    System.out.println("new contact list has been created");
                    contact.printOperationContact();
                    contact.clearAll();

                    do {

                        operation = input.nextInt();
                        input.nextLine();
                        switch (operation) {
                            case 1:
                                System.out.println("Current Contacts");
                                System.out.println("---------");

                                if(contact.contactSize() == 0){
                                    System.out.println("no contacts present");
                                }
                                else{
                                    contact.printContact();

                                }

                                contact.printOperationContact();
                                break;

                            case 2:
                                String message = "";


                                System.out.println("First name: ");
                                String firstName = input.nextLine();

                                if (!contact.validFirstName(firstName)){
                                    message = ("WARNING: first name must be at least 1 character long; contact not created\n");
                                }

                                System.out.println("Last name: ");
                                String lastName = input.nextLine();

                                if (!contact.validLastName(lastName)){
                                    message = ("WARNING: last name must be at least 1 character long; contact not created\n");
                                }

                                System.out.println("Phone number ");
                                String phoneNumber = input.nextLine();

                                if (!contact.validPhoneNumber(phoneNumber)){
                                    message = ("WARNING: invalid phone number; contact not created\n");
                               }

                                System.out.println("Email address: ");
                                String email = input.nextLine();
                                System.out.print(message);

                                if (!contact.validEmail(email))
                                    message = ("WARNING: invalid phone number; contact not created\n");

                                    contact.addContact(firstName, lastName, phoneNumber, email);

                                contact.printOperationContact();
                                break;
                            case 3:
                                System.out.println("Current Contacts");
                                System.out.println("---------\n");
                                contact.printContact();

                                System.out.println("Which contact will you edit?");
                                int index = input.nextInt();

                                System.out.println("Enter a new first name for contact " + index + ": ");
                                firstName = input.next();

                                System.out.println("Enter a new last name for contact " + index + ": ");
                                lastName = input.next();

                                System.out.println("Enter a new phone number for contact " + index + ": ");
                                phoneNumber = input.next();

                                System.out.println("Enter a new email address for contact " + index + ": ");
                                email = input.next();

                                contact.editContact(index, firstName, lastName, phoneNumber, email);
                                contact.printOperationContact();
                                break;

                            case 4:
                                System.out.println("Current Contacts");
                                System.out.println("---------\n");
                                contact.printContact();

                                System.out.println("Which contact will you remove?");
                                int index2 = input.nextInt();
                                contact.removeList(index2);
                                contact.printOperationContact();
                                break;

                            case 5:
                                contact.fileCreatorContact();
                                contact.printOperationContact();
                                break;


                        }

                    } while (operation != 6);
                    break;

                case 2:
                    contact.clearAll();
                    contact.fileLoadContact();
                    contact.printOperationContact();

                    do {

                        operation = input.nextInt();
                        input.nextLine();
                        switch (operation) {
                            case 1:
                                System.out.println("Current Contacts");
                                System.out.println("---------");

                                if(contact.contactSize() == 0){
                                    System.out.println("no contacts present");
                                }
                                else{
                                    contact.printContact();

                                }

                                contact.printOperationContact();
                                break;

                            case 2:
                                String message = "";

                                System.out.println("First name: ");
                                String firstName = input.nextLine();

                                if (!contact.validFirstName(firstName))
                                    message = ("WARNING: first name must be at least 1 character long; contact not created");

                                System.out.println("Last name: ");
                                String lastName = input.next();

                                if (!contact.validLastName(lastName))
                                    message = ("WARNING: last name must be at least 1 character long; contact not created");

                                System.out.println("Phone number ");
                                String phoneNumber = input.next();

                                if (!contact.validPhoneNumber(phoneNumber))
                                    message = ("WARNING: invalid phone number; contact not created");

                                System.out.println("Email address: ");
                                String email = input.next();

                                if (!contact.validEmail(email))
                                    message = ("WARNING: invalid email address; contact not created");


                                if (contact.validFirstName(firstName) && contact.validLastName(lastName) && contact.validPhoneNumber(phoneNumber) && contact.validEmail(email))
                                    contact.addContact(firstName, lastName, phoneNumber, email);

                                System.out.print(message + "\n");
                                contact.printOperationContact();
                                break;
                            case 3:
                                System.out.println("Current Contacts");
                                System.out.println("---------\n");
                                contact.printContact();

                                System.out.println("Which contact will you edit?");
                                int index = input.nextInt();

                                System.out.println("Enter a new first name for contact " + index + ": ");
                                firstName = input.next();

                                System.out.println("Enter a new last name for contact " + index + ": ");
                                lastName = input.next();

                                System.out.println("Enter a new phone number for contact " + index + ": ");
                                phoneNumber = input.next();

                                System.out.println("Enter a new email address for contact " + index + ": ");
                                email = input.next();

                                contact.editContact(index, firstName, lastName, phoneNumber, email);
                                contact.printOperationContact();
                                break;

                            case 4:
                                System.out.println("Current Contacts");
                                System.out.println("---------\n");
                                contact.printContact();

                                System.out.println("Which contact will you remove?");
                                int index2 = input.nextInt();
                                contact.removeList(index2);
                                contact.printOperationContact();
                                break;

                            case 5:
                                contact.fileCreatorContact();
                                contact.printOperationContact();
                                break;
                        }

                    } while (operation != 6);
                    break;

                case 3:
                    return;

            }


        }


    }


}
