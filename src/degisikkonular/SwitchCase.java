package degisikkonular;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner okuyucu=new Scanner(System.in);
        System.out.println("hesap makineme hosgeldiniz" );
        System.out.println(" hesaplamak istediginiz iki sayiyi giriniz");
        int sayi1= okuyucu.nextInt();
        int sayi2= okuyucu.nextInt();
        System.out.println("hangi islemi yapmak istersiniz(+,-,*,/)");
        char islem = okuyucu.next().charAt(0);


        int sonuc;
        switch(islem){
            case '+': sonuc=sayi1+sayi2; System.out.println(sayi1 +" + "+ sayi2 + " = "+sonuc );
            case '-': sonuc=sayi1-sayi2; System.out.println(sayi1 +" - "+ sayi2 + " = "+sonuc );
            case '*': sonuc=sayi1*sayi2; System.out.println(sayi1 +" * "+ sayi2 + " = "+sonuc );
            case '/': sonuc=sayi1/sayi2; System.out.println(sayi1 +" / "+ sayi2 + " = "+sonuc );

            default:
                System.out.println("toplama,cikarma,carpma,bölme islemi seciniz ");

        }


    }
}
