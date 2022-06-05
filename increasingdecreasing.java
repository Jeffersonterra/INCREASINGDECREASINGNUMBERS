import java.util.Scanner;

public class increasingdecreasing {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        double x, y;
        do {
            System.out.println("Imput two numbers: ");
            x = leitor.nextDouble();
            y = leitor.nextDouble();
            if (x > y) {
                System.out.println("Decressing");
            } else if (x < y) {
                System.out.println("Increassing");
            } else {
                System.out.println("System is closing");
            }
        } while (x != y);
        leitor.close();
    }
}
