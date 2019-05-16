
package volumebola;

import java.util.Scanner;

public class Volumebola {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        b B=new b();
        
        System.out.println("Menghitung Volume Bola");
        System.out.print("Masukkan Jari-jari: ");
        B.r=input.nextDouble();;
        B.getvb();
    }
    
}
