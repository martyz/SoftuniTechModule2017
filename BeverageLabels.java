import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class BeverageLabels {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner console = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        String name = console.nextLine();
        int volume = Integer.parseInt(console.nextLine());
        int energy = Integer.parseInt(console.nextLine());
        int sugar = Integer.parseInt(console.nextLine());

        System.out.printf(Locale.FRENCH, "%dml %s:\n%skcal, %sg sugars", volume, name, df.format(volume * energy / 100d), df.format(volume * sugar / 100d));

    }
}
