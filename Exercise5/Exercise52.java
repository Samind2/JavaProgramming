import java.util.Scanner;

public class Exercise52 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scan.nextInt();
        int i = 1;
        while (i <= 100) {
            if (i % n == 0) {
            System.out.println(i + "หารด้วย" +n + "ลงตัว");
            }
            i = i+1;
        }
    }
}