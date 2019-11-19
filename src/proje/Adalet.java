/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Adalet extends Kişi{
    Adalet(){
        System.out.println("Adalet Kısmına Giriş Yaptınız!!!");
    }
    Scanner scan = new Scanner(System.in);
    int mahkeme_sayısı[] = new int[12];
    ArrayList sicil_kayıt = new ArrayList();
    int maas_hesap(int mahkeme_sayısı[])
    {
        int sayi,maas;
        System.out.println("Ay numarasını Giriniz: ");
        sayi = Integer.parseInt(scan.nextLine());
        if(mahkeme_sayısı[sayi-1] >= 12)
        {
            maas = 10000;
        }
        else if(mahkeme_sayısı[sayi-1] >= 9)
        {
            maas = 8000;
        }
        else if(mahkeme_sayısı[sayi-1] >= 6)
        {
            maas = 6000;
        }
        else if(mahkeme_sayısı[sayi-1] >= 3)
        {
            maas = 4000;
        }
        else
        {
            maas = 3000;
        }
        return maas;
    }
    void sicil_ekleme(ArrayList sicil_kayıt)
    {
        sicil_kayıt.add("İSİM");
        sicil_kayıt.add("SOYİSİM");
        sicil_kayıt.add("SUÇ");
        int sayi = 1;
        while( sayi != 0)
        {
            System.out.println("İsim: ");
            super.Ad= scan.nextLine();
            System.out.println("Soyisim: ");
            super.Soyad = scan.nextLine();
            System.out.println("Suç: ");
            super.suç = scan.nextLine();
            sicil_kayıt.add(super.Ad);
            sicil_kayıt.add(super.Soyad);
            sicil_kayıt.add(super.suç);
            System.out.println("Kayıta Devam Etmek istiyosan herhangi bir sayı giriniz");
            System.out.println("Kayıttan çıkmak için 0 tuşuna bas");
            sayi = Integer.parseInt(scan.nextLine());
        }
    }
    void mahkeme_gösterme(int mahkeme_sayısı[])
    {
        int i;
        for( i = 0; i < 12; i++ )
        {
            System.out.println((i+1)+".ay Mahkeme Sayısı: "+mahkeme_sayısı[i]);
        }
    }
    int[] mahkeme_yazma(int mahkeme_sayısı[])
    {
        int i;
        for( i = 0; i < 12; i++ )
        {
            System.out.println((i+1)+".ay mahkeme sayısı:");
            mahkeme_sayısı[i] = Integer.parseInt(scan.nextLine());
        }
        return mahkeme_sayısı;
    }
    void mahkeme_silme(int mahkeme_sayısı[])
    {
        int ay,sayi;
        System.out.println("Silinecek Ay: ");
        ay = Integer.parseInt(scan.nextLine());
        System.out.println("Silinecek Mahkeme Sayısı: ");
        sayi = Integer.parseInt(scan.nextLine());
        mahkeme_sayısı[ay-1] = mahkeme_sayısı[ay-1] - sayi;
    }
    double tveo_gösterme(int mahkeme_sayısı[])
    {
        int i;
        double toplam = 0;
        for( i = 0; i < 12; i++ )
        {
            toplam += mahkeme_sayısı[i];
        }
        return toplam;
    }
    double tveo_gösterme(double toplam)
    {
        double ortalama;
        ortalama = toplam/12;
        System.out.println(ortalama);
        return ortalama;
    }
    void sicil_kayıt_yazdırma(ArrayList sicil_kayıt)
    {
        int i,j;
        for( i = 0; i < sicil_kayıt.size(); i += 3)
        {
            for( j = i; j < i+3; j++ )
            {
                System.out.print(sicil_kayıt.get(j)+" ");
            }
            System.out.println("");
        }
    }
    void sicil_kayıt_silme(ArrayList sicil_kayıt)
    {
        int i,flag;
        String kelime = "S";
        System.out.println("Silinicek Kelime ise '1' giriniz: ");
        System.out.println("Silinicek indisse herhangi bir sayı giriniz: ");
        flag = Integer.parseInt(scan.nextLine());
        int pos;
        int kelime_kontrol = 0;
        if( flag == 1)
        {
            kelime = scan.nextLine();
            pos = sicil_kayıt.indexOf(kelime);
        }
        else
        {
            pos = Integer.parseInt(scan.nextLine());
            pos += 3;
        }
        if( pos != -1)
        {
            while(kelime_kontrol == 0)
            {
                pos = pos/3;
                pos = pos*3;
                for( i = 0; i < 3; i++ )
                {
                    sicil_kayıt.remove(pos);
                }
                kelime_kontrol = 1;
                if(flag == 1)
                {
                    for( i = 0; i < sicil_kayıt.size(); i++ )
                    {
                        if(String.valueOf(sicil_kayıt.get(i)).equals(kelime))
                        {
                            kelime_kontrol = 0;
                            pos = sicil_kayıt.indexOf(kelime);
                        }
                    }
                }
            }
            
        }
        
    }
    
}
