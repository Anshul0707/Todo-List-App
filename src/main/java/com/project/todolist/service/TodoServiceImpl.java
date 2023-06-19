package com.project.todolist.service;

import com.project.todolist.model.TodoItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{

    private List<TodoItem> todoItems;

    public TodoServiceImpl() {
        todoItems = new ArrayList<>();
    }

    @Override
    public List<TodoItem> getAllTodoItems() {
        return todoItems;
    }

    @Override
    public TodoItem createTodoItem(TodoItem todoItem) {
        todoItems.add(todoItem);
        return todoItem;
    }

    @Override
    public void deleteTodoItem(String id) {
        todoItems.removeIf(item -> item.getId().equals(id));
    }
}
