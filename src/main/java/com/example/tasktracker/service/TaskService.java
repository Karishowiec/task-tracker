package com.example.tasktracker.service;

import com.example.tasktracker.model.Task;
import com.example.tasktracker.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Optional;

@Component
public class TaskService {

    private  final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    public Task updateTask(Task task) {
        return taskRepository.save(task);
    }
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public List<Task> findAllTask() {
        return null;
    }



    public List<Task> findTaskByStatus(String status) {
        return taskRepository.findByStatus(status);
    }

}
