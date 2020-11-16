import org.junit.Test;


import javax.xml.crypto.dsig.SignatureMethod;
import java.io.*;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Scanner;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;


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

        for (TaskItem l : list) {
            arraySize++;
        }


    }

    public void printList() {
        int number = 0;

        for (TaskItem i : list) {
            System.out.println(i.getCompleted() + " " + number + ") " + "[" + i.getDate() + "] " + i.getTitle() + ": " + i.getDescription());
            number++;
        }
    }



    void printMenu() {

        System.out.println("Main Menu");
        System.out.println("---------\n\n");
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
        System.out.println("7) save the current list");
        System.out.println("8) quit to the main menu");
    }

    void editList(int index, String title, String description, String date, boolean isCompleted) {
        TaskItem i = new TaskItem(title, description, date, isCompleted);

        list.set(index, i);
    }


    void removeList(int index2) {
        list.remove(index2);
    }

    public void setCompleted(boolean completed, int index3) {
        list.get(index3).setComp(completed);

    }


    public void printCompleted() {
        int number = 0;
        for (TaskItem i : list) {
            if (i.getComp()) {
                System.out.println(i.getCompleted() + " " + number + ") " + "[" + i.getDate() + "] " + i.getTitle() + ": " + i.getDescription());
            }
            number++;

        }
    }

    public void printNonCompleted() {
        int number = 0;
        for (TaskItem i : list) {
            if (!i.getComp()) {
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

        for (int i = 0; i < title.length(); i++)

            count++;

        if (count >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validDescription(String description) {
        int count = 0;
        for (int i = 0; i < description.length(); i++)
            count++;
        if (count >= 0) {
            return true;
        } else {
            return false;
        }
    }


    public void fileCreator() {
        try {
            System.out.println("Enter the filename to save as: ");
            String name = input.nextLine();


            File file = new File(name + ".txt");

            if (file.createNewFile())
                System.out.println("task list has been saved");


            FileWriter saver = new FileWriter(file);
            for (TaskItem i : list) {
                saver.write(i.getCompleted() + "\t" + i.getTitle() + "\t" + i.getDescription() + "\t" + i.getDate() + "\n");
                saver.close();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }

    public void fileLoad() {
        try {
            System.out.println("Enter the filename to load: ");
            String name = input.nextLine();

            Scanner s = new Scanner(new File(name + ".txt"));





            while(s.hasNextLine()) {
                String[] temp = new String[4];
                temp = s.nextLine().split("\\t");
                boolean tempComp = false;
                if(temp[0].equals("***")) {
                    tempComp = true;
                }
                TaskItem tempTask = new TaskItem(temp[1], temp[2], temp[3], tempComp);
                list.add(tempTask);


            }


        }
        catch(IOException e){
            System.out.println(e.getMessage());

        }

    }



    public TaskItem getItem(int index){
        return list.get(index);
    }


    public void clearAll() {
        list.clear();
    }










    @Test
    public void addingListIncreasesSize() {
        ArrayList<TaskItem> list = new ArrayList<>();
        TaskItem task = new TaskItem();

        list.add(task);
        list.add(task);
        list.add(task);

        assertEquals(3, list.size());

    }

    @Test
    public void editWorks() {
        ArrayList<TaskItem> list = new ArrayList<>();
        TaskItem task = new TaskItem();
        list.add(task);
        int index = 0;
        list.set(index, task);
        assertNotEquals(list.add(task), list.set(index, task));
    }

    @Test
    public void correctListAdd() {
        ArrayList<TaskItem> list = new ArrayList<>();
        TaskItem task = new TaskItem();
        list.add(task);


        assertEquals(1, list.size());

    }

    @Test
    public void validDateReturnsFalseWithInvalidDate() {
        assertFalse(validDate("00000000"));
    }

    @Test
    public void validTitleReturnsFalseWithInvalidTitle() {
        assertFalse(validTitle(""));
    }

    @Test
    public void validDateReturnsTrueWithValidDatfde() {
        assertTrue(validDate("0000-00-00"));
    }

    @Test
    public void validTitleReturnsTrueWithValidTitle() {
        assertTrue(validTitle("Test"));
    }

    @Test
    public void validDescriptionReturnsTrueWithValidDescription() {
        assertTrue(validDescription("Test"));
    }

    @Test
    public void removeListWorks() {
        ArrayList<TaskItem> list = new ArrayList<>();
        TaskItem task = new TaskItem();
        list.add(task);
        list.remove(task);
        assertEquals(0, list.size());
    }


}
