/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

/**
 *
 * @author user
 */
public class BölümN extends Eğitim{
    @Override
    double oveharf_hesap(int[] transkript)
    {
        System.out.println("Bölüm Derslerini ilk 4 ders e yazınız!!!");
        System.out.println("Ders Sayısı: ");
        this.ders_bölüm = Integer.parseInt(super.scan.nextLine());
        int i,ders_kontrol = 1,ders_tutucu = 0;
        double toplam = 0,ortalama;
       
        while(ders_kontrol == 1)
        {
            ders_kontrol = 0;
            if(super.ders_bölüm < 4)
            {
                System.out.println("Ders Sayısı 4 den küçük olamaz!!!");
                ders_kontrol = 1;
                System.out.println("Ders Sayısı: ");
                super.ders_bölüm = Integer.parseInt(super.scan.nextLine());
            }
        }
        for( i = 0; i < super.ders_bölüm; i++ )
        {
            System.out.println((i+1)+".ders:");
            transkript[i] = Integer.parseInt(scan.nextLine());
            if( i < 4 )
            {
                toplam +=  transkript[i]*5;
                ders_tutucu += 5;
            }
            else
            {
                toplam += transkript[i]*2;
                ders_tutucu +=2;
            }
        }
        ortalama = toplam/ders_tutucu;
        return ortalama;
    }
            
    
    void oveharf_hesap1(int[] transkript)
    {
        int i;
        for( i = 0; i < this.ders_bölüm; i++ )
        {
            if( i < 4 )
            {
                if( transkript[i] >= 80)
                {
                    System.out.println((i+1)+".ders: AA");
                }
                else if( transkript[i] >= 60)
                {
                    System.out.println((i+1)+".ders: BB");
                }
                else if( transkript[i] >= 40)
                {
                    System.out.println((i+1)+".ders: CC");
                }
                else if( transkript[i] >= 20)
                {
                    System.out.println((i+1)+".ders: DD");
                }
                else
                {
                    System.out.println((i+1)+".ders: FF");
                } 
            }
            else
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
                {
                    System.out.println((i+1)+".ders FF");
                }  
            }
        }
    }
    
}
