import {HttpClient} from "@angular/common/http";
import {Injectable} from "@angular/core";

@Injectable()
export class TasksService {

    constructor(private http: HttpClient){

    }

    getTasks(){

        return this.http.get('api/tasks');

    }

}
