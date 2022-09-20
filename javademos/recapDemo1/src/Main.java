import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int sayi=15;
        int sayi1=23;
        int sayi2=22;
        int enbuyuk=0;
        if (sayi>sayi1 && sayi>sayi2 ) {
            enbuyuk=sayi;
        }
        else if (sayi1>sayi && sayi1>sayi){
            enbuyuk=sayi1;
        }
        else enbuyuk=sayi2;
        System.out.println(enbuyuk);
    }
}