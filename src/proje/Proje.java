/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Proje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tercihSicil = 1,tercihMahkeme = 1,tercihMaas = 1,tercihBurs = 1,tercihTranskript = 1;
        int tercihOtobüs = 1,tercihPlaka = 1,tercihTMaas = 1;
        int ders_sayısı = 0,saat,maas;
        double ortalama;
        String tercih = "",tercihAdalet = "",tercihEğitim = "",tercihUlasım = "";
        Scanner scanT = new Scanner(System.in);
        while(!"H".equals(tercih))
        {
            System.out.println("Adalet İçin A");
            System.out.println("Eğitim İçin E");
            System.out.println("Trafik_Ulaşım İçin T");
            System.out.println("Çıkış İçin H giriniz:");
            tercih = scanT.nextLine();
            if("A".equals(tercih))
            {
                Adalet a1 = new Adalet();
                HakimM h1 = new HakimM();
                while(!"H".equals(tercihAdalet))
                {
                    System.out.println("Sicil Kayıt Kısmı için S");
                    System.out.println("Mahkeme Kısmı için M");
                    System.out.println("Maas Kısmı için A Giriniz");
                    System.out.println("Bir önceki menü için H giriniz:");
                    tercihAdalet = a1.scan.nextLine();
                    if("S".equals(tercihAdalet))
                    {
                        while(tercihSicil != 0)
                        {
                            System.out.println("Sicil eklemek için 1");
                            System.out.println("Sicil Görüntülemek için 2");
                            System.out.println("Sicil silmek için 3");
                            System.out.println("Bir önceki menü için 0 giriniz:");
                            tercihSicil = Integer.parseInt(a1.scan.nextLine());
                            if(tercihSicil == 1)
                            {
                                a1.sicil_ekleme(a1.sicil_kayıt);
                            }
                            else if(tercihSicil == 2)
                            {
                                a1.sicil_kayıt_yazdırma(a1.sicil_kayıt);
                            }
                            else if(tercihSicil == 3)
                            {
                                a1.sicil_kayıt_silme(a1.sicil_kayıt);
                            }
                            else if(tercihSicil != 0)
                            {
                                System.out.println("Hatalı Giriş!!!");
                            }
                            else
                            {
                                System.out.println("Bir önceki menüye dönülüyor...");
                            }
                        }
                    }
                    else if("M".equals(tercihAdalet))
                    {
                        while(tercihMahkeme != 0)
                        {
                            System.out.println("Mahkeme yazmak için 1");
                            System.out.println("Mahkemeleri görüntülemek için 2");
                            System.out.println("Mahkeme silmek için 3");
                            System.out.println("Toplam mahkeme sayısını görüntülemek için 4");
                            System.out.println("Bir aydaki ortalama mahkeme sayısı için 5");
                            System.out.println("Bir önceki menü için 0 giriniz:");
                            tercihMahkeme = Integer.parseInt(a1.scan.nextLine());
                            if(tercihMahkeme == 1)
                            {
                                a1.mahkeme_yazma(a1.mahkeme_sayısı);
                            }
                            else if(tercihMahkeme == 2)
                            {
                                a1.mahkeme_gösterme(a1.mahkeme_sayısı);
                            }
                            else if(tercihMahkeme == 3)
                            {
                                a1.mahkeme_silme(a1.mahkeme_sayısı);
                            }
                            else if(tercihMahkeme == 4)
                            {
                                System.out.println("Toplam Mahkeme Sayısı: "+a1.tveo_gösterme(a1.mahkeme_sayısı));
                            }
                            else if(tercihMahkeme == 5)
                            {
                                System.out.println("Ortalama Mahkeme Sayısı: "+a1.tveo_gösterme(a1.tveo_gösterme(a1.mahkeme_sayısı)));
                            }
                            else if(tercihMahkeme != 0)
                            {
                                System.out.println("Hatalı Giriş!!!");
                            }
                            else
                            {
                                System.out.println("Bir önceki menüye dönülüyor...");
                            }
                        }
                    }
                    else if("A".equals(tercihAdalet))
                    {
                        while(tercihMaas != 0)
                        {
                            System.out.println("Savcı maas için 1");
                            System.out.println("Hakim maas için 2");
                            System.out.println("Bir önceki menü için 0 giriniz:");
                            tercihMaas = Integer.parseInt(a1.scan.nextLine());
                            if(tercihMaas == 1)
                            {
                                maas = a1.maas_hesap(a1.mahkeme_sayısı);
                                System.out.println(maas);
                            }
                            else if(tercihMaas == 2)
                            {
                                maas = h1.maas_hesap(a1.mahkeme_sayısı);
                                System.out.println(maas);
                            }
                            else if(tercihMaas != 0)
                            {
                                System.out.println("Hatalı Giriş!!!");
                            }
                            else
                            {
                                System.out.println("Bir önceki menüye dönülüyor...");
                            }
                        }
                        
                    }
                    else if(!"H".equals(tercihAdalet))
                    {
                        System.out.println("Hatalı Giriş!!!");
                    }
                    else
                    {
                        System.out.println("Bir önceki menüye dönülüyor...");
                    }
                }
            }
            else if("E".equals(tercih))
            {
                Eğitim e1 = new Eğitim();
                BölümN b1 = new BölümN();
                while(!"H".equals(tercihEğitim))
                {
                    System.out.println("Burs için B");
                    System.out.println("Transkript için T");
                    System.out.println("Bir önceki menü için H Giriniz:");
                    tercihEğitim = e1.scan.nextLine();
                    if("B".equals(tercihEğitim))
                    {
                        while(tercihBurs != 0)
                        {
                            System.out.println("Burs kayıt için 1");
                            System.out.println("Bursiyer listesi için 2");
                            System.out.println("Burs kayıt silme için 3");
                            System.out.println("Bir önceki menü için 0 giriniz:");
                            tercihBurs = Integer.parseInt(e1.scan.nextLine());
                            if(tercihBurs == 1)
                            {
                                e1.burs_kayıt(e1.burs_basvuru);
                            }
                            else if(tercihBurs == 2)
                            {
                                e1.burs_basvuru_yazdırma(e1.burs_basvuru);
                            }
                            else if(tercihBurs == 3)
                            {
                                e1.burs_basvuru_silme(e1.burs_basvuru);
                            }
                            else if(tercihBurs != 0)
                            {
                                System.out.println("Hatalı Giriş!!!");
                            }
                            else
                            {
                                System.out.println("Bir önceki menüye dönülüyor...");
                            }
                        }
                        
                    }
                    else if("T".equals(tercihEğitim))
                    {
                        while(tercihTranskript != 0)
                        {
                            System.out.println("Transkript yazma için 1");
                            System.out.println("Transkript Görüntüleme için 2");
                            System.out.println("Harf hesabı için 3");
                            System.out.println("Bölüm derslerini dahil ederek hesap için 4");
                            System.out.println("Bir önceki menüye dönmek için 0 giriniz:");
                            tercihTranskript = Integer.parseInt(e1.scan.nextLine());
                            if(tercihTranskript == 1)
                            {
                                ders_sayısı = e1.transkript_yazma(e1.transkript);
                            }
                            else if(tercihTranskript == 2)
                            {
                                e1.transkript_görünteleme(e1.transkript, ders_sayısı);
                            }
                            else if(tercihTranskript == 3)
                            {
                                e1.oveharf_hesap(e1.transkript, e1.oveharf_hesap(e1.transkript), ders_sayısı);
                            }
                            else if(tercihTranskript == 4)
                            {
                                ortalama = b1.oveharf_hesap(e1.transkript);
                                System.out.println("Ortalama:"+ortalama);
                                b1.oveharf_hesap1(e1.transkript);
                            }
                            else if(tercihTranskript != 0)
                            {
                                System.out.println("Hatalı Giriş!!!");
                            }
                            else
                            {
                                System.out.println("Bir önceki menüye dönülüyor...");
                            }
                        }
                    }
                    else if(!"H".equals(tercihEğitim))
                    {
                        System.out.println("Hatalı Giriş!!!");
                    }
                    else
                    {
                        System.out.println("Bir önceki menüye dönülüyor...");
                    }
                }
            }
            else if("T".equals(tercih))
            {
                Trafik_Ulaşım t1 = new Trafik_Ulaşım();
                Metro m1 = new Metro();
                while(!"H".equals(tercihUlasım))
                {
                    System.out.println("Plaka için P");
                    System.out.println("Otobüs için O");
                    System.out.println("Maas için M");
                    System.out.println("Bir önceki menü için H giriniz:");
                    tercihUlasım = t1.scan.nextLine();
                    if("P".equals(tercihUlasım))
                    {
                        while(tercihPlaka != 0)
                        {
                            System.out.println("Plaka eklemek için 1");
                            System.out.println("Plakaları görüntülemek için 2");
                            System.out.println("Plaka silmek için 3");
                            System.out.println("Bir önceki menü için 0 giriniz:");
                            tercihPlaka = Integer.parseInt(t1.scan.nextLine());
                            if(tercihPlaka == 1)
                            {
                                t1.plaka_ekleme(t1.plaka);
                            }
                            else if(tercihPlaka == 2)
                            {
                                t1.plaka_yazdırma(t1.plaka);
                            }
                            else if(tercihPlaka == 3)
                            {
                                t1.plaka_silme(t1.plaka);
                            }
                            else if(tercihPlaka != 0)
                            {
                                System.out.println("Hatalı giriş!!!");
                            }
                            else
                            {
                                System.out.println("Bir önceki menüye dönülüyor...");
                            }
                        }
                    }
                    else if("O".equals(tercihUlasım))
                    {
                        while(tercihOtobüs != 0)
                        {
                            System.out.println("Otobüs kar yazmak için 1");
                            System.out.println("Otobüs kar silmek için 2");
                            System.out.println("Toplam kar için 3");
                            System.out.println("Ortalama kar için 4");
                            System.out.println("Bir önceki menü için 0 giriniz:");
                            tercihOtobüs = Integer.parseInt(t1.scan.nextLine());
                            if(tercihOtobüs == 1)
                            {
                                t1.otobüs_kar(t1.otobüs);
                            }
                            else if(tercihOtobüs == 2)
                            {
                                t1.kar_silme(t1.otobüs);
                            }
                            else if(tercihOtobüs == 3)
                            {
                                System.out.println("Toplam:"+t1.toplam_bulma(t1.otobüs));
                            }
                            else if(tercihOtobüs == 4)
                            {
                                t1.otobüs_kar(t1.toplam_bulma(t1.otobüs));
                            }
                            else if(tercihOtobüs != 0)
                            {
                                System.out.println("Hatalı Giriş");
                            }
                            else
                            {
                                System.out.println("Bir önceki menüye dönülüyor...");
                            }
                        }
                    }
                    else if("M".equals(tercihUlasım))
                    {
                        while(tercihTMaas != 0)
                        {
                            System.out.println("Otobüs Şoför maas için 1");
                            System.out.println("Metro Şoför maas için 2");
                            System.out.println("Bir önceki menü için 0 giriniz:");
                            tercihTMaas = Integer.parseInt(t1.scan.nextLine());
                            if(tercihTMaas == 1)
                            {
                                System.out.println("Çalışılan saat:");
                                saat = Integer.parseInt(t1.scan.nextLine());
                                System.out.println("Maas:"+t1.maas_hesap(saat));
                            }
                            else if(tercihTMaas == 2)
                            {
                                System.out.println("Çalışılan saat:");
                                saat = Integer.parseInt(t1.scan.nextLine());
                                System.out.println("Maas:"+m1.maas_hesap(saat));
                            }
                            else if(tercihMaas != 0)
                            {
                                System.out.println("Hatalı Giriş!!!");
                            }
                            else
                            {
                                System.out.println("Bir önceki menüye dönülüyor...");
                            }
                        }
                    }
                    else if(!"H".equals(tercihUlasım))
                    {
                        System.out.println("Hatalı Giriş!!!");
                    }
                    else
                    {
                        System.out.println("Bir önceki menüye dönülüyor...");
                    }
                }
            }
            else if(!"H".equals(tercih))
            {
                System.out.println("Hatalı Harf Girişi!!!");
            }
            else
                System.out.println("Program Sonlandırılıyor...");
            
        }
        
        
    }
    
}
