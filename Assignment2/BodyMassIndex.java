import java.util.Scanner;
//The above statement will import scanner class
public class BodyMassIndex {
    public static void main(String[] args) {
            Double htFt,htInches,height,weight,BMI;
            Scanner in=new Scanner(System.in);
            /* The above statement will create new instance variable of
               scanner class and it will take inputs from console */
            System.out.println("Enter your Height in ft and/or in inches");
            htFt=in.nextDouble();
            htInches=in.nextDouble();
            /*In the above statements System.out.println will print the
              words written in brackets while the another statements
              (htFt=input.nextDouble(); And htInches=input.nextDouble();
              will take inputs from user .*/
            height= (htFt)*12 + htInches;
            /* The above formula will convert feet into inches and
               give total height in inches at last.*/
            System.out.println("Enter weight in pounds(lb)");
            weight=in.nextDouble();
            BMI = (weight/(height*height))*703;
            // The above formula will calculate the body mass index 
            System.out.println("Your BMI figure is " + BMI);
            System.out.println("BMI \t \t \t \t \t BMI Category");
            System.out.println("Less than 15 \t \t \t Very severely underweight");
            System.out.println("Between 15 and 16 \t \t Severely underweight");
            System.out.println("Between 16 and 18.5 \t Underweight");
            System.out.println("Between 18.5 and 25 \t Normal(healthy weight)");
            System.out.println("Between 25 and 30 \t \t Overweight");
            System.out.println("Between 30 and 35 \t \t Moderately obese");
            System.out.println("Between 35 and 40 \t \t Severely obese ");
            System.out.println("Over 40 \t \t \t \t Very severely obese");
    }
}
