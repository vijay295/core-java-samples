package tran.interfa;

import java.util.ArrayList;
import java.util.List;

public class VehicleImpl implements Vehicle {
	

	@Override
	public String setModelName(String model) {
		System.out.println(model);
		return model;
	}

	@Override
	public String setNumberOfWheels(int number) {
		System.out.println(number);
		return null;
	}

	@Override
	public String color(String color) {
		System.out.println(color);
		return null;
	}
	
	public static void main(String args[]) {
		//Anonymous class
		Vehicle vehicle = new Vehicle() {
			
			@Override
			public String setNumberOfWheels(int number) {
				System.out.println(number);
				return null;
			}
			
			@Override
			public String setModelName(String model) {
				System.out.println(model);
				return null;
			}
			
			@Override
			public String color(String color) {
				System.out.println(color);
				return null;
			}
		};
		vehicle.setModelName("BMW");
		vehicle.setNumberOfWheels(4);
		vehicle.color("blue");
		
		Vehicle vImpl = new VehicleImpl();
		vImpl.setModelName("Eicher");
		vImpl.setNumberOfWheels(10);
		vImpl.color("red");
		
		List<String> list = new ArrayList<>();
	}
	}
