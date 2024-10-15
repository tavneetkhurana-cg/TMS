package com.capg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> { 
    // List<Task> findByAssignedUser(User user);
    // List<Task> findByStatus(TaskStatus status);
    // List<Task> findByPriority(TaskPriority priority);
    // List<Task> findByAssignedUserAndStatus(User user, TaskStatus status);
    // List<Task> findByAssignedUserAndPriority(User user, TaskPriority priority);
    // List<Task> findByStatusAndPriority(TaskStatus status, TaskPriority priority);
    // List<Task> findByAssignedUserAndStatusAndPriority(User user, TaskStatus status, TaskPriority priority);

}
