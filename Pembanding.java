/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembanding;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Pembanding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int angka1 = 20;
    int angka2 = 5;

    boolean hasilPembanding1 = angka1 > angka2;
    boolean hasilPembanding2 = angka1 < angka2;
    boolean hasilPembanding3 = angka1 == angka2;
    boolean hasilPembanding4 = angka1 != angka2;
    boolean hasilPembanding5 = angka1 >= angka2;
    boolean hasilPembanding6 = angka1 <= angka2;

    System.out.println("Hasil Pembanding angka1 > angka2 : " + hasilPembanding1);
    System.out.println("Hasil Pembanding angka1 < angka2 : " + hasilPembanding2);
    System.out.println("Hasil Pembanding angka1 == angka2 : " + hasilPembanding3);
    System.out.println("Hasil Pembanding angka1 != angka2 : " + hasilPembanding4);
    System.out.println("Hasil Pembanding angka1 >= angka2 : " + hasilPembanding5);
    System.out.println("Hasil Pembanding angka1 <= angka2 : " + hasilPembanding6);
    }

}
