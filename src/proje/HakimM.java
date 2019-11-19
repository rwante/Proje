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
public class HakimM extends Adalet{

    @Override
    int maas_hesap(int[] mahkeme_sayısı) {
        int maas;
        maas = super.maas_hesap(mahkeme_sayısı)+1000;
        return  maas;
    }
    
}
