import java.util.Scanner;


public class PaintLab9
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
    	(new PaintLab9()).run();

    }

    public void run()
    {
    	Scanner s = new Scanner(System.in);
        System.out.print("Please enter amount of Wall space (in ft sq.):");
        double input1 = (double) s.nextInt();
        System.out.print("Please enter price per gallon of paint used:");
        double input2 = (double) s.nextInt();
        System.out.println("Total hours labor:" + hoursReqd(input1));
        System.out.println("Total gallons paint:" + gallonsReqd(input1));
        System.out.println("Total Cost:" + moneyReqd(input2, input1));
        s.close();
    }

    public double gallonsReqd(double areaCov)  //takes area gives gallons
    {
        return (areaCov / 120); //returns value to be used in paintUsed
    }
    public double hoursReqd(double paintUsed)  // takes area gives hours
    {
        return (gallonsReqd(paintUsed) * 8);
    }
    public double moneyReqd(double dbl1, double dbl2)  // takes area and cost/gal
    {
        return (gallonsReqd(dbl1) * dbl2 * 1.00);
    }

}
