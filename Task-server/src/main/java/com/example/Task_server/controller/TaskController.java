package com.shimaa.taskservice.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.shimaa.taskservice.model.Task;
import com.shimaa.taskservice.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }
}
