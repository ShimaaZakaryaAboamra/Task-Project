package com.example.Task_server.repository;

import com.example.Task_server.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // دالة تجيب كل المهام المرتبطة بمعرف مستخدم معين
    List<Task> findByAssignedUserId(String assignedUserId);
}
