import java.util.Scanner;

public class RestaurantDiscount {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        String typePackage = console.nextLine();
        double price = 0; int discount = 0; String hall = "";

        if (num <= 50){
            price = 2500d;
            hall = "Small Hall";
        } else if (num >50 && num <=100){
            price = 5000d; hall = "Terrace";
        } else if (num >100 && num <= 120){
            price = 7500d; hall = "Great Hall";
        } else {
            System.out.println("We do not have an appropriate hall."); return;
        }

        switch (typePackage){
            case "Normal": price += 500; price = price - price * 0.05;
                break;
            case "Gold": price += 750; price = price - price * 0.1;
                break;
            case "Platinum": price += 1000; price = price - price * 0.15;
                break;
            default:
                break;
        }

        System.out.printf("We can offer you the %s%nThe price per person is %.2f$", hall, price / num);

    }
}
