import java.util.Scanner;


public class PaintLab9LaborCost {

	/**
	 * @param args
	 */
	public static final double HOURLY_LABOR = 18.00;
	public static final Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Please enter amount of Wall space (in ft sq.):");
		double input1 = (double) s.nextInt();
		System.out.print("Please enter price per gallon of paint used:");
		double input2 = (double) s.nextInt();
		System.out.println("Total hours labor:" + hoursReqd(input1));
		System.out.println("Total gallons paint:" + gallonsReqd(input1));
		System.out.println("Total Cost:"+ moneyReqdForPaint(input2, input1));
		double temp = moneyReqdForLabor(input1) + moneyReqdForPaint(input1, input2);
		System.out.println("Total Cost with Labor:" + temp);
		

	}
	public static double gallonsReqd(double areaCov){ //takes area gives gallons
		return (areaCov/120); //returns value to be used in paintUsed
	}
	public static double hoursReqd(double area){ // takes area gives hours
		return (gallonsReqd(area)*8);
	}
	public static double moneyReqdForPaint(double dbl1, double dbl2){ // takes area and cost/gal
		return (gallonsReqd(dbl1)*dbl2*1.00);
	}
	public static double moneyReqdForLabor(double dbl1){
		return (hoursReqd(dbl1)*HOURLY_LABOR);		
	}

}
