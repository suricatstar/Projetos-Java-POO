public class Contador01 {
    public static void main(String[] args) {
        int cc=0;
        while (cc<10){
            cc++;
            if (cc == 2 || cc ==3 || cc==4){
                continue;/*joga pra cima do laço)*/
            }
            if (cc==7){
                break;/*ele interrompe a execução do laço*/
            }
            System.out.println("cambalhota " + cc);/*(cc+1)*/

        }
    }
}