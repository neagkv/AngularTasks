import { Component, OnInit } from '@angular/core';
import {Task} from "../tasks.model";
import {TasksService} from "../tasks.service";


@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

    tasks: Task[] = [];

  constructor(private taskService: TasksService) { }

  ngOnInit() {

      this.taskService.getTasks()
          .subscribe(
              (tasks: any[]) => {
                  this.tasks = tasks
              },
              (error) => console.log(error)
          );
  }


  getDueDateLabel(task: Task){
      return task.completed ? 'label-success' : 'label-primary';
  }

    onTaskChange(event: Event, task: Task) {

        this.taskService.saveTask(task, (<HTMLInputElement>event.target).checked).subscribe();
    }

}
