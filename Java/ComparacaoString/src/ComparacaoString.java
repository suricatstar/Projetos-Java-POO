public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "caue";
        String nome2 = "caue";
        String nome3 = new String("caue");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
    }
}