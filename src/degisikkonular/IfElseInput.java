package degisikkonular;
import java.util.Scanner;

public class IfElseInput {



        public static void main(String[] args) {
            Scanner okuyucu=new Scanner(System.in);
            System.out.println("isminiz nedir? " );
            String isim=okuyucu.next();
            System.out.println("merhaba " + isim);
            System.out.println("yasiniz kactir? " );
            int yas= okuyucu.nextInt();
            int harfSayisi=isim.length();
            int sansliSayi=0;
            if (yas<15){
                sansliSayi=(harfSayisi*yas)%10;
            }else if (yas<20) {
                sansliSayi = (yas * yas - harfSayisi) % 10;
            }else if (yas<40) {
                sansliSayi = yas % 10;

            } else if (yas<60) {
                sansliSayi = (yas - harfSayisi) % 10;
            }else{
                sansliSayi=(harfSayisi*5)%10;

            }if (sansliSayi<0){
                sansliSayi=sansliSayi*-1;
            }
            System.out.println("sansliSayiniz = " + sansliSayi);
        }
    }

