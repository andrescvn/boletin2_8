/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_8;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Boletin2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float ºc ;
        float f;
        float k;
        float ctn= 32;
        float ctn2= 273;
        ºc= Float.parseFloat(JOptionPane.showInputDialog("ºc"));
        f=ºc+ctn;
        k=ºc+ctn2;
        JOptionPane.showMessageDialog(null,("f =")+ f);
        JOptionPane.showMessageDialog(null,("k =")+ k);
    }
    
}
