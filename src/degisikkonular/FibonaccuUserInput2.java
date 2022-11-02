package degisikkonular;

import java.util.Scanner;

public class FibonaccuUserInput2 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Kaç Adet Fibonnacci Sayısı Görmek İstiyorsunuz?");
        int sayi=klavye.nextInt();
        int birinci=0;
        int ikinci=1;
        int ucuncu=birinci+ikinci;

        System.out.println("Fibonacci Sayıları ");
        System.out.print(birinci+ " "+ikinci+ " ");

        while(sayi>0){
            System.out.print(ucuncu+ " ");
            sayi--;
            birinci=ikinci;
            ikinci=ucuncu;
            ucuncu=birinci+ikinci;


        }

    }

}

