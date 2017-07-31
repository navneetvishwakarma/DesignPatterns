package xask00.study.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterDemo {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		// DB Employee
		Employee empDB = new EmployeeDB("1", "Navneet", "Vishwakarma", "navneet.nifft@gmail.com");
		employees.add(empDB);
		
		Employee empLDAP = new EmployeeAdapterLDAP(new EmployeeLDAP("2", "Mark", "Smith", "mark@gmail.com"));
		employees.add(empLDAP);
		System.out.println(employees);

	}

}
