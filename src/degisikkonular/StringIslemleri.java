package degisikkonular;

public class StringIslemleri {
    public static void main(String[] args) { 
        int[] dizi=new int[]{3,6,3,55,6,7,8,9,3,4,5,6,7};
                int toplam=0;
        for(int i=1;i<dizi.length;i++) {
            toplam += dizi[i];
        }
        System.out.println("toplam = " + toplam);
        toplam=0;
        for(int value:dizi){
            toplam+=value;
        }
        System.out.println("toplam = " + toplam);
    }
}

