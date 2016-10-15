package cntrl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import bean.Employee;

@RestController
public class BaseRestController 
{
	
	@RequestMapping(value = "/getEmployeeList", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Employee> getEmpLst()
	{
		Employee emp1 = new Employee(1, "E1");
		Employee emp2 = new Employee(2, "E2");
		Employee emp3 = new Employee(3, "E3");
		
		List<Employee> empLst = new ArrayList<Employee>();
		empLst.add(emp1);
		empLst.add(emp2);
		empLst.add(emp3);
		
		return empLst;
	}
	
	@RequestMapping(value="/getEmployeeList/{empId}", method = RequestMethod.GET, produces="application/json")
	public @ResponseBody Employee getEmployeeDtl(@PathVariable Integer empId)
	{
		System.out.println(empId);
		Employee emp1 = new Employee(1, "E1");
		return emp1;
	}

}
