package week1.day2.assignments;

public class TwoWheeler {
	
	//Create a class for TwoWheeler and declare below global variables with appropriate values
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 300169266;
	boolean isPunctured = false;
	String bikeName = "NS160";
	double runningKM = 73000.58;

	public static void main(String[] args) {
		
		//create object for TwoWheeler and call all the variables inside main method and print the values
		
		TwoWheeler bike = new TwoWheeler();
		System.out.println("noOfWheels = "+bike.noOfWheels);
		System.out.println("noOfMirrors = " +bike.noOfMirrors);
		System.out.println("chassisNumber = "+bike.chassisNumber);
		System.out.println("isPunctured ? " +bike.isPunctured);
		System.out.println("What is bikeName ? "+bike.bikeName);
		System.out.println("runningKM about "+bike.runningKM);
	}

}
