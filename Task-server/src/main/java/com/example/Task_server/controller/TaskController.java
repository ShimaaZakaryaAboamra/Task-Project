package com.example.Task_server.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.Task_server.model.Task;
import com.example.Task_server.service.TaskService;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    @ResponseBody // هنا ترجع JSON لأن الصفحة تعرض كل المهام API
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/user/{userId}")
    public String getTasksByUser(@PathVariable String userId, Model model) {
        List<Task> tasks = taskService.getTasksByAssignedUserId(userId);
        model.addAttribute("tasks", tasks);
        return "task-list"; // اسم صفحة HTML في templates
    }

    @PostMapping
    @ResponseBody // ترجع JSON لما تنشئ مهمة
    public Task createTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }
}
