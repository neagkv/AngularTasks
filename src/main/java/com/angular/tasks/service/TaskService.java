package com.angular.tasks.service;

import com.angular.tasks.domain.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService  {

    public Iterable<Task> listTasks();
}
