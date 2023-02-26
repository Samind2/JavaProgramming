
import java.util.Scanner;
public class Exercise57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nomal_hour");
        double Nomal_hour = scan.nextDouble();
        System.out.println("ot_hour");
        double ot_hour = scan.nextDouble();
        System.out.println("Nomal_rate");
        double Nomal_rate = scan.nextDouble();
        double n_pay = Nomal_hour * Nomal_rate;
        double ot_pay = ot_hour*(1.5 * Nomal_rate);
        double total_pay = n_pay + ot_pay;
        System.out.println(n_pay + "บาท" );
        System.out.println(ot_pay + "บาท" );
        System.out.println(total_pay + "บาท" );
    }
}
