package week1.day2.assignments;

public class Car {
	
	//create methods for this class
	
	public boolean applyBreak() {
		return true;
	}
	public int applyGear() {
		int applyGear = 3;
		return applyGear;
	}
	public String switchOnAc() {
		String switchOnAc = "ON";
		return switchOnAc;
	}
	public float applyAcclerate() {
		float applyAcclerate = 171.46f;
		return applyAcclerate;
	}

	public static void main(String[] args) {
		
		//create object and excute for same class
		
		Car c = new Car();
		System.out.println(c.applyBreak());
		System.out.println(c.applyGear());
		System.out.println(c.switchOnAc());
		System.out.println(c.applyAcclerate());

	}

}
