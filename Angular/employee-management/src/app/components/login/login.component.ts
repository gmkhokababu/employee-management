import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  userId:any;
  password:any;

  user:any;
  constructor(private myservice:ControllerService, private http:HttpClient) { }

  ngOnInit(): void {
  }

  check(){
    
  }

}
