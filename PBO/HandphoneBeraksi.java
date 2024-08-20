/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO;

/**
 *
 * @author Azzam Wildan
 */
public class HandphoneBeraksi {
    public void nyalakan(){
        hidupkan();
        lakukanpanggilan();
        kirimSMS();
        matikan();
        }
    private void hidupkan(){
        System.out.println("Handphone Hidup");
    }
    private void lakukanpanggilan(){
        System.out.println("Kring, Kring, Kring... Panggilan dilakukan");
    }
    private void kirimSMS(){
        System.out.println("Dung, Dung SMS Berhasil terkirim");
    }
    private void matikan(){
        System.out.println("Handphone mati..");
    }
    
    
}
