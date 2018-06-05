package com.angular.tasks.service;

import com.angular.tasks.domain.Task;
import com.angular.tasks.repsoitory.TaskRepository;

public class TaskServiceImpl implements TaskService {


    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> listTasks() {
        return this.taskRepository.findAll();
    }
}
