public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        //chama a super instância
        this.login=login;
        this.totAssistido = 0;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public void viuMaisUm(){

    }

    @Override //chama a Instância também
    public String toString() {
        return "Gafanhoto{" +super.toString()+
                "\nlogin='" + login + '\'' +
                ", totAssistido=" + totAssistido +
                '}';
    }
}
