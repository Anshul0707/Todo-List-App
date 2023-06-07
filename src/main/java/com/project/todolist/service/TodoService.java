package com.project.todolist.service;

import com.project.todolist.model.TodoItem;
import java.util.List;

public interface TodoService {

    List<TodoItem> getAllTodoItems();

    TodoItem createTodoItem(TodoItem todoItem);

    void deleteTodoItem(String id);
}
