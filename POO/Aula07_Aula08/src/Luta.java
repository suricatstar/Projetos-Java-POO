import java.util.Random;

public class Luta {
    //atributos
 private Lutador desafiado;
 private Lutador desafiante;
 private int rounds;
 private boolean aprovada;
    //métodos

public void marcarLuta(Lutador l1, Lutador l2 ){
    if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)){
        this.setAprovada(true);
        this.setDesafiado(l1);
        this.setDesafiante(l2);
    } else {
        this.setAprovada(false);
        this.setDesafiado(null);
        this.setDesafiante(null);
    }
}
public void lutar(){
    if (getAprovada()){
        System.out.println("### DESAFIADO ###");
        this.getDesafiado().apresentar();
        System.out.println("### DESAFIANTE ###");
        this.desafiante.apresentar();
        Random aleatorio = new Random();
        int vencedor = aleatorio.nextInt(3);
        System.out.println("====== RESULTADO ======");
        switch (vencedor){
            case 0:
            System.out.println("Empatou!");
            this.desafiado.empatarLuta();
            this.desafiante.empatarLuta();
            case 1:
                System.out.println("Vitória do "+this.desafiado.getNome());
                 this.desafiado.ganharLuta();
                 this.desafiante.perderLuta();
                 break;
            case 2:
                System.out.println("Vitória do "+this.desafiante.getNome());
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();
                break;
        }
        System.out.println("=======================");
    } else {
        System.out.println("a luta não pode acontecer!");
    }

}
    //métodos especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
