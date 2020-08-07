package exception.handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import train.collection.Employee;

class AgeException extends Exception {
	String message;
	public AgeException(String message) {
		this.message = message;
	}
}

class ExceptionOne {

	public void openFile() throws FileNotFoundException {
		FileInputStream fileInputStream = new FileInputStream("C:\\log\\portal-candidate\\app.log");	
		
	}
	
	public String getName(Employee employee) {
		if(employee == null) {
			return "";
		}
		return employee.getName();
	}
	
	public int getAge(Employee employee) throws AgeException {
		if(employee.getAge() <= 18) {
			throw new AgeException("Age Criteria is not met < 18");
		}
		return employee.getAge();
	}
	
	public void setVarargs(String...strings) {
		String[] str = strings;
		for (String string : strings) {
			System.out.println(string);

		}
	}
}
public class ExceptionBasic {
	
	public static void main(String args[])  {
		ExceptionOne exceptionOne = new ExceptionOne();
		try {
			exceptionOne.openFile();
			System.out.println("after exception thrown....");
		} catch (FileNotFoundException e) {
			System.out.println("Inside Catch Block....");
			//Send Email that i have got a exception.
			// I got an exception create a new file.
			e.printStackTrace();
		} finally {
			System.out.println("Inside Finally Block");
		}
		Employee employee = new Employee(1, "Test", 25);	
		System.out.println(exceptionOne.getName(employee));
		Employee employee2 = new Employee(2, "Test", 19);
		try {
			exceptionOne.getAge(employee2);
		} catch (AgeException e) {
			System.out.println(e.message);
		}
		
		exceptionOne.setVarargs("1", "2", "3", "4", "5", "6");
	}

}
