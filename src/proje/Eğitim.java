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
public class Eğitim extends Kişi{
    Eğitim(){
        System.out.println("Eğitim Kısmına Giriş Yaptınız!!!");
    }
    Scanner scan = new Scanner(System.in);
    int[] transkript = new int[11];
    ArrayList burs_basvuru = new ArrayList();
    int ders_bölüm;
    void burs_kayıt(ArrayList burs_basvuru)
    {
        burs_basvuru.add("NUMARA");
        burs_basvuru.add("İSİM");
        burs_basvuru.add("SOYİSİM");
        int tercih = 1,numara_kontrol;
        while(tercih != 0)
        {
            numara_kontrol = 0;
            while( numara_kontrol == 0)
            {
                System.out.println("Numara: ");
                super.numara = Integer.parseInt(scan.nextLine());
                numara_kontrol = 1;
                for( int i = 3; i < burs_basvuru.size(); i += 3 )
                {
                    if( (burs_basvuru.get(i)).equals(super.numara) )
                    {
                        System.out.println("Var olan bir numara girdiniz tekrar numara giriniz!!!");
                        numara_kontrol = 0;
                    }
                }
            }
            System.out.println("İsim: ");
            super.Ad = scan.nextLine();
            System.out.println("Soyad: ");
            super.Soyad = scan.nextLine();
            burs_basvuru.add(super.numara);
            burs_basvuru.add(super.Ad);
            burs_basvuru.add(super.Soyad);
            System.out.println("Kayıta devam etmek için herhangi bir sayı giriniz");
            System.out.println("Kayıttan çıkmak için 0 giriniz");
            tercih = Integer.parseInt(scan.nextLine());
        }
    }
    void burs_basvuru_yazdırma(ArrayList burs_basvuru)
    {
        int i,j;
        for( i = 0; i < burs_basvuru.size(); i += 3 )
        {
            for( j = i; j < i+3; j++ )
            {
                System.out.print(burs_basvuru.get(j)+"   ");
            }
            System.out.println("");
        }
    }
    void burs_basvuru_silme(ArrayList burs_basvuru)
    {
        int i,pos,kelime_kontrol = 0,no = 0,flag;
        String kelime = "S";
        System.out.println("Silinecek Kelime ise 1");
        System.out.println("Silinecek Numara ise 2");
        System.out.println("Silinecek indisse farklı bir sayi giriniz");
        flag = Integer.parseInt(scan.nextLine());
        if(flag == 1)
        {
            kelime = scan.nextLine();
            pos = burs_basvuru.indexOf(kelime);
        }
        else if(flag == 2)
        {
            no = Integer.parseInt(scan.nextLine());
            pos = burs_basvuru.indexOf(no);
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
                    burs_basvuru.remove(pos);
                }
                kelime_kontrol = 1;
                if(flag == 1)
                {
                    for( i = 0; i < burs_basvuru.size(); i++ )
                    {
                        if( String.valueOf(burs_basvuru.get(i)).equals(kelime))
                        {
                            kelime_kontrol = 0;
                            pos = burs_basvuru.indexOf(kelime);
                        }
                    }
                }
            }
            
        }
    }
    int transkript_yazma(int[] transkript)
    {
        int ders,i;
        System.out.println("Ders Sayısını Giriniz(Bir Dönemde en fazla 11 ders olabilir) = ");
        ders = Integer.parseInt(scan.nextLine());
        System.out.println("Notlari Giriniz");
        for( i = 0; i < ders; i++)
        {
            System.out.println((i+1)+".ders:");
            transkript[i] = Integer.parseInt(scan.nextLine());
        }
        return ders;
    }
    void transkript_görünteleme(int[] transkript,int ders)
    {
        int i;
        for( i = 0; i < ders; i++ )
        {
            System.out.println((i+1)+".ders = "+transkript[i]);
        }
    } 
    double oveharf_hesap(int[] transkript)
    {
        int i;
        double toplam = 0,ortalama;
        for( i = 0; i < transkript.length; i++ )
        {
            toplam += transkript[i];
        }
        return toplam;
    }
    double oveharf_hesap(int[] transkript,double toplam,int ders)
    {
        int i;
        double ortalama;
        for( i = 0; i < ders; i++ )
        {
            if(transkript[i] >= 85)
            {
                System.out.println((i+1)+".ders AA");
            }
            else if( transkript[i] >= 70)
            {
                System.out.println((i+1)+".ders BB");
            }
            else if( transkript[i] >= 50)
            {
                System.out.println((i+1)+".ders CC");
            }
            else if( transkript[i] >= 35)
            {
                System.out.println((i+1)+".ders DD");
            }
            else
                System.out.println((i+1)+".ders FF");
        }
        ortalama = toplam/ders;
        return ortalama;
    }
}
