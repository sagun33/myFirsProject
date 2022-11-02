package degisikkonular;


public class JavaQuestionsbankTurkish {
    public static void main(String[] args) {
       
                 //Variables
        /*   
 1)
        double gömlekFiyat=12.99;
        double sapkaFiyat=23.99;
        double ayakkabiFiyat=15.99;
        double toplamFiyat=gömlekFiyat+sapkaFiyat+ayakkabiFiyat;
        System.out.println("toplamFiyat = " + toplamFiyat);
        

2)      float x=15.99F;
        long y=13L;
        int z=12;
        float carpim =x*y*z;
        System.out.println("carpim = " + carpim);


3)

        int anapara=500000;
        double oran=0.9;
        int yilDegeri=30;
        double basitFaiz=anapara*oran*yilDegeri/100;


        System.out.println("basitFaiz = " + basitFaiz);



4)
        String s="Sonuc";
        Long a=12l;
        Long b=12678965l;
        System.out.println("s = " + a+b);
        System.out.println("s = " + a*b);



5)        boolean a=true;
        boolean b=false;
        System.out.println(a+" "+b);



6)        float kitap=12.99f,defter=23.45f,laptop=34.12f;
        float toplamFiyat=2*kitap+4*defter+3*laptop;
        System.out.println("toplamFiyat = " + toplamFiyat);


 7)       Scanner scan=new Scanner(System.in);
        System.out.println("2 sayi giriniz");
        double n1=scan.nextDouble();
        double n2=scan.nextDouble();
        System.out.println("Degistirmeden once:" +n1 +"-"+n2);

        double temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("Degistirdikten sonra:" +n1 +"-"+n2);
          
                         //Type Casting

       float yas = 12f;
       int yeniYas = (int) yas;
        System.out.println("yeniYas = " + yeniYas);

        
        
        

        //long yas =12l;
       // int yeniYas= (int) yas;
       // System.out.println("yas = " + yas);

         

         double fiyat =12.49;
         float yeniFiyat= (float) fiyat;
        System.out.println("yeniFiyat = " + yeniFiyat);
        
         


       double fiyat=1.259;
       int yeniFiyat = (int)fiyat;
        System.out.println("yeniFiyat = " + yeniFiyat);
        

        
        byte age =23;
        double yeniAge=age;
        System.out.println("yeniAge = " + yeniAge);



               byte min=Byte.MIN_VALUE;
               short max=Short.MAX_VALUE     ;
        System.out.println(min+max);


         

                  byte sayi1=Byte.valueOf("113");
                  short sayi2=Short.valueOf("2351") ;
                  System.out.println(sayi2-sayi1);
                  

        
        String s="SALIH";
        String konsols=s.toUpperCase();
        konsols=konsols.substring(0,1).toLowerCase()+konsols.substring(1);
        System.out.println("konsols = " + konsols);



        String s="salih";
        String f="fatma";
        String m="mahmut";
        String hepsi=s +" "+f+" "+m;

        int ss = s.length();
        int fs=f.();
        int  ms=m.length();
        int tks=ss+fs+ms;
        int karakterSayisi=hepsi.length();
        

        System.out.println("hepsi = " + hepsi);
        System.out.println("karakterSayisi = " + karakterSayisi);


        
         String s="Miami33018";
         int karakterSayisi=s.length();
        System.out.println("karakterSayisi = " + karakterSayisi);



        String s="1a3Bcf4!...";
        int rakamOlmayanKrkSayisi;
        rakamOlmayanKrkSayisi = s.replaceAll("[0-9]","").length();
        System.out.println("rakamOlmayanKrkSayisi = " + rakamOlmayanKrkSayisi);
        String k="2a3B4?-!5ghj";
        int rakamOlmayanKRKSayisi2=k.replace("[0-9]","").length();
        System.out.println(rakamOlmayanKRKSayisi2);


        String a="AliCandan1234";
        String b="VeliCandan1234";
        String c="MehmetCandan1234";
        int x=a.replaceAll("[0-9]","").length();
        int y=b.replaceAll("[0-9]","").length();
        int m=c.replaceAll("[0-9]","").length();
        int top=x+y+m;

        System.out.println(top);


        String a="AliCan         ";
        String b="Miami  ";
        int boslukOlmayanSonKrkIndex=b.trim().length()-1;
        String boslukOlmayanKrkSayisi=b.substring(boslukOlmayanSonKrkIndex,boslukOlmayanSonKrkIndex+1);
      
        
        System.out.println("boslukOlmayanKrkSayisi = " + boslukOlmayanKrkSayisi);

         
        

        

        String s="Java";
        int sonKrkIndex=s.length()-1;
        String ilkKrkdisindakiler=s.substring(1,sonKrkIndex).toLowerCase();
        System.out.println("sonKrkIndex = " + sonKrkIndex);
        System.out.println("ilkKrkdisindakiler = " + ilkKrkdisindakiler);

         
        String s="Java";
        
        int sonKrkIndex=s.length()-1;
        String sonKrkDisindakiler=s.substring(0,sonKrkIndex).toUpperCase();
        System.out.println("sonKrkDisindakiler = " + sonKrkDisindakiler);
        

        String s="Java";
        int ilkKrkIndex=s.length()-1;
        String iklVeSonKrkDisindakiler=s.substring(1,ilkKrkIndex).toUpperCase();
        System.out.println("iklVeSonKrkDisindakiler = " + iklVeSonKrkDisindakiler);

         
        String s="Ali Can";
        String trimlenmis=s.trim();
        String hicBoslukYok=trimlenmis.replaceAll("\\s","");
        System.out.println("hicBoslukYok = " + hicBoslukYok);
        Boolean ortadaTekBoslukVarmi=trimlenmis.length()-hicBoslukYok.length()==1;
        System.out.println("ortadaTekBoslukVarmi = " + ortadaTekBoslukVarmi);
        

        String s="Ali Can     Salih";

        String hicBoslukYapma=s.replaceAll("\\s","");
        System.out.println("hicBoslukYapma = " + hicBoslukYapma);


        String ayAdi="mayis";
        ayAdi=ayAdi.toLowerCase();

        if (ayAdi.equals("aralik")||ayAdi.equals("ocak")||ayAdi.equals("subat"))
        {System.out.println("Kis");}

        else if (ayAdi.equals("mart")||ayAdi.equals("nisan")||ayAdi.equals("mayis"))
        {System.out.println("Ilkbahar");}

        else if  (ayAdi.equals("haziran")||ayAdi.equals("temmuz")||ayAdi.equals("agustos"))
        {System.out.println("yaz");}

        else if  (ayAdi.equals("eylül")||ayAdi.equals("ekim")||ayAdi.equals("kayim"))
        {System.out.println("Sonbahar");}

        else
        {System.out.println("Gecersiz ay");}

         */




        }

    }






