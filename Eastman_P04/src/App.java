import java.io.File;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {


        TaskList list = new TaskList();
        File i = new File("list");


        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);

        while (true) {


            list.printMenu();

            int number;
            int operation;

            number = input.nextInt();
            input.nextLine();
            switch (number) {
                case 1:
                    list.printOperation();
                    list.clearAll();

                    do {

                        operation = input.nextInt();
                        input.nextLine();


                        switch (operation) {
                            case 1:
                                System.out.println("Current Tasks");
                                System.out.println("---------\n");
                                list.printList();
                                list.printOperation();
                                break;
                            case 2:
                                String message = "";

                                System.out.println("Task title: ");
                                String title = input.nextLine();


                                System.out.println("Task description: ");
                                String description = input2.next();


                                if (!list.validDescription(description)) {
                                    message = ("WARNING: description must be at least 0 or more characters; task not created");
                                }

                                System.out.println("Task due date: ");
                                String date = input2.next();

                                if (!list.validTitle(title)) {

                                    message = ("WARNING: title must be at least 1 character long; task not created\n");
                                }


                                if (list.validDate(date) && list.validTitle(title) && list.validDescription(description)) {
                                    list.addList(title, description, date, false);
                                }


                                if (!list.validDate(date)) {
                                    message = ("WARNING: invalid due date; task not created\n");

                                }


                                System.out.print(message);
                                list.printOperation();
                                break;

                            case 3:
                                System.out.println("Current Tasks");
                                System.out.println("---------\n");
                                list.printList();
                                System.out.println("Which task will you edit?");
                                int index = input.nextInt();
                                System.out.println("Enter a new title for task " + index + ": ");
                                title = input2.next();
                                System.out.println("Enter a new description for task " + index + ": ");
                                description = input.next();
                                System.out.println("Enter a new task due date (YYYY-MM-DD) for task " + index + ": ");
                                date = input.next();

                                boolean comp = list.getItem(index).getComp();

                                list.editList(index, title, description, date, comp);
                                list.printOperation();
                                break;


                            case 4:

                                System.out.println("Current Tasks");
                                System.out.println("---------\n");
                                list.printList();

                                System.out.println("Which task will you remove?");
                                int index2 = input4.nextInt();
                                list.removeList(index2);
                                list.printOperation();
                                break;


                            case 5:

                                System.out.println("Uncompleted Tasks");
                                System.out.println("---------\n");
                                list.printNonCompleted();
                                System.out.println("Which task will you mark as completed?");
                                int index3 = input.nextInt();
                                list.setCompleted(true, index3);
                                list.printOperation();

                                break;


                            case 6:


                                System.out.println("Completed Tasks");
                                System.out.println("---------\n");
                                list.printCompleted();
                                System.out.println("Which task will you unmark as completed?");
                                int index4 = input.nextInt();
                                list.setCompleted(false, index4);
                                list.printOperation();
                                break;


                            case 7:
                                list.fileCreator();

                                list.printOperation();
                                break;


                        }
                    } while (operation != 8);
                    break;

                case 2:
                    list.fileLoad();
                    list.printOperation();


                    while (true) {

                        do {

                            operation = input.nextInt();
                            input.nextLine();
                            switch (operation) {
                                case 1:
                                    System.out.println("Current Tasks");
                                    System.out.println("---------\n");
                                    list.printList();
                                    list.printOperation();
                                    break;
                                case 2:
                                    String message = "";

                                    System.out.println("Task title: ");
                                    String title = input.nextLine();


                                    System.out.println("Task description: ");
                                    String description = input2.next();


                                    if (!list.validDescription(description)) {
                                        message = ("WARNING: description must be at least 0 or more characters; task not created");
                                    }


                                    System.out.println("Task due date: ");
                                    String date = input2.next();

                                    if (!list.validTitle(title)) {

                                        message = ("WARNING: title must be at least 1 character long; task not created\n");
                                    }

                                    if (list.validDate(date) && list.validTitle(title) && list.validDescription(description)) {
                                        list.addList(title, description, date, false);
                                    }


                                    if (!list.validDate(date)) {
                                        message = ("WARNING: invalid due date; task not created\n");

                                    }


                                    System.out.print(message);
                                    list.printOperation();
                                    break;

                                case 3:

                                    System.out.println("Current Tasks");
                                    System.out.println("---------\n");
                                    list.printList();
                                    System.out.println("Which task will you edit?");
                                    int index = input.nextInt();
                                    System.out.println("Enter a new title for task " + index + ": ");
                                    title = input2.next();
                                    System.out.println("Enter a new description for task " + index + ": ");
                                    description = input.next();
                                    System.out.println("Enter a new task due date (YYYY-MM-DD) for task " + index + ": ");
                                    date = input.next();

                                    boolean comp = list.getItem(index).getComp();

                                    list.editList(index, title, description, date, comp);
                                    list.printOperation();
                                    break;


                                case 4:

                                    System.out.println("Current Tasks");
                                    System.out.println("---------\n");
                                    list.printList();

                                    System.out.println("Which task will you remove?");
                                    int index2 = input4.nextInt();
                                    list.removeList(index2);
                                    list.printOperation();
                                    break;


                                case 5:

                                    System.out.println("Uncompleted Tasks");
                                    System.out.println("---------\n");
                                    list.printNonCompleted();
                                    System.out.println("Which task will you mark as completed?");
                                    int index3 = input.nextInt();
                                    list.setCompleted(true, index3);
                                    list.printOperation();

                                    break;


                                case 6:


                                    System.out.println("Completed Tasks");
                                    System.out.println("---------\n");
                                    list.printCompleted();
                                    System.out.println("Which task will you unmark as completed?");
                                    int index4 = input.nextInt();
                                    list.setCompleted(false, index4);
                                    list.printOperation();
                                    break;


                                case 7:
                                    list.fileCreator();

                                    list.printOperation();
                                    break;


                            }
                        } while (operation != 8);
                        break;

                    }
                    break;


                case 3:
                    return;


            }
        }

    }
}

