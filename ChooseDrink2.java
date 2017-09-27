import java.util.Scanner;

public class ChooseDrink2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        int quantity  =  Integer.parseInt(console.nextLine());
        if (input.equals("Athlete")){
            System.out.printf("The %s has to pay %.2f.", input, quantity * 0.70);
        } else  if (input.equals("Businessman") || input.equals("Businesswoman")){
            System.out.printf("The %s has to pay %.2f.", input, quantity * 1.0);
        } else  if (input.equals("SoftUni Student")){
            System.out.printf("The %s has to pay %.2f.", input, quantity * 1.70);
        } else {
            System.out.printf("The %s has to pay %.2f.", input, quantity * 1.20);
        }
    }
}
