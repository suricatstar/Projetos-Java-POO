public class Caneta {
    public String modelo;
    public String cor;
    /*é mais dificil de ser acessado mas ainda pode ser utilizado(lembrar de destampar
    * e tampar que acessam esse atributo)*/
    private float ponta;
    /*So acessa quem tá na mesma classe*/
    protected int carga;
    protected boolean tampada;

    public void status(){/*this auto referencia*/
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Está tampada? "+this.tampada);
    }
    public void rabiscar(){
        if (this.tampada==true){
            System.out.println("ERRO! Não posso rabiscar");
        }else {
            System.out.println("Estou Rabiscando");
        }
    }
    protected void tampar(){
        //this é o nome do objeto q chamou
        this.tampada=true;
    }
    protected void destampar(){

        this.tampada=false;
    }
}
