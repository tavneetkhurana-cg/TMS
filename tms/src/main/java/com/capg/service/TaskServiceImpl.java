package com.capg.service;

import com.capg.entity.Task;
import com.capg.repository.TaskRepository;
import java.util.List;
import java.util.Optional;

public class TaskServiceImpl {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    
    // getAll tasks
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // create task
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    // update task
    public Task updateTask(Long id, Task updatedTask) {
        Optional<Task> existingTaskOptional = taskRepository.findById(id);
        if (existingTaskOptional.isPresent()) {
            Task existingTask = existingTaskOptional.get();
            existingTask.setName(updatedTask.getName());
            existingTask.setDescription(updatedTask.getDescription());
            // Update other fields as necessary
            return taskRepository.save(existingTask);
        } else {
            throw new RuntimeException("Task not found with id " + id);
        }
    }
}
