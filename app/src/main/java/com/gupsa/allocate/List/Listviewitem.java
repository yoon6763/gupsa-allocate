package com.gupsa.allocate.List;

public class Listviewitem {

    private String contentStr;
    private String titleStr;

    public void setTitle(String title){
        titleStr=title;
    }
    public void setContent(String content){
        contentStr=content;
    }

    public String getContent(){
        return this.contentStr;
    }
    public String getTitle(){
        return this.titleStr;
    }
}