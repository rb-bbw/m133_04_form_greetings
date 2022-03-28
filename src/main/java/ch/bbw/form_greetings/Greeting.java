package ch.bbw.form_greetings;

public class Greeting {
    private long id;
    private String content;
    private String type;
    private String[] allTypes = {"heart", "friendly", "business", "family"};

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String[] getAllTypes() {
        return allTypes;
    }
    public void setAllTypes(String[] allTypes) {
        this.allTypes = allTypes;
    }
}
