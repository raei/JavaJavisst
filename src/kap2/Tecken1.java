/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kap2;

import javax.swing.JOptionPane;

public class Tecken1 {
  public static void main (String[] arg) {
    char c1, c2;
    c1 = '\u00D8';
    c2 = Character.toLowerCase(c1);
    JOptionPane.showMessageDialog(null, "" + c1);
    JOptionPane.showMessageDialog(null, "" + c2);
    System.exit(0);  // avslutar programmet
  }
}
