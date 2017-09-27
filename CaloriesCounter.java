import java.util.Scanner;

public class CaloriesCounter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        int calories = 0;
        for (int i = 0; i < num; i++) {
            String input = console.nextLine().toLowerCase();
            switch (input){
                case "cheese": calories += 500;
                    break;
                case    "tomato sauce": calories += 150;
                    break;
                case "salami": calories += 600;
                    break;
                case "pepper": calories += 50;
                    break;
                    default:
                        break;
            }
        }
        System.out.printf("Total calories: %d",calories);
    }
}
