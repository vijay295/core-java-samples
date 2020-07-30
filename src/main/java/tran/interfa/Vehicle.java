package tran.interfa;

import java.util.List;

public interface Vehicle extends Automobile{
	
	String resoucrce ="VEHICLE";

	public String setModelName(String model);
	
	public String setNumberOfWheels(int number);
	
	public String color(String color);
}
