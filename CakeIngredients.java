import java.util.Scanner;

public class CakeIngredients {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine(); int counter = 0;
        while (!input.equals("Bake!")){
            System.out.println("Adding ingredient " + input + ".");
            counter++;
            input = console.nextLine();

        }
        System.out.printf("Preparing cake with %d ingredients.", counter);
    }
}
