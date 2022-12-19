import java.util.Scanner;

public class VotoObrigatorio {
    public static void main(String[] args) {
        System.out.print("Digite o ano que você nasceu:");
        Scanner teclado = new Scanner(System.in);
        int ano = teclado.nextInt();
        int i = 2022 - ano;
        System.out.println("Sua idade é " + i + " anos");
        if (i<16){
            System.out.println("Não Vota!");
        } else if ((i>= 16 && i<18) || (i>70)) {
            System.out.println("Voto Opcional");
        } else {
            System.out.println("Voto Obrigatório");
        }
    }
}