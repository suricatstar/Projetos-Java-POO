public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1=new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("craudete");
        p1.abrirConta("cc");
        p1.depositar(100);
        //p1.sacar(1000);
        p1.sacar(150);
        p1.fecharConta();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(1222);
        p2.setDono("juruneva");
        p2.abrirConta("cp");
        p2.depositar(500);
        p2.sacar(100);

        p2.estadoAtual();
        p1.estadoAtual();
    }
}