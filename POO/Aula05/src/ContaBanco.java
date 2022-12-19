public class ContaBanco {
    public int numConta;
    protected String tipo; //cc ou cp
    private String dono;
    private float saldo;
    private boolean status;


    public ContaBanco() {
        this.status=false;
        this.saldo=0;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public void abrirConta(String type){
        this.setTipo(type);
        this.setStatus(true);
        if (type=="cc"){
            this.setSaldo(saldo+=50);
            System.out.println("Você ganhou R$50 na sua conta");
        } else if (type=="cp") {
            this.setSaldo(saldo+=150);
            System.out.println("Você ganhou R$150 na sua conta");
        }else {
            System.out.println("Digite cc (Conta corrente) ou cp (Conta poupança)");
        }
    }
    public void fecharConta(){
        if (this.getSaldo()>0){
            System.out.print("Não foi possivel fechar sua conta");
            System.out.println(" Por favor retirar o seu dinheiro antes.");
        } else if (this.getSaldo()<0) {
            System.out.print("Não foi possivel fechar sua conta");
            System.out.println("Você não pode fechar sua conta se estiver nôs devendo!");
        } else {
            System.out.println("Conta fechada com sucesso");
            this.setStatus(false);
        }

    }
    public void depositar(float v){
        if (this.getStatus()){
            setSaldo(getSaldo()+v);
            System.out.println("Depósito realizado na conta de "+this.getDono());
        } else {
            System.out.println("Não foi possível depositar, abra a conta");
        }
    }
    public void sacar(float saq){
        if (this.getStatus()==true){
            if (this.getSaldo()>=saq){
                this.setSaldo(this.getSaldo()-saq);
                System.out.println("Saque realizado na conta de "+ this.getDono());
            }
            else{
                System.out.println("Não foi possível realizar saque, saldo insuficiente");
            }
        }
        else {
                System.out.println("Impossível sacar de uma conta fechada!");
        }

    }
    public void pagarMensal(){
        int mensal;
        if (this.getTipo()=="cc"){
            mensal=12;
            this.setSaldo(saldo-=mensal);
            System.out.println("Foi tirado R$"+mensal+" de mensalidade.");
        } else if (this.getTipo().equals("cp")) {
            mensal=20;
            this.setSaldo(saldo-=mensal);
            System.out.println("Foi tirado R$"+mensal+" de mensalidade.");
        }
        System.out.println("Seu saldo agora é de R$"+this.getSaldo());
    }
    public void estadoAtual(){
        System.out.println("------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }

}
