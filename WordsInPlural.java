import java.util.Scanner;

public class WordsInPlural {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();

        if (input.endsWith("y")){
            System.out.println(input.substring(0, input.length() - 1) + "ies");
        } else if (input.endsWith("o") || input.endsWith("s") || input.endsWith("x") || input.endsWith("z")) {
            System.out.println(input + "es");
        }
        else if (input.endsWith("ch") || input.endsWith("sh")) {
            System.out.println(input + "es");
        } else {
            System.out.println(input + "s");
        }

    }
}
