import java.util.*;

public class Hotel {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String month = console.nextLine();
        Integer nights = Integer.parseInt(console.nextLine());
        Double studioPrice = 0d;
        Double doublePrice = 0d;
        Double suitePrice = 0d;

        if (month.equals("May") || month.equals("October")){
            studioPrice = 50d;
            doublePrice = 65d;
            suitePrice = 75d;
            if (nights > 7){
                studioPrice = studioPrice * 0.95;
            }

        }
        if (month.equals("June") || month.equals("September")){
            studioPrice = 60d;
            doublePrice = 72d;
            suitePrice = 82d;
            if (nights > 140) {
                doublePrice = doublePrice * 0.9;
            }
        }
        if (month.equals("July") || month.equals("August") || month.equals("December")){
            studioPrice = 68d;
            doublePrice = 77d;
            suitePrice = 89d;
            if (nights > 14){
                suitePrice = suitePrice * 0.85;
            }
        }
        if ((month.equals("September") || month.equals("October")) && nights > 7){
            studioPrice = (studioPrice * nights) - studioPrice;
        } else {
            studioPrice = studioPrice * nights;
        }

        System.out.printf("Studio: %.2f lv.\n" +
                "Double: %.2f lv.\n" +
                "Suite: %.2f lv.\n", studioPrice, doublePrice * nights, suitePrice * nights);
    }

}
