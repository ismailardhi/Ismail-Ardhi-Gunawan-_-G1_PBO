/*
 */package penugasan;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Penugasan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        int x = 7;
        int y = 10;

        System.out.println("sebelum penugasan : ");
        System.out.println("Nilai x : " + x);
        System.out.println("Nilai y : " + y);

        x += y;
        System.out.println("\nSetelah penugasan x += y : ");
        System.out.println("Nilai x : " + x);

        x -= y;
        System.out.println("\nSetelah penugasan x -= y : ");
        System.out.println("Nilai x : " + x);

        x *= y;
        System.out.println("\nSetelah penugasan x *= y : ");
        System.out.println("Nilai x : " + x);

        x /= y;
        System.out.println("\nSetelah penugasan x /= y : ");
        System.out.println("Nilai x : " + x);

        x %= y;
        System.out.println("\nSetelah penugasan x %= y : ");
        System.out.println("Nilai x : " + x);
    }

}