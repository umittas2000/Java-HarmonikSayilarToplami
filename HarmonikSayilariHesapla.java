import java.util.Scanner;

public class HarmonikSayilariHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n, toplam=0;

        System.out.print("Luften pozitif bir sayi girin:");
        n = input.nextDouble();

        if(n>0){
            for(double i =1;i<=n;i++){
                toplam += (1/i);
                System.out.println(i+". Adim (" + (1/i) +") toplam: " + toplam);
            }

            System.out.println("Harmonik sayilar toplami: " + toplam);
        }else{
            System.out.println("Pozitif Sayi Girmediniz, Tekrar deneyin.");
        }
    }
}
