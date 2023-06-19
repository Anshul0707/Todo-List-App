package com.project.todolist.controller;

import com.project.todolist.model.TodoItem;
import com.project.todolist.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoController {
    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public List<TodoItem> getTodoItems() {
        return todoService.getAllTodoItems();
    }

    @PostMapping("/")
    public TodoItem createTodoItem(@RequestBody TodoItem todoItem) {
        return todoService.createTodoItem(todoItem);
    }

    @DeleteMapping("/{id}")
    public void deleteTodoItem(@PathVariable String id) {
        todoService.deleteTodoItem(id);
    }
}

