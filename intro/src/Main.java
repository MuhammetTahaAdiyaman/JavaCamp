//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //değişkenler camelCase şeklinde yazılır
        String internetSubeButonu = "İnternet Şubesi";
        //Dont repeat yourself - kendini tekrar etme

        //tam sayi
        int vade = 36;
        //ondalıklı sayı
        double dolarDun = 8.15;
        double dolarBugun = 8.15;
        //mantıksal durumların olduğu veri tipi-boolean
        boolean dustuMu = true;

        if(dolarBugun<dolarDun){
            System.out.println("Dolar düştü resmi");
        }else if(dolarBugun > dolarDun){
            System.out.println("Dolar yükseldi resmi");
        } else{
            System.out.println("Dolar değişmedi resmi");
        }
        System.out.println("************************************");
        //bankalarda bulunan kredileri biz şu şekilde verebilirdik.
//        String kredi1 = "Hızlı Kredi";
//        String kredi2 = "Mutlu Emekli Kredi";
//        String kredi3 = "Konut Kredi";
//        String kredi4 = "Çiftçi Kredi";
//        String kredi5 = "Taşıt Kredi";
//        String kredi6 = "MSB Kredi";

        //bu kredileri ekrana mecburen bastırmamız gerekiyor bir checkbox içinde diyelim.
//        System.out.println(kredi1);
//        System.out.println(kredi2);
//        System.out.println(kredi3);
//        System.out.println(kredi4);
//        System.out.println(kredi5);
//        System.out.println(kredi6);

        //bu şekilde manuel olarak yazdık. Yeni bir kredi eklenmesi gerektiğinde yukarıda ilk olarak tanımlayıp daha sonra sout ile ekrana bastırmamız gerekecek.
        //bunu bu şekilde tutmak yerine javada liste tabanlı verileri tutmak için arraylar çıkıyor.
        String[] krediler = {"Hızlı Kredi","Mutlu Emekli Kredi","Konut Kredi","Taşıt Kredi","Çiftci Kredi","MSB Kredisi"};
        //bunun bana avantajı veriler 0 tanede gelebilir 1000tane de gelebilir.
        //bunu ekrana nasıl bastıracağız tabii ki döngüler ile.
        for (String kredi:krediler){
            System.out.println(kredi);
        }
        //benim elimde krediler dizisi var onu tek tek dolaş anlamına gelmektedir. O anki değişken ise kredi oluyor.
        //bu şekilde yeni eklenecek krediyi array içine ekleyince ekrana basacak olan kod dinamik hale dönüşmüş oldu.
        for(int i=0; i<krediler.length; i++){
            System.out.println(krediler[i]);
        }

        System.out.println("***************************");

        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;
        System.out.println(sayi1);

        System.out.println("--------");

        int[] sayilar1 = {1,2,3,4,5};
        int[] sayilar2 = {10,20,30,40};
        sayilar1 = sayilar2;
        sayilar2[0] = 100;
        System.out.println(sayilar1[0]);
    }
}