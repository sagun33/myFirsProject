package degisikkonular;

import java.util.Scanner;

public class Währungsrechner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bitte gebe einen Betrag in Eur an: ");
        Double money=scanner.nextDouble();
        convertToTurkischesLira(money);
        convertTodollars(money);


    }
    public static void convertTodollars(Double eur) {
        System.out.println("Der Betrag in Dollar  ist: " + eur*1.20);

    }

    public static void convertToTurkischesLira(Double eur){
        System.out.println("Der Betrag in TurkischesLira  ist: " + eur*18);
        
    }
}
