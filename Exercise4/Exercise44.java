import java.util.Scanner;
public class Exercise44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ค่ารัศมี");
        double R = scan.nextDouble();
        double area = R * R * 3.14;
        System.out.println( area );
    }
}
