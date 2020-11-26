import org.junit.Test;
import java.util.ArrayList;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class TaskItemTest {


    @Test
    public void constructorFailsWithInvalidTitle(){
        try{
            TaskItem i = new TaskItem("yes", "yes", "1900-01-01");
            i.setTitle("");
            fail();
        }catch(Exception e){
            assertEquals("invalid title", e.getMessage());
        }
    }
    @Test
    public void constructorFailsWithInvalidDueDate(){
        try{
            TaskItem i = new TaskItem("yes", "yes", "1900-01-01");
            i.setDate("00-00-0000");
            fail();
        }catch(Exception e) {
            assertEquals("invalid date",e.getMessage());
        }
    }

    @Test
    public void constructorSucceedsWithValidTitle() {
        try{
            TaskItem i = new TaskItem("yes", "yes", "1900-01-01");
            i.setTitle("Test");
        }catch(Exception e){
            fail();
        }
    }


    @Test
    public void constructorSucceedsWithValidDueDate() {
        try{
            TaskItem i = new TaskItem("yes","yes", "1900-01-01");
            i.setDate("1900-01-01");

        }catch(Exception e){
            fail();
        }
    }

    @Test
    public void editingDescription() throws Exception {
        ArrayList<TaskItem> list = new ArrayList<>();
        TaskItem l = new TaskItem("yes", "yes", "1900-01-01", true);
        list.add(l);

        int index = 0;

        String description = "new";
        TaskItem i = new TaskItem("no", description, "1900-01-01", false);

        list.set(0,i);



        assertEquals("new", list.get(index).description);

    }

    @Test
    public void editingDueDateFailsWithInvalidDateFormat() {
        try{
            ArrayList<TaskItem> list = new ArrayList<>();
            TaskItem i = new TaskItem("yes", "yes", "1900-01-01", true);
            list.add(i);
            String date = "0000-00-00";
            TaskItem l = new TaskItem("no", "no", date, false);
            list.set(0, l);
            fail();
        } catch (Exception e) {
            assertEquals("invalid date", e.getMessage());
        }
    }


    @Test
    public void editingFailsWithInvalidYYYYMMDDFormat(){
        try{
            ArrayList<TaskItem> list = new ArrayList<>();
            TaskItem i = new TaskItem("yes", "yes", "1900-01-01", true);
            list.add(i);
            String date = "01-01-1900";
            TaskItem l = new TaskItem("no", "no", date, false);
            list.set(0, l);
            fail();
        } catch (Exception e) {
            assertEquals("invalid date", e.getMessage());
        }

    }

    @Test
    public void editingDueDateSucceedsWithExpectedValue() throws Exception {
            ArrayList<TaskItem> list = new ArrayList<>();
            TaskItem i = new TaskItem("yes", "yes", "1900-01-01", false);
            list.add(i);
            int index = 0;
            String date = "2020-12-30";
            TaskItem l = new TaskItem("no", "no", date, false);

            list.set(index, l);
            assertEquals("2020-12-30", list.get(index).date);
    }

    @Test
    public void editingTitleFailsWithEmptyString() {
        try{
            ArrayList<TaskItem> list = new ArrayList<>();
            TaskItem i = new TaskItem("yes", "yes", "1900-01-01", false);
            list.add(i);
            int index = 0;
            String title = "";
            TaskItem l = new TaskItem(title, "no", "1900-01-01", false);
            list.set(index, l);
            fail();
        }catch(Exception e) {
            assertEquals("invalid title", e.getMessage());

        }
    }

    @Test
    public void editingTitleSucceedsWithExpectedValue() throws Exception {
        ArrayList<TaskItem> list = new ArrayList<>();
        TaskItem i = new TaskItem("yes", "yes", "1900-01-01", false);
        list.add(i);
        int index = 0;
        String title = "Test";
        TaskItem l = new TaskItem(title, "yes", "1900-01-01", false);
        list.set(index, l);
        assertEquals("Test", list.get(index).title);
    }

















}
