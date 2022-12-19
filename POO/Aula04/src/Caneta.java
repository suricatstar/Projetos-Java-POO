public class Caneta {
    public String modelo;
    private Float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String m, String c,float p){
    //esse tem parâmetro
        this.setModelo(m);
        this.cor = c;
        this.tampar();
        this.setPonta(p);

    }
    /*public Caneta(){
     //Este é o método Construtor(não leva o tipo de retorno)
         this.tampar();
         this.cor = "Azul";
         this.setPonta(0.0f);
     }*/
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo =m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta=p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada=false;
    }

    public void status(){
        System.out.println("SOBRE A CANETA");
        //System.out.println("MODELO: "+this.modelo);
        //System.out.println("PONTA: "+this.ponta);
        System.out.println("MODELO: "+this.getModelo());
        System.out.println("PONTA: "+this.getPonta());
        System.out.println("COR: "+this.cor);
        System.out.println("TAMPADA: "+this.tampada);
    }

    // command N faz isso tudo mais rápido
}
