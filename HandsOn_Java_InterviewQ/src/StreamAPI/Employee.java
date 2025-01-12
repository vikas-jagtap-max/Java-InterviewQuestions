package StreamAPI;

import java.time.LocalDate;

public class Employee {

	public Integer empId;
	public String name;
	public Double salary;
	public String role;
	public Integer age;
	public LocalDate DOJ;
	public String gender;
	public String department;

	public Employee(Integer empId, String name, Double salary, String role, Integer age, LocalDate dOJ, String gender,
			String department) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.role = role;
		this.age = age;
		DOJ = dOJ;
		this.gender = gender;
		this.department = department;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public LocalDate getDOJ() {
		return DOJ;
	}

	public void setDOJ(LocalDate dOJ) {
		DOJ = dOJ;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", role=" + role + ", age=" + age
				+ ", DOJ=" + DOJ + ", gender=" + gender + ", department=" + department + "]";
	}

}
