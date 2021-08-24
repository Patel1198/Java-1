import java.util.Scanner;
//The above statement will import scanner class
public class FlipCoin {
    public static void main(String[] args) {
        String head,coin,tail;
        //String class names
        Scanner input=new Scanner(System.in);
        /*The above statement will create new instance variable of
         scanner class and it will take inputs from console */
        System.out.println("Head or Tail ??");
        coin=input.next();
        /* In the above statements System.out.println will print the
           words written in brackets while the another statement
           (coin=input.next();) will take input from user .*/
        int flipCoin=(int)Math.rint(Math.random());
        /* The above formula(Math.random) will generate any number
           between o and 1.Another function(Math.rint) will round
           of the value in integer.*/
        String res=(flipCoin==0)? "head":"tail";
        /* The above statement will give compare the flipCoin result
           if its 0 then it will give head otherwise it will give tail. */
        if(coin.equalsIgnoreCase(res)) {
            System.out.println("You Win");
        }
          else {
            System.out.println("Better Luck Next Time");
        }
          /* The above statements will compare coin and res. If both are
             equal(Ignoring case) then it will give first statement else it will
             give another statement*/
    }
}
