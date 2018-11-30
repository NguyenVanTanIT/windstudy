package com.example.nguyentan.recyclerview.messenger;

/**
 * Created by Nguyen Tan on 11/29/2018.
 */

public class Messenger {
    private String Content;
    private  int Going;
    private String UserName;

    public Messenger(String content, int going, String userName) {
        Content = content;
        Going = going;
        UserName = userName;

    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public int getGoing() {
        return Going;
    }

    public void setGoing(int going) {
        Going = going;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}
