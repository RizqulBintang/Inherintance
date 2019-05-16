package pln2;

import java.util.Scanner;


public class PLN2 {

    public static void main(String[] args) {
        anak A=new anak();
        Scanner input=new Scanner(System.in);
        System.out.println("Pembayaran PLN");
        System.out.print("Nama: ");
        A.nama=input.nextLine();
        System.out.print("Alamat: ");
        A.alamat=input.nextLine();
        System.out.print("Tipe Rumah: ");
        A.tipe=input.nextInt();
        A.proses();
    }
    
}
