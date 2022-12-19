/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;
import java.util.Scanner;

/**
 *
 * @author caue.tamiarana
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String nome = "Cauê";
        float nota = 8.5f;
        System.out.println("A nota é "+nota);
        System.out.format("A nota de %s é %.2f \n",nome,nota);*/
         Scanner teclado = new Scanner(System.in);
         System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        System.out.format("A nota de %s é %.2f \n",nome,nota);
    }
    
}
