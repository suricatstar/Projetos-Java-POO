/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idiomasistema;

import java.util.Locale;

/**
 *
 * @author caue.tamiarana
 */
public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Locale idioma = Locale.getDefault();
        System.out.print("O idioma do sistema é:");
        System.out.println(idioma.getDisplayLanguage());
    }
    
}
