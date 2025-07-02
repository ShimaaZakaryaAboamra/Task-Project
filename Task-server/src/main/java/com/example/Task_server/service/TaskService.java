package com.shimaa.taskservice.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.shimaa.taskservice.model.Task;
import com.shimaa.taskservice.repository.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    // إضافات ممكنة (تحديث، حذف) حسب الحاجة
}
