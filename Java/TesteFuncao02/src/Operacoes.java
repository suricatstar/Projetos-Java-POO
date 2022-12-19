public class Operacoes {
    /*public (acesaado por qualquer lugar,pessoa ou código)*/
    /*private (para torna-ló privado)*/
    public static String contador(int i , int f){
        String s = "";
        for (int c = i; c<= f; c++){
            s += c + " ";
        }
        return s;
    }
}
