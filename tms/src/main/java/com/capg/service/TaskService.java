package com.capg.service;

import com.capg.entity.Task;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface TaskService {
    List<Task> getAllTasks();
    Task createTask(Task task);
    Task updateTask(Long id, Task updatedTask);
    void deleteTask(Long id);
}
