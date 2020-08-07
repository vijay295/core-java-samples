package train.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cricketer implements Serializable {
	
	private int score;
	
	private String name;
	
	private int noOfMatches;

	public Cricketer(int score, String name) {
		super();
		this.score = score;
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getNoOfMatches() {
		return noOfMatches;
	}

	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}

	@Override
	public String toString() {
		return "Cricketer [score=" + score + ", name=" + name + ", noOfMatches=" + noOfMatches + "]";
	}

	
	
	
	
}

public class SerializableEx {
	public static void main(String args[]) throws IOException {
		Cricketer sachin = new Cricketer(100, "Sachin");
		sachin.setNoOfMatches(350);
		ObjectOutputStream outputStream = null;
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("C:\\temp\\sachin.ser");
			outputStream = new ObjectOutputStream(fileOutputStream);
			outputStream.writeObject(sachin);
			sachin.setName("Sachin Tendulkar");
			FileInputStream fileInputStream = new FileInputStream("C:\\temp\\sachin.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Cricketer sachinSer = (Cricketer) objectInputStream.readObject();
			objectInputStream.close();
			System.out.println(sachinSer);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(outputStream != null) {
				outputStream.close();
			}
		} 
		Cricketer dravid = new Cricketer(110, "Dravid");
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("C:\\temp\\dravid.ser");
			outputStream = new ObjectOutputStream(fileOutputStream);
			outputStream.writeObject(dravid);
			
			FileInputStream fileInputStream = new FileInputStream("C:\\temp\\dravid.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			Cricketer dravidSer = (Cricketer) objectInputStream.readObject();
			objectInputStream.close();
			System.out.println(dravidSer);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(outputStream != null) {
				outputStream.close();
			}
		} 
	}
	

}
