/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kap2;

import javax.swing.JOptionPane;

public class Ramsa {
  public static void main (String[] arg) {
    String a, b;
    a = "Programspråk";
    b = a.substring(4, 8) + a.charAt(5); 
    JOptionPane.showMessageDialog(null, b);
    System.exit(0); 
  }
}
