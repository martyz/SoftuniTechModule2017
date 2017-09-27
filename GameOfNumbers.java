import java.util.Scanner;

public class GameOfNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1 = Integer.parseInt(console.nextLine());
        int num2 = Integer.parseInt(console.nextLine());
        int magicNumber = Integer.parseInt(console.nextLine());
        int counter = 0;
        String result = "";
        boolean pass = false;

        for (int i = num1; i <= num2 ; i++) {
            for (int j = num1; j <= num2 ; j++) {
                //System.out.printf("%d %d%n", i, j);
                counter++;
//                if (i >= magicNumber){
//                    System.out.println(result); return;}
                if (i + j == magicNumber){
                pass = true;
                    result = "Number found! " + i + " + " + j + " = " + magicNumber;
                }

            }
        }
        if (pass){
            System.out.println(result);
        } else {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
