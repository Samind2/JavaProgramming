import java.util.Scanner;
public class Exercise50 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("คะแนนกลางภาค");
        int a = scan.nextInt();
        System.out.println("คะแนนปลายภาค");
        int b = scan.nextInt();
        int sum = a + b;
        if (sum >= 80) {
            System.out.println("พิมพ์ A");
        }

        else if (sum >= 75) {
            System.out.println("พิมพ์ B+");
        }
        else if (sum >= 70) {
            System.out.println("พิมพ์ B");
        }
        else if (sum >= 65) {
            System.out.println("พิมพ์ C+");
            }
        else if (sum >= 60) {
            System.out.println("พิมพ์ C");
        }
        else if (sum >= 55) {
            System.out.println("พิมพ์ D+");
        }
        else if (sum >= 50) {
            System.out.println("พิมพ์ D");
        }
            else {
            System.out.println("พิมพ์ E");
        }
    }
}

