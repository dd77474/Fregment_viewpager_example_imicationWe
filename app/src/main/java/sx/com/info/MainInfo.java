package sx.com.info;

/**
 * Created by ranran on 2015/8/16.
 */
public class MainInfo {
    private String name;
    private String content;

    public MainInfo(String name, String content) {
        this.name = name;
        this.content = content;
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
