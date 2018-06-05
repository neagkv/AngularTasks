package com.angular.tasks.service;

import com.angular.tasks.domain.Task;
import com.angular.tasks.repsoitory.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {


    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> listTasks() {
        return this.taskRepository.findAll();
    }


    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
    }
}
