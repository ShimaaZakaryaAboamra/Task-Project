package com.example.Task_server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/create-task")
    public String showCreateTaskPage() {
        return "task";
    }

    @GetMapping("/tasks")
    public String showAllTasksPage() {
        return "task-list"; // اسم الملف داخل templates
    }


}
