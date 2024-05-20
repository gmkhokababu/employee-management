import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employees } from '../Model/employees';

@Injectable({
  providedIn: 'root'
})
export class ControllerService {

  url:any="http://localhost:8080/";

  constructor(private http:HttpClient) { }

  //All Employee
  public allemployee():Observable<Employees>{
    this.url="http://localhost:8080/all-employee";
    return this.http.get<Employees>(this.url);
  }




}
