package day01;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1,sayi2;
        Scanner input=new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz: ");
        sayi1=input.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        sayi2=input.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        int islem=input.nextInt();

        switch (islem){
            case 1:
                System.out.println("sonuç: "+(sayi1+sayi2));
                break;
            case 2:
                if(sayi1>sayi2){
                    System.out.println("sonuç: "+(sayi1-sayi2));
                }else{
                    System.out.println("sonuc: "+(sayi2-sayi1));
                }
                break;

            case 3:
                System.out.println("sonuç: "+(sayi1*sayi2));
                break;
            case 4:
                if (sayi2!=0){
                    System.out.println("sonuc: "+(sayi1/sayi2));
                }else{
                    System.out.println("Bir sayı 0'a bölünmez..");
                }
                break;
            default:
                System.out.println("Hatalı bir giriş yaptınız..");
                break;
        }

    }
}
