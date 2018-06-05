package com.angular.tasks.controller;

import com.angular.tasks.domain.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {


    @GetMapping(value = {"","/"})

    public Iterable<Task> listTasks() {

        return null;


    }
}
