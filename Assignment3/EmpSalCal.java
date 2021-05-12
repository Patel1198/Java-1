import java.util.Scanner;
//The above statement will import scanner class
public class EmpSalCal {
    public static void main(String[] args) {
        int num=0,annSal;
        double fullTime,hoursWorked,partTime,sessional,partialLoad;
        final float RATEOFPAYPT=30.00f,RATEOFPAYS=32.00f,RATEOFPAYPL=35.00f;
        //fixed values of rate of pay
        Scanner input=new Scanner(System.in);
        /* The above statement will create new instance variable of
               scanner class and it will take inputs from console */
        System.out.println("Enter Type of Employee");
        System.out.println("1. Full-Time");
        System.out.println("2. Part-Time");
        System.out.println("3. Sessional");
        System.out.println("4. Partial Load");
        num=input.nextInt();
        //take the input from the user
        if (num==1)
        //if given input is 1 then it will execute below statement
        {
            System.out.println("Enter Annual Salary: ");
            annSal=input.nextInt();
            //take input of annual salary from the user
            fullTime=(double) annSal/44;
            //it will count the full time salary and will have value in double.
            System.out.println("Entered Salary: $" +annSal);
            System.out.println("Total Pay: $" +fullTime+"0");
        }
        else if (num==2)
        //if the input number is 2 then it will execute the below statements
        {
            System.out.println("Enter Hours Worked: ");
            hoursWorked=input.nextDouble();
            //will take the input ,number of hours, from user
            partTime=(double) hoursWorked*RATEOFPAYPT;
            //will count the part time salary and give output in double
            System.out.println("Entered Hours Worked: " + hoursWorked);
            System.out.println("Total Pay: $" +partTime+"0");
        }
        else if (num==3)
        //if the entered number 3 is then execute the below statements
        {
            System.out.println("Enter Hours Worked: ");
            hoursWorked=input.nextDouble();
            //will take number of hours as input from user
            sessional=(double) hoursWorked*RATEOFPAYS;
            //will count sessional salary  in double
            System.out.println("Entered Hours Worked: " + hoursWorked);
            System.out.println("Total Pay: $" +sessional+"0");
        }
        else if (num==4)
        //if the input of user is 4 then it will execute below statements
        {
            System.out.println("Enter Hours Worked: ");
            hoursWorked=input.nextDouble();
            //will take number of hours as input from user
            partialLoad=(double) hoursWorked*RATEOFPAYPL;
            //will count partial load salary in double
            System.out.println("Entered Hours Worked: " + hoursWorked);
            System.out.println("Total Pay: $" +partialLoad+"0");
        }
        else if (num>=5)
        /*if the input from user is 5 or any bigger number than 5,
          it will execute below statements */
        {
            System.out.println("Error! You Entered an Invalid Employee Type.");
        }

    }
}
