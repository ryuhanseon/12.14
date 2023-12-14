package org.example;

import lombok.Getter;

@Getter
public class Article {

    private int id;
    private String content;
    private String title;

    public Article(int id, String content, String title){
            this.id = id;
            this.content = content;
            this.title = title;
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
