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

    void setTitle(String x) {
        this.title = x;
    }

    String getTitle() {
        return this.title;
    }

    void setDescription(String y) {
        this.description = y;
    }

    String getDescription() {
        return this.description;
    }

    void setDate(String z) {
        this.date = z;
    }

    String getDate() {
        return this.date;
    }

    void setComp(boolean completed) {
        this.isCompleted = completed;
    }

    public boolean getComp() {
        return this.isCompleted;
    }

    String getCompleted() {
        if(isCompleted)
            return"***";
        return "   ";
    }

    public TaskItem() {
        s = "Something";
    }

    public TaskItem(String s) {
        this.s = s;
    }































}
