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
public class Metro extends Trafik_Ulaşım{

    @Override
    double maas_hesap(int saat) {
        if(saat > 50)
        {
            super.maas_hesap(saat+45);
        }
        else
        {
            super.maas_hesap(saat+30);
        }
        return maas;
    }
    
}
