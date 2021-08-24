import java.util.Scanner;
//The above statement will import scanner class
public class PowerMath {
    public static void main(String[] args) {
        int A=1,b=2,pow;
        Scanner input=new Scanner(System.in);
        /*The above statement will create new instance variable of
         scanner class and it will take inputs from console */
        pow=(int)Math.pow(A,b);
        /* The above formula will give the value of A to the power of b
           and (int) means the answer would be in integer.*/
        System.out.println("A \t b \t pow(A,b)");
        System.out.println(+ A+" \t "+ b+ "\t " + pow);
        A = A + 1;
        b = b + 1;
        //The above two statements will increase the value of A and b by 1
        pow=(int)Math.pow(A,b);
        System.out.println(+ A+" \t "+ b+ "\t " + pow);
        A = A + 1;
        b = b + 1;
        pow=(int)Math.pow(A,b);
        System.out.println(+ A+" \t "+ b+ "\t " + pow);
    }
}
