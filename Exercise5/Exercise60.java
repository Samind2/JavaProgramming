import java.util.Scanner;

public class Exercise60 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double width1 = scan.nextDouble();
        System.out.println("width1");
        double long1 = scan.nextDouble();
        System.out.println("long1");
        double width2 = scan.nextDouble();
        System.out.println("width2");
        double long2 = scan.nextDouble();
        System.out.println("long2");

        double area1 = width1 * long1;
        double area2 = width2 * long2;
        if (area1 > area2) {
            System.out.println("square area 1 > square area 2");
            System.out.println("square area 1 : " + area1);
            System.out.println("square area 2 : " + area2);
        } else {
            System.out.println("square area 2 > square area 1");
            System.out.println("square area 1 : " + area1);
            System.out.println("square area 2 : " + area2);
        }
    }
}