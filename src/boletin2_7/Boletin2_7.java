/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_7;

import javax.swing.JOptionPane;

/**
 *
 * @author acomesanavila
 */
public class Boletin2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float n;
        float i;
        float t;
        double renda;
        n= Float.parseFloat(JOptionPane.showInputDialog("n"));
        i= Float.parseFloat(JOptionPane.showInputDialog("i"));
        t= Float.parseFloat(JOptionPane.showInputDialog("t"));
        renda=(n*Math.pow((1+i), t)*i)/((Math.pow((1-i), t))-1);
        JOptionPane.showMessageDialog(null,("renda =")+ renda);
    }
    
}
