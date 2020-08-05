package train.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

class AgeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getAge().compareTo(o2.getAge());
	}
	
}

class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return  o1.getName().compareTo(o2.getName());
	}
	
}
public class EmployeeTestEx {
	
	public static void main(String args[]) {
		List<Employee> employeeList = new ArrayList<>();
        Random rand = new Random(); 
		for(int i=0;i <100; i++) {
			employeeList.add(new Employee(rand.nextInt(1000), "Emp-"+i, 28+i));
		}
		//Comparable interface to be implemented
		Collections.sort(employeeList);
		
		//Natural Sorting with Comparable Interface By Id
		System.out.println(employeeList);
		//By using comparator, Age
		Collections.sort(employeeList, new AgeComparator());
		System.out.println(employeeList);
		//By Using Comparator, By Name
		Collections.sort(employeeList, new NameComparator());
		System.out.println(employeeList);

		//To compare two objects we need to override equals and hashcode methods from java.lang.Object
		Employee employee = new Employee(1, "Vijay", 25);
		Employee employee3 = new Employee(1, "Vijay", 25);
		System.out.println(employee.equals(employee3));
		
		List<String> strList = new ArrayList<String>();
		strList.add("Z");
		strList.add("A");
		strList.add("E");
		strList.add("F");
		System.out.println(strList);
		Collections.sort(strList);
		System.out.println(strList);
	}
}
