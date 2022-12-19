public class Vetor01 {
    public static void main(String[] args) {
        /*int n[]=new int[4];*/
        /*int[] n = new int[4]*/
        int n[] = {3, 2, 8, 7, 5, 4};
        /*System.out.println("Total de casas de N " + n.length);*/

        for(int c=0;c<=n.length-1;c++){
            System.out.println("Na posição "+(c+1)+" temos o valor " +n[c]);
        }
    }
}