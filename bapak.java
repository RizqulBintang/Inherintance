
package pln2;

public class bapak {
    String nama;
    String alamat;
    int tipe;
    char blok;
    int bayar; 
    int kembali;
    
    public void setnama(String nama){
        this.nama=nama;
    }
    public void setalamat(String alamat){
        this.alamat=alamat;
    }
    public void settipe(int tipe){
        this.tipe=tipe;
    }
    public void setblok(char blok){
        this.blok=blok;
    }
    public void setbayar(int bayar){
        this.bayar=bayar;
    }
    public void setkembali(int kembali){
        this.kembali=kembali;
    }
    public String getnama(){
        return nama;
    }
    public String getalamat(){
        return alamat;
    }
    public int gettipe(){
        return tipe;
    }
    public char getblok(){
        return blok;
    }
    public int getbayar(){
        return bayar;
    }
    public int getkembali(){
        return kembali;
    }
}
