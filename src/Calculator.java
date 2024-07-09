/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package src;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean devamEt = true;

        while (devamEt) {
            System.out.println();
            System.out.println("1- TOPLAMA");
            System.out.println("2- ÇIKARMA");
            System.out.println("3- ÇARPMA");
            System.out.println("4- BÖLME");
            System.out.println("5- ÜS ALMA");
            System.out.println("6- KAREKÖK HESAPLAMA");
            System.out.println();

            try {
                double m=0,n=0;
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz...");
                int x = scanner.nextInt();
                if(x==0 || x>6){
                    System.out.println("Lütfen 1 ile 6 arasında bir sayı giriniz.");
                }
                if(x==6){
                    System.out.println("Lütfen  1 sayı giriniz: ");
                    n = scanner.nextDouble();

                }else if(x<6 && x>0){
                    System.out.println("Lütfen   2 sayı giriniz: ");
                    m = scanner.nextDouble();
                    n = scanner.nextDouble();
                }

                switch (x){
                    case 1:
                        System.out.println("Sonuç= " + (m + n));
                        break;
                    case 2:
                        System.out.println("Sonuç= " + (m - n));
                        break;
                    case 3:
                        System.out.println("Sonuç= " + (m * n));
                        break;
                    case 4:
                        if(n==0){
                            System.out.println("Bir sayı 0'a bölündüğü zaman belirsizlik durumu ortaya çıkar. Lütfen ikinci girdiğiniz değeri sıfırdan farklı olacak şekilde yeniden giriniz:");
                            n = scanner.nextDouble();
                        }
                        System.out.println("Sonuç= " + (m / n));
                        break;
                    case 5:
                        System.out.println("Sonuç= " + Math.pow(m, n));
                        break;
                    case 6:
                        System.out.println("Sonuç= " + Math.sqrt(n));
                        break;
                    default:
                        System.out.println("Geçersiz işlem...");
                        break;

                }
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz ifade!! Lütfen sadece rakam giriniz.");
                scanner.next();
            }
        }
        scanner.close();
    }
}
