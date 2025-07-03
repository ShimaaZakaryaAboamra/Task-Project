package com.example.Task_server.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Task_server.model.Task;
import com.example.Task_server.repository.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    // Retrieve all tasks from the database
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // جلب المهام حسب assignedUserId (رقم المستخدم)
    public List<Task> getTasksByAssignedUserId(String assignedUserId) {
        return taskRepository.findByAssignedUserId(assignedUserId);
    }


    // Save a new task or update an existing one
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }
}
