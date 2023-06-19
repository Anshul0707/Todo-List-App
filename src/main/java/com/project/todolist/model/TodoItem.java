package com.project.todolist.model;

import lombok.Data;

@Data
public class TodoItem {
    private String id;
    private String title;
    private String description;


    public TodoItem(String id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
}
