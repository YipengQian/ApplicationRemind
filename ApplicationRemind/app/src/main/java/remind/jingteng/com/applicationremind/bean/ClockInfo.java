package remind.jingteng.com.applicationremind.bean;

/**
 * Created by qianyipeng on 2016/3/15.
 */
public class ClockInfo {
    private int id;
    private String name;
    private String content;
    private double date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDate() {
        return date;
    }

    public void setDate(double date) {
        this.date = date;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
