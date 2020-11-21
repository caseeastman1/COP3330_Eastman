import java.util.Scanner;

public class ContactApp {

    public static void main(String[] args){
        ContactList contact = new ContactList();

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        while(true){
            contact.printMenu();

            int number;
            int operation;

            number = input.nextInt();
            input.nextLine();
            switch (number){
                case 1:
                    contact.printOperationContact();
                    contact.clearAll();

                    do{

                        operation = input.nextInt();
                        input.nextLine();
                        switch(operation){
                            case 1:
                                System.out.println("Current Contacts");
                                System.out.println("---------");
                                contact.printContact();
                                contact.printOperationContact();
                                break;
                        }

                    }while(operation != 8);
            }
        }



























    }





}
