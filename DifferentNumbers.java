import java.util.Scanner;

public class DifferentNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        int num2 = Integer.parseInt(console.nextLine());

        if (Math.abs(num - num2) >4 ){
            for (int i = num; i <= num2 ; i++) {
                for (int j = i +1; j <= num2 ; j++) {
                    for (int k = j + 1; k <= num2 ; k++) {
                        for (int l = k +1; l <= num2 ; l++) {
                            for (int m = l + 1; m <= num2 ; m++) {
                                System.out.printf("%d %d %d %d %d%n", i, j, k, l, m);

                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("No");
        }

    }
}
