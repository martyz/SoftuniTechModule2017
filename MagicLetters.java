import java.util.Scanner;

public class MagicLetters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char one = console.nextLine().charAt(0);
        char two = console.nextLine().charAt(0);
        char exeptChar = console.nextLine().charAt(0);
        StringBuilder strb = new StringBuilder();

        int start = (int)one;
        int end = (int)two;
        int noPrint = (int)exeptChar;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end ; j++) {
                for (int k = start; k <= end ; k++) {
                    if (i != noPrint && j != noPrint && k != noPrint ){
                        strb.append(Character.toChars(i));
                        strb.append(Character.toChars(j));
                        strb.append(Character.toChars(k));
                        strb.append(" ");
                    }
                }
            }
        }

        System.out.println(strb.toString());
    }
}
