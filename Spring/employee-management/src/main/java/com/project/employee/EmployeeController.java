package com.project.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/employees")
@CrossOrigin("*")
public class EmployeeController {

	@Autowired
	private EmployeesRepo employeeRepo;
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private AttendanceRepo attendanceRepo;
	@Autowired
	private DepartmentRepo departmentRepo;
	@Autowired
	private RoleRepo roleRepo;
	
	public List<Employees> employees=new ArrayList<>();
	
	@GetMapping("/all-employee")
    public List<Employees> getAllEmployees() {
//       this.employees=employeeRepo.findAll();
		EmployeeDA da=new EmployeeDA();
		employees=da.allemployees();
        for (var i=0;i<employees.size();i++) {
        	System.out.println(employees.get(i).name);
        	}
        boolean check = false;
        if(employees!=null) {
        	check = true;
        }
        System.out.println(employees.size());
        System.out.println(check);
        return employees;
        
        
    }
	
}
