import java.util.Scanner;
public class Exercise41 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x1");
        int x1 = scan.nextInt();
        System.out.println("Enter x2");
        int x2 = scan.nextInt();
        System.out.println("Enter x3");
        int x3 = scan.nextInt();
        System.out.println("Enter x4");
        int x4 = scan.nextInt();
        System.out.println("Enter x5");
        int x5 = scan.nextInt();
        int sum = x1 +x2 + x3 + x4 +x5;
        int average = (sum / 5);
        if (average >= 50) {
            System.out.println("ผ่าน");
        }
        else {
            System.out.println("ไม่ผ่าน");
        }
    }
}
