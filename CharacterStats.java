

import java.util.Scanner;

public class CharacterStats {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        Integer[] arr = new Integer[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(console.nextLine());
        }

        System.out.printf("Name: %s%nHealth: |%s%s|%nEnergy: |%s%s|", name, repeat('|' , arr[0]), repeat('.', arr[1] - arr[0]),repeat('|', arr[2]), repeat('.', arr[3] - arr[2] ));
    }

    private static String repeat(char c, int n) {
        String result = "";
        for (int j = 0; j < n; j++) {
            result += c;
        }
        return  result;
    }
}
