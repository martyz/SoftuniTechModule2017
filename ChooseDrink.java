import java.util.Scanner;

public class ChooseDrink {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        if (input.equals("Athlete")){
            System.out.println("Water");
        } else  if (input.equals("Businessman") || input.equals("Businesswoman")){
            System.out.printf("Coffee");
        } else  if (input.equals("SoftUni Student")){
            System.out.println("Beer");
        } else {
            System.out.println("Tea");
        }
    }
}
