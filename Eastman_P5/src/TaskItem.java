import java.time.format.DecimalStyle;

public class TaskItem {
    private String title;
    private String description;
    private String date;
    public String s;
    private boolean isCompleted  = false;




    public TaskItem(String title, String description, String date, boolean isCompleted) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.isCompleted = isCompleted;
    }

    public TaskItem(String title,String description, String date) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.isCompleted = false;
    }































}
