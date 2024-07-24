package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

public class Todo {
    private int id;
    private String user;
    private String description;
    private boolean done;
    private String targetDate;

    public Todo(int id, String user, String description, LocalDate date, boolean done) {
        super();
        this.id = id;
        this.user = user;
        this.description = description;
        this.targetDate = date.toString();
        this.done = done;
    }

    public int getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public String getTargetDate() {
        return targetDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setDesc(String description) {
        this.description = description;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setTargetDate(String targetDate) {
        this.targetDate = targetDate;
    }

    @Override
    public String toString() {
        return "Todo [id=%s, user=%s, description=%s, targetDate=%s, done=%s]".formatted(id,
                user, description, targetDate, done);
    }
}
