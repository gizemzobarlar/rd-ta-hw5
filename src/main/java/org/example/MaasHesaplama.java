package org.example;

import java.util.Scanner;

public class MaasHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Çalışılan gün sayısını girin: ");
        int calisanGunSayisi = scanner.nextInt();

        int maas = maasHesapla(calisanGunSayisi);
        System.out.println("Ödenecek maaş: " + maas + "TL");
        scanner.close();
    }
    public static int maasHesapla(int calisanGunSayisi) {
        int maas = 0;
        if (calisanGunSayisi <= 25) {
            maas = calisanGunSayisi * 900; // Her bir gün için 900TL maaş
        } else {
            maas = 25 * 900; // 25 gün için toplam maaş
            int ekstraGunSayisi = calisanGunSayisi - 25;
            maas += ekstraGunSayisi * 1000 ; // Fazla günler için ekstra 1000TL prim
        }
        return maas;
    }
}