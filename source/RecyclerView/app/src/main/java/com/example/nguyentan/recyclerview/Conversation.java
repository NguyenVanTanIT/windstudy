package com.example.nguyentan.recyclerview;

/**
 * Created by Nguyen Tan on 11/26/2018.
 */

public class Conversation  {
    public String  usernaem, time, sortContent,avataUrl;

    public Conversation(String usernaem, String time, String sortContent, String avataUrl) {
        this.usernaem = usernaem;
        this.time = time;
        this.sortContent = sortContent;
        this.avataUrl = avataUrl;
    }

    public String getUsernaem() {
        return usernaem;
    }

    public void setUsernaem(String usernaem) {
        this.usernaem = usernaem;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSortContent() {
        return sortContent;
    }

    public void setSortContent(String sortContent) {
        this.sortContent = sortContent;
    }

    public String getAvataUrl() {
        return avataUrl;
    }

    public void setAvataUrl(String avataUrl) {
        this.avataUrl = avataUrl;
    }
}
