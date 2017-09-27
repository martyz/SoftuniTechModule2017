import java.util.Scanner;

public class CountTheIntegers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int counter = 0;

        while (true){
             try {
                 int num = Integer.parseInt(console.nextLine());
                 counter++;
             } catch (Exception e){
                 System.out.println(counter); return;
             }
        }
    }
}
