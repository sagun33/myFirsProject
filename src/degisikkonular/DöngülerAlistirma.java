package degisikkonular;

public class DöngülerAlistirma {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i = i + 4)
            System.out.println("i = " + i);
        int sayi = 5;
        while (sayi < 200) {
            System.out.println("sayi = " + sayi);
            sayi = sayi + 5;
        }
        int degisken = 35;
        do { System.out.println("degisken = " + degisken);
        } while(degisken==35);
    }
}


