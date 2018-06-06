import { Component, OnInit } from '@angular/core';
import {Task} from "../tasks.model";


@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

    tasks: Task[] = [];

  constructor() { }

  ngOnInit() {
      this.tasks.push( new Task(5,"Task 54",true,"08/01/1991"));
      this.tasks.push( new Task(54,"Task 52",false,"08/02/1991"));
      this.tasks.push( new Task(56,"Task 56",true,"08/03/1991"));
  }


  getDueDateLabel(task: Task){
      return task.completed ? 'label-success' : 'label-primary';
  }

  onTaskChangeEvent(event, Task) {

      console.log('Tasks had changed');
  }

}
