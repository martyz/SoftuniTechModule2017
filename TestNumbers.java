import java.util.Scanner;

public class TestNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1 = Integer.parseInt(console.nextLine());
        int num2 = Integer.parseInt(console.nextLine());
        int maxNumber = Integer.parseInt(console.nextLine());
        int before = 0; int counter = 0;

        for (int i = num1; i >= 1 ; i--) {
            for (int j = 1; j <= num2 ; j++) {


                //System.out.printf("%d + 3 * %d  * %d = %d  -> count %d%n " ,before, i, j, before + 3 * i * j, counter);
                //System.out.println(before);
                if (before >= maxNumber){
                    break;
                }
                counter++;
                before += 3 * i * j;



            }
        }
        if (before >= maxNumber ){
            System.out.printf("%d combinations%nSum: %d >= %d", counter, before, maxNumber);
        } else {
            System.out.printf("%d combinations%nSum: %d", counter, before);
        }

    }
}
