import java.time.format.DecimalStyle;
import java.util.regex.Pattern;

public class TaskItem {
    public String title;
    public String description;
    public String date;
    public String s;
    private boolean isCompleted  = false;



    public TaskItem(String title, String description, String date, boolean isCompleted) throws Exception {
        this.title = title;

        if(title.length() < 1)
            throw new Exception("invalid title");

        this.description = description;
        this.date = date;
        final String regex = "^(19|20)\\d\\d[- /.](0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])$";
        if(!Pattern.matches(regex, date))
            throw new Exception("invalid date");

        this.isCompleted = isCompleted;
    }

    public TaskItem(String title,String description, String date) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.isCompleted = false;
    }

    void setTitle(String title) throws Exception{
        if(title.length() < 1)
            throw new Exception("invalid title");
        this.title = title;
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

    void setDate(String date) throws Exception {
        final String regex = "^(19|20)\\d\\d[- /.](0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])$";
        if(!Pattern.matches(regex, date))
            throw new Exception("invalid date");
        this.date = date;
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
