/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resoluçãotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author caue.tamiarana
 */
public class ResoluçãoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d =tk.getScreenSize();
        System.out.println("A resolução do seu sistema é: " +d.width+"X"+d.height);
    }    
    
}
