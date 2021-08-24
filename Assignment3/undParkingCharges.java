import java.util.Scanner;
//The above statement will import scanner class
public class undParkingCharges {
    public static void main(String[] args) {
        final float SPECIALRATE=1.00f,REGULARRATE=2.00f,MAXRATE=120.00f,
                DISRATEFORMOREHOURS=1.50f;
        //fixed values of different parking rates
        double numHoursParked,chragePerHours,totalCharge;
        int hours=0;
        String s1="yes",s2="no";
        Scanner input = new Scanner(System.in);
         /* The above statement will create new instance variable of
               scanner class and it will take inputs from console */
        System.out.println("Number of Hours Parked is?");
        numHoursParked=input.nextFloat();
        //take the input from the user in float
        System.out.println("Do You Have a Special Membership Card? Yes or No?");
        String ans=input.next();
        //take the input from the user in words
        if((s1.equalsIgnoreCase(ans))&&numHoursParked<=120)
        /*if given input is yes and number of hours parked is less than or
          equal to 120 then it will execute below statement
        */
        {
            System.out.println("Hourly Rate: $" +SPECIALRATE+"0");
            System.out.println("Number of Hours Charged: " +numHoursParked);
            totalCharge=(double) (Math.ceil(numHoursParked))*SPECIALRATE;
            /*will multiply number of hours parked with special rate and give
            the final answer in double
            */
            System.out.println("Total Charge: $" +totalCharge+"0");
        }
        else if ((s1.equalsIgnoreCase(ans)) && numHoursParked>120)
        /*if given input is yes and number of hours parked is greater than
          120 then it will execute below statement
        */
        {
            System.out.println("Hourly Rate: $" +SPECIALRATE+ "0");
            System.out.println("Number of Hours Charged: " +numHoursParked);
            System.out.println("Total Charge: $" +MAXRATE+ "0");
        }
        else if ((s2.equalsIgnoreCase(ans)) && numHoursParked>=80)
        /* if given input is no and number of hours parked is greater than or
           equal to 80 then it will execute below statement
        */        {
            System.out.println("Hourly Rate: $" +DISRATEFORMOREHOURS+ "0");
            System.out.println("Number of Hours Charged: " +numHoursParked);
            System.out.println("Total Charge: $" +MAXRATE+ "0");
        }
        else if((s2.equalsIgnoreCase(ans)) && numHoursParked<=15)
        /*if given input is no and number of hours parked is less than
          or equal to 15 then it will execute below statement
        */
        {
            System.out.println("Hourly Rate: $" +REGULARRATE+"0");
            System.out.println("Number of Hours Charged: " +numHoursParked);
            totalCharge=(double) (Math.ceil(numHoursParked))*REGULARRATE;
            /* will multiply number of hours parked with regular rate and give
               the final answer in double
            */
            System.out.println("Total Charge: $" +totalCharge+"0");
        }
        else if ((s2.equalsIgnoreCase(ans)) && numHoursParked>15)
        /*if given input is no and number of hours parked is greater than
          15 then it will execute below statement
        */
        {
            System.out.println("Hourly Rate: $" +DISRATEFORMOREHOURS+"0");
            System.out.println("Number of Hours Charged: " +numHoursParked);
            totalCharge=(double) (Math.ceil(numHoursParked))*DISRATEFORMOREHOURS;
            /* will multiply number of hours parked with discounted rate and give
               the final answer in double 
            */
            System.out.println("Total Charge: $" +totalCharge+"0");
        }
        else
        //if user enter anything then yes or no it will execute below statement
            {
                System.out.println("Invalid Input");
            }
    }
}
