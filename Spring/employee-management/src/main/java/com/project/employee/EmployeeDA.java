package com.project.employee;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.*;

public class EmployeeDA extends MySqlConnection{
	
	String allemployees="select * from employees";

	
	public List<Employees> employees=new ArrayList<>();
	public List<Employees> allemployees(){
		System.out.println("dao");
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(allemployees);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				employees.add(new Employees(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6),rs.getDate(7),rs.getDouble(8),rs.getString(9)));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return employees;
	}
	
	
	
	
}
