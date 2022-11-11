package methods;
// Kenarları girilen dikdörtgen ve karenin alanlarını hesaplama
import java.util.Scanner;

public class alanhesaplama {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
        int kısakenar=input.nextInt();
        System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
        int uzunkenar=input.nextInt();
        System.out.print("Karenin kenarını giriniz: ");
        int kareninkenari=input.nextInt();
        int dikdorgeninAlani=alanHesapla(kısakenar,uzunkenar);
        int kareninAlani=alanHesapla(kareninkenari,kareninkenari);
        System.out.println("Alanlar Toplamı: "+(dikdorgeninAlani+kareninAlani));




    }public static int  alanHesapla(int a1,int a2){
        return a1*a2;
    }
}
