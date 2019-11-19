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
public class Trafik_Ulaşım extends Kişi{
    Trafik_Ulaşım(){
        System.out.println("Trafik Ulaşım Kısmına Giriş Yaptınız!!!");
    }
    Scanner scan = new Scanner(System.in);
    ArrayList plaka = new ArrayList();
    double[] otobüs = new double[10];
    double maas;
    
    void otobüs_kar(double[] otobüs)
    {
        double toplam = 0;
        int i;
        for( i = 0; i < otobüs.length; i++ )
        {
            System.out.println((i+1)+".otobüs karı: ");
            otobüs[i] = Double.parseDouble(scan.nextLine());
        }
    }
    double toplam_bulma(double[] otobüs)
    {
        double toplam = 0;
        int i;
        for( i = 0; i < otobüs.length; i++ )
        {
            toplam += otobüs[i];
        }
        return toplam;
    }
    void otobüs_kar(double toplam)
    {
        double ortalama;
        ortalama = toplam/10;
        System.out.println("Ortalama:"+ortalama);
    }
    void kar_silme(double[] otobüs)
    {
        double kar;
        int oto_no;
        System.out.println("Hangi Otobüs: ");
        oto_no = Integer.parseInt(scan.nextLine());
        System.out.println("Silinecek kar miktarı: ");
        kar = Double.parseDouble(scan.nextLine());
        otobüs[oto_no-1] = otobüs[oto_no-1] - kar;
        
    }
    void plaka_ekleme( ArrayList plaka )
    {
        plaka.add("PLAKA  ");
        plaka.add("ARAÇ  ");
        plaka.add("RENK  ");
        int tercih = 1,plaka_kontrol;
        while(tercih != 0)
        {
            plaka_kontrol = 0;
            while( plaka_kontrol == 0)
            {
                System.out.println("PLAKA: ");
                super.plaka = scan.nextLine();
                plaka_kontrol = 1;
                for( int i = 3; i < plaka.size(); i += 3 )
                {
                    if( (plaka.get(i)).equals(super.plaka) )
                    {
                        System.out.println("Var olan bir numara girdiniz tekrar numara giriniz!!!");
                        plaka_kontrol = 0;
                    }
                }
            }
            System.out.println("ARAÇ: ");
            super.araç = scan.nextLine();
            System.out.println("RENK: ");
            super.renk = scan.nextLine();
            plaka.add(super.plaka);
            plaka.add(super.araç);
            plaka.add(super.renk);
            System.out.println("Kayıta devam etmek için herhangi bir sayı giriniz");
            System.out.println("Kayıttan çıkmak için 0 giriniz");
            tercih = Integer.parseInt(scan.nextLine());
        }
        
    }
    void plaka_yazdırma( ArrayList plaka )
    {
        int i,j;
        for( i = 0; i < plaka.size(); i += 3 )
        {
            for( j = i; j < i+3; j++ )
            {
                System.out.print(plaka.get(j)+"   ");
            }
            System.out.println("");
        }
    }
    void plaka_silme( ArrayList plaka )
    {
        int i,pos,kelime_kontrol = 0,flag;
        String kelime = "S";
        System.out.println("Silinecek Kelime ise 1");
        System.out.println("Silinecek indisse farklı bir sayi giriniz");
        flag = Integer.parseInt(scan.nextLine());
        if(flag == 1)
        {
            kelime = scan.nextLine();
            pos = plaka.indexOf(kelime);
        }
        else
        {
            pos = Integer.parseInt(scan.nextLine());
            pos += 3;
        }
        if(pos != -1)
        {
            while( kelime_kontrol == 0 )
            {
                pos /= 3;
                pos *= 3;
                for( i = 0; i < 3; i++ )
                {
                    plaka.remove(pos);
                }
                kelime_kontrol = 1;
                if(flag == 1)
                {
                    for( i = 0; i < plaka.size(); i++ )
                    {
                        if( String.valueOf(plaka.get(i)).equals(kelime))
                        {
                            kelime_kontrol = 0;
                            pos = plaka.indexOf(kelime);
                        }
                    }
                }
            }
            
        }
    }
    double maas_hesap(int saat)
    {
        if(saat < 50)
        {
            maas = saat*40;
        }
        else
        {
            maas = saat*45;
        }
        return maas;
    }
    
}
