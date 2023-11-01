/*
 */
package bitwise;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Bitwise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);

     int angka1 = 7;
     int angka2 = 5;

     int hasilAND = angka1 & angka2;
     int hasilOR = angka1 | angka2;
     int hasilXOR = angka1 ^ angka2;
     int hasilNegasi=  ~ angka1;
     int hasilLeftShift = angka1 << angka1;
     int hasilRightShift = angka1 >> angka1;
     int hasilRigftShiftUnsigned = angka1 >>> angka1;

     System.out.println("Hasil Operator AND : " + hasilAND);
     System.out.println("Hasil Operator OR : " + hasilOR);
     System.out.println("Hasil Operator XOR : " + hasilXOR);
     System.out.println("Hasil Operator Negasi : " + hasilNegasi);
     System.out.println("Hasil Operator LeftShift : " + hasilLeftShift);
     System.out.println("Hasil Operator RightShift : " + hasilRightShift);
     System.out.println("Hasil Operator RightShiftUnsigned : " + hasilRigftShiftUnsigned);
    }

}