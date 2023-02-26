import java.util.Scanner;

public class Exercise53 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter R");
        double R = scan.nextDouble();
        System.out.println("Enter H");
        double H = scan.nextDouble();
        double ans = ( 3.14 * R * R * H );
        System.out.println("ปริมาตรทรงกระบอก" +ans +"ลบ.ซม");
        }
}
