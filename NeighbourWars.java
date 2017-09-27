import java.util.Scanner;

public class NeighbourWars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int peshoDamage = Integer.parseInt(console.nextLine());
        int goshoDamage = Integer.parseInt(console.nextLine());

        int healthPesho = 100;
        int healthGosho = 100;
        String winner = "";

        int counter = 0;

        while (true){
            counter++;
            if (counter % 2 != 0){
                healthGosho -=  peshoDamage;
                winner = "Pesho";
                if (healthGosho <= 0){ break;}
                System.out.printf("Pesho used Roundhouse kick and reduced Gosho to %d health.%n", healthGosho);
            } else {
                healthPesho -= goshoDamage;
                winner = "Gosho";
                if (healthPesho <= 0){break;}
                System.out.printf("Gosho used Thunderous fist and reduced Pesho to %d health.%n", healthPesho);
            }
            if (counter % 3 == 0){
                healthGosho += 10;
                healthPesho += 10;
            }
        }
        System.out.printf("%s won in %dth round.", winner, counter);
    }
}
