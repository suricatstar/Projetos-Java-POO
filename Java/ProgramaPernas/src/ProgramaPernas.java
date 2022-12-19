import java.util.Scanner;

public class ProgramaPernas {/*só usar em inteiros e fazer um caso pra cada*/
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.print("Quantas pernas? ");
        int perna = tec.nextInt();
        String tipo;
        System.out.print("Isso é um(a) ");
        switch (perna){
            case 1:
                tipo="Saci";
                break;
            case 2:
                tipo="Bípede";
                break;
            case 3:
            tipo = "Tripé";
            break;
            case 4 :
                tipo="Quadrúpede";
                break;
            case 8:
                tipo="Aracnídeo ou Artrópode";
                break;
            default:
                tipo="ET";
        }
        System.out.println(tipo);
    }
}