package org.example;

public class Article {

    private int id;
    private String content;
    private String title;

    Article(int id, String content, String title){
            this.id = id;
            this.content = content;
            this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
