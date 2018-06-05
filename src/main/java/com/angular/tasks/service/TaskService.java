package com.angular.tasks.service;

import com.angular.tasks.domain.Task;
import org.springframework.stereotype.Service;

@Service
public interface TaskService  {

     Iterable<Task> listTasks();

     Task save(Task task);


}
