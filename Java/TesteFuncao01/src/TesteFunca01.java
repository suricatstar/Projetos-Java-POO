public class TesteFunca01 {
    static int/*void*/ soma(int a,int b){
        int s = a+b;
        return s;
        /*System.out.println("A soma é " + s);*/
    }
    /* void não retorna nada, Main é um metodo, static serve para classe não para instancia
    (procedimento estatico com estatico)*/
    public static void main(String[] args) {
        System.out.println("Começou o programa");
        /*soma(5,6);*/
        int sm = soma(5,2);
        System.out.println("A soma vale "+sm);
    }
}