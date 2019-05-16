
package pln2;
import java.util.Scanner;
public class anak extends bapak {
    Scanner input=new Scanner(System.in);
    public void proses(){
        switch(gettipe()){
            case 36:
                System.out.print("Blok: ");
                this.blok=input.next().charAt(0);
                if(this.blok=='A'){int A = 500000;
                System.out.println("Nama: "+getnama());
                System.out.println("Alamat: "+getalamat());
                System.out.println("Harga bayar: Rp.500000");
                System.out.print("Bayar: Rp.");
                this.bayar=input.nextInt();
                this.kembali=this.bayar-A;
                System.out.println("Kebalian: Rp."+getkembali());
                }
                else if(getblok()=='B'){int B = 300000;
                System.out.println("Nama: "+getnama());
                System.out.println("Alamat: "+getalamat());
                System.out.println("Harga bayar: Rp.300000");
                System.out.print("Bayar: Rp.");
                this.bayar=input.nextInt();
                this.kembali=this.bayar-B;
                System.out.println("Kebalian: Rp."+getkembali());
                }
            break;
            case 37:
                System.out.print("Blok: ");
                this.blok=input.next().charAt(0);
                if(getblok()=='A'){int A = 800000;
                System.out.println("Nama: "+getnama());
                System.out.println("Alamat: "+getalamat());
                System.out.println("Harga bayar: Rp.800000");
                System.out.print("Bayar: Rp.");
                this.bayar=input.nextInt();
                this.kembali=this.bayar-A;
                System.out.println("Kebalian: Rp."+getkembali());
                }
                else if(getblok()=='B'){int B = 600000;
                System.out.println("Nama: "+getnama());
                System.out.println("Alamat: "+getalamat());
                System.out.println("Harga bayar: Rp.600000");
                System.out.print("Bayar: Rp.");
                this.bayar=input.nextInt();
                this.kembali=this.bayar-B;
                System.out.println("Kebalian: Rp."+getkembali());
                }
            break;
            default:System.out.println("Tidak ada pilihan");
    }
        
}
}