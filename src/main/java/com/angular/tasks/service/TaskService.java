package com.angular.tasks.service;

import com.angular.tasks.domain.Task;

public interface TaskService  {

    public Iterable<Task> listTasks();
}
