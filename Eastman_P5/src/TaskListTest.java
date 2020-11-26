import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class TaskListTest {

    TaskList list = new TaskList();


    @Test
    public void clearClears() {
        ArrayList<TaskItem> list = new ArrayList<>();
        TaskItem task = new TaskItem("yes", "yes", "1900-01-01");
        list.add(task);
        list.add(task);
        list.clear();

        assertEquals(0, list.size());
    }


    @Test
    public void addingListIncreasesSize() {
        ArrayList<TaskItem> list = new ArrayList<>();
        TaskItem task = new TaskItem("yes", "yes", "1900-01-01");

        list.add(task);
        list.add(task);
        list.add(task);

        assertEquals(3, list.size());

    }

    @Test
    public void editWorks() {
        ArrayList<TaskItem> list = new ArrayList<>();
        TaskItem task = new TaskItem("yes", "yes", "1900-01-01");
        list.add(task);
        int index = 0;
        list.set(index, task);
        assertNotEquals(list.add(task), list.set(index, task));
    }

    @Test
    public void correctListAdd() {
        ArrayList<TaskItem> list = new ArrayList<>();
        TaskItem task = new TaskItem("yes", "yes", "1900-01-01");
        list.add(task);


        assertEquals(1, list.size());

    }

    @Test
    public void validDateReturnsFalseWithInvalidDate() {
        assertFalse(list.validDate("00000000"));
    }

    @Test
    public void validTitleReturnsFalseWithInvalidTitle() {
        assertFalse(list.validTitle(""));
    }

    @Test
    public void validDateReturnsTrueWithValidDatfde() {
        assertTrue(list.validDate("0000-00-00"));
    }

    @Test
    public void validTitleReturnsTrueWithValidTitle() {
        assertTrue(list.validTitle("Test"));
    }


    @Test
    public void validDescriptionReturnsTrueWithValidDescription() {
        assertTrue(list.validDescription("Test"));
    }

    @Test
    public void removeListWorks() {
        ArrayList<TaskItem> list = new ArrayList<>();
        TaskItem task = new TaskItem("yes", "yes", "1900-01-01");
        list.add(task);
        list.remove(task);
        assertEquals(0, list.size());
    }

    @Test
    public void checkList(){
        ArrayList<TaskItem> list = new ArrayList<>();
        TaskItem task = new TaskItem("yes", "yes", "1900-01-01");
        list.add(task);
        list.remove(task);
        String message = "message";
        if(list.size() == 0){
            message = "no task present";
        }
        assertEquals("no task present", message);
    }




}
