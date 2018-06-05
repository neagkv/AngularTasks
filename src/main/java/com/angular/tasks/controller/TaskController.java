package com.angular.tasks.controller;

import com.angular.tasks.domain.Task;
import com.angular.tasks.service.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"","/"})

    public Iterable<Task> listTasks() {

        return this.taskService.listTasks();

    }

    @PostMapping("/save")
    public  Task saveTask(@RequestBody Task task) {

        return this.taskService.save(task);
    }
}
