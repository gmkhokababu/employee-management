import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { AdminComponent } from './components/admin/admin.component';
import { DashboardComponent } from './components/admin/dashboard/dashboard.component';
import { EmployeesComponent } from './components/employees/employees.component';
import { DepartmentsComponent } from './components/departments/departments.component';

const routes: Routes = [
  {path:'',component:LoginComponent},
  {path:'admin',component:AdminComponent,
    children:[
      {path:'',component:DashboardComponent},
      {path:'all-employees',component:EmployeesComponent},
      {path:'departments',component:DepartmentsComponent}
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
