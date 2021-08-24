import java.util.Scanner;
class Pizza {
    final double TOPPING_COST = 1.75, SMALL_COST = 8.0, MED_COST = 10.0, LARGE_COST = 12.0;
    final int MAX_TOPPINGS = 10,SMALL = 1,MEDIUM = 2,LARGE = 3;
    int size = 0, toppings = 0;
//contant values
    public Pizza() {
        //empty
    }

    public Pizza(int size, int toppings) {
        this.size = size;
        this.toppings = toppings;
    }
// method for size and toppings
    public int getSize() {
        return size;
    }
    public int getToppings() {
        return toppings;
    }
    public void setSize(int size) {
        if (size > 0 && size <= 3) {
            this.size = size;
        } else {
            System.out.println("Entered Size doesn't match with the stored size");
            System.exit(0);
        }
    }

    public void setToppings(int toppings) {
        if (toppings>= 1 && toppings<= 10) {
            this.toppings = toppings;
        } else {
            System.out.println("Invalid Entry! Number should be between 1 and 10.");
            System.exit(0);
        }
    }
 
    public double calcPrice() {
        double Price=0.0;
        int size = getSize();
        int toppings = getToppings();
        if (size == 1) {
            Price = SMALL_COST;
        } else if (size == 2) {
            Price = MED_COST;
        } else if (size == 3) {
            Price = LARGE_COST;
        }
        Price+= TOPPING_COST*getToppings();
        return Price;
    }

    public String toString() {
        String Display=null;
        if (size == 1) {
            Display = "Small Pizza";
        }
        else if (size == 2) {
            Display = "Medium Pizza";
        }
        else if (size == 3) {
            Display = "Large Pizza";
        }
        Display = Display + "\n" + this.toppings + " Toppings" + "\nTotal Bill: $" + calcPrice();
        return Display;
    }

    public static class PizzaOrder {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Pizza objPizza = new Pizza();
            System.out.println("Enter the size of Pizza");
            System.out.println("Choose Number:\n for Small Pizza= 1 \n Medium Pizza= 2 \n Large Pizza= 3");
            int size = input.nextInt();
            objPizza.setSize(size);
            System.out.println("Enter Number of Toppings(Number should be between 1 and 10): ");
            int toppings = input.nextInt();
            objPizza.setToppings(toppings);
            System.out.println(objPizza.toString());
        }
    }
}
