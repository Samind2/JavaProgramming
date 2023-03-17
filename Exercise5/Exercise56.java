
import java.util.Scanner;
public class Exercise56 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float domestic = 1;
            float commercial = 2;
            System.out.println("type");
            float type = scan.nextFloat();
            System.out.println("water");
            float water = scan.nextFloat();
            float total = 100;
            if (type == 1) {
                double pay =  (total * water) * 0.05;
                System.out.println(pay + "บาท" );
            } else {
                if (type == 2) {
                double pay = (total * water) * 0.09;
                System.out.println(pay + "บาท" );
                }
            }  
    }
}
