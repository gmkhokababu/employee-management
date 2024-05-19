package com.project.employee;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int employeeId;
	String name;
	String email;
	String phoneNo;
	@ManyToOne
    @JoinColumn(name = "department_id")
	Department departmentId;
	@ManyToOne
    @JoinColumn(name = "role_id")
	Role roleId;
	Date dateOfJoining;
	Double salary;
	String address;
	public Employee() {
		super();
	}
	public Employee(int employeeId, String name, String email, String phoneNo, Department departmentId, Role roleId,
			Date dateOfJoining, Double salary, String address) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.departmentId = departmentId;
		this.roleId = roleId;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.address = address;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Department getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Department departmentId) {
		this.departmentId = departmentId;
	}
	public Role getRoleId() {
		return roleId;
	}
	public void setRoleId(Role roleId) {
		this.roleId = roleId;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo
				+ ", departmentId=" + departmentId + ", roleId=" + roleId + ", dateOfJoining=" + dateOfJoining
				+ ", salary=" + salary + ", address=" + address + ", getEmployeeId()=" + getEmployeeId()
				+ ", getName()=" + getName() + ", getEmail()=" + getEmail() + ", getPhoneNo()=" + getPhoneNo()
				+ ", getDepartmentId()=" + getDepartmentId() + ", getRoleId()=" + getRoleId() + ", getDateOfJoining()="
				+ getDateOfJoining() + ", getSalary()=" + getSalary() + ", getAddress()=" + getAddress()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
