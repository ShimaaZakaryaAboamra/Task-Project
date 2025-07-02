package com.shimaa.taskservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shimaa.taskservice.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
