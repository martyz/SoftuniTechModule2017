import java.util.Scanner;

public class DebitCardNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = "";
        for (int i = 0; i < 4; i++) {
            str += String.format("%04d", Integer.parseInt(console.nextLine())) + " ";
        }
        System.out.println(str);
    }
}
