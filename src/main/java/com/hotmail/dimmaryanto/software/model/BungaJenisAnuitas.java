/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hotmail.dimmaryanto.software.model;

/**
 *
 * @author bpr_ukabima
 */
public class BungaJenisAnuitas extends KreditDetail {

    public BungaJenisAnuitas(Integer angsuranKe, Double plafond, Integer jangka, Double bunga) {
        setAngsuranBunga(plafond, jangka);
    }

    public void setAngsuranBunga(Double plafond, Integer jangka) {
        super.setAngsuranBunga(plafond * jangka); //To change body of generated methods, choose Tools | Templates.
    }

}
