import java.util.Scanner;

public class MainApp {

    public static void main(String[] args){
        ContactApp contact2 = new ContactApp();
        TaskApp list2 = new TaskApp();

        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Select Your Application");
            System.out.println("------------------------\n");
            System.out.println("1) task list");
            System.out.println("2) contact list");
            System.out.println("3) quit");

            int number;
            number = input.nextInt();
            input.nextLine();


            switch(number) {
                case 1:
                    list2.TaskApplication();
                    break;
                case 2:
                    contact2.contactApplication();
                    break;
                case 3:
                    return;



            }
        }
    }
}
