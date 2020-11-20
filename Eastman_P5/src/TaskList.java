import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.ArrayList;



public class TaskList {

    ArrayList<TaskItem> list;

    public TaskList() {
        list = new ArrayList<>();
    }


    Scanner input = new Scanner(System.in);

    public void addList(String title, String description, String date, boolean isCompleted) {
        TaskItem i = new TaskItem(title, description, date, isCompleted);

        int arraySize = 0;
        list.add(i);

        for(TaskItem l : list) {
            arraySize++;
        }
    }



    public void printList() {
        int number = 0;

        for(TaskItem i : list) {
            System.out.println(i.getCompleted() + " " + number + ") " + "[" + i.getDate() + "] " + i.getTitle() + ": " + i.getDescription());
            number++;
        }
    }


    void printMenu() {
        System.out.println("Main Menu");
        System.out.println("---------\n");
        System.out.println("1) create a new list");
        System.out.println("2) load an existing list");
        System.out.println("3) quit");
    }


    void printOperation() {
        System.out.println("List Operation Menu");
        System.out.println("---------\n");
        System.out.println("1) view the list");
        System.out.println("2) add an item");
        System.out.println("3) edit an item");
        System.out.println("4) remove an item");
        System.out.println("5) mark an item as completed");
        System.out.println("6) unmark an item as completed");
        System.out.println("7) Save the current list");
        System.out.println("8) quit to the main menu");
    }

    public void editList(String title, String description, String date, boolean isCompleted, int index) {
        TaskItem i = new TaskItem(title, description, date, isCompleted);

        list.set(index, i);
    }



    public void removeList(int index2) {
        list.remove(index2);
    }


    public void setCompleted(boolean completed, int index3) {
        list.get(index3).setComp(completed);
    }


    public void printCompleted() {
        int number = 0;

        for(TaskItem i : list) {
            if(i.getComp()) {
                System.out.println(i.getCompleted() + " " + number + ") " + "[" + i.getDate() + "] " + i.getTitle() + ": " + i.getDescription());
            }

            number++;
        }
    }


    public void printNonCompleted() {
        int number = 0;

        for(TaskItem i : list){
            if(!i.getComp()){
                System.out.println(i.getCompleted() + " " + number + ") " + "[" + i.getDate() + "] " + i.getTitle() + ": " + i.getDescription());
            }
            number++;
        }
    }


    public boolean validDate(String date) {
        try {
            new SimpleDateFormat("yyyy-MM-dd").parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }



    public boolean validTitle(String title) {
        int count = 0;
        for(int i = 0; i < title.length(); i++)
            count++;

        if(count >= 1)
            return true;
        else
            return false;
    }



    public boolean validDescription(String description) {
        int count = 0;

        for(int i = 0; i < description.length(); i++){
            count++;
        }

        if(count >= 0)
            return true;
        else
            return false;
    }



    public void fileCreator() {
        try{
            System.out.println("Enter the filename to save as: ");
            String name = input.nextLine();


            File file = new File(name + ".txt");

            if(file.createNewFile())
                System.out.println("task list has been saved");

            FileWriter saver = new FileWriter(file);

            for(TaskItem i : list) {
                saver.write(i.getCompleted() + "\t" + i.getTitle() + "\t" + i.getDescription() + "\t" + i.getDate() + "\n");
                saver.close();
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }






    public void fileLoad() {
        try{
            System.out.println("Enter the filename to load: ");

            String name = input.nextLine();
            Scanner s = new Scanner(new File(name + ".txt"));

            while(s.hasNextLine()){
                String[] temp = new String[4];
                temp = s.nextLine().split("\\t");
                boolean tempComp = false;
                if(temp[0].equals("***")) {
                    tempComp = true;
                }
                TaskItem tempTask = new TaskItem(temp[1], temp[2], temp[3], tempComp);
                list.add(tempTask);
            }


        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public TaskItem getItem(int index) {
        return list.get(index);
    }

    public void clearAll() {
        list.clear();
    }














}
