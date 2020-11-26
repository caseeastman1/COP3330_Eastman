import java.util.Scanner;

public class TaskApp {

    public void TaskApplication() throws Exception {

        TaskList list = new TaskList();
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        while(true){

            list.printMenu();

            int number;
            int operation;

            number = input.nextInt();
            input.nextLine();

            switch(number){
                case 1:
                    list.printOperation();
                    list.clearAll();
                    do{

                        operation = input.nextInt();
                        input.nextLine();


                        switch(operation){
                            case 1:
                                System.out.println("Current Tasks");
                                System.out.println("---------\n");
                                if (list.listSize() == 0){
                                    System.out.println("No list present");
                                }
                                else{
                                list.printList();
                            }
                                list.printOperation();

                                break;
                            case 2:
                                String message = "";

                                System.out.println("Task title: ");
                                String title = input.nextLine();

                                if(!list.validTitle(title))
                                    message = ("WARNING: title must be at least 1 character long; task not created");


                                System.out.println("Task description: ");
                                String description = input.nextLine();

                                if(!list.validDescription(description))
                                    message = ("WARNING: description must be at least 0 or more characters; task not created");

                                System.out.println("Task due date: ");
                                String date = input.next();

                                if(!list.validDate(date))
                                    message = ("WARNING: invalid due date; task not created");

                                if(list.validTitle(title) && list.validDescription(description) && list.validDate(date))
                                    list.addList(title, description, date, false);

                                System.out.println(message);
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

                                System.out.print("Enter a new description for task " + index + ": ");
                                description = input2.next();

                                System.out.println("Enter a new due date for task " + index + ": ");
                                date = input2.next();

                                boolean comp = list.getItem(index).getComp();

                                list.editList(title, description, date, comp, index);
                                list.printOperation();
                                break;

                            case 4:
                                System.out.println("Current Tasks");
                                System.out.println("---------\n");
                                list.printList();

                                System.out.println("Which task will you remove?");

                                int index2 = input.nextInt();
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

                    }while(operation != 8);
                    break;

                case 2:
                    list.clearAll();
                    list.fileLoad();
                    list.printOperation();





                    do{

                        operation = input.nextInt();
                        input.nextLine();


                        switch(operation){
                            case 1:
                                System.out.println("Current Tasks");
                                System.out.println("---------\n");

                                if (list.listSize() == 0){
                                System.out.println("No list present");
                            }
                                else{
                                list.printList();
                            }


                                list.printOperation();
                                break;
                            case 2:
                                String message = "";

                                System.out.println("Task title: ");
                                String title = input.nextLine();

                                if(!list.validTitle(title))
                                    message = ("WARNING: title must be at least 1 character long; task not created");


                                System.out.println("Task description: ");
                                String description = input.nextLine();

                                if(!list.validDescription(description))
                                    message = ("WARNING: description must be at least 0 or more characters; task not created");

                                System.out.println("Task due date: ");
                                String date = input.next();

                                if(!list.validDate(date))
                                    message = ("WARNING: invalid due date; task not created");

                                if(list.validTitle(title) && list.validDescription(description) && list.validDate(date))
                                    list.addList(title, description, date, false);

                                System.out.println(message);
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

                                System.out.print("Enter a new description for task " + index + ": ");
                                description = input2.next();

                                System.out.println("Enter a new due date for task " + index + ": ");
                                date = input2.next();

                                boolean comp = list.getItem(index).getComp();

                                list.editList(title, description, date, comp, index);
                                list.printOperation();
                                break;

                            case 4:
                                System.out.println("Current Tasks");
                                System.out.println("---------\n");
                                list.printList();

                                System.out.println("Which task will you remove?");

                                int index2 = input.nextInt();
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

                    }while(operation != 8);
                    break;

                case 3:
                    return;


            }

        }

    }

}
