public class Aula10 {
    public static void main(String[] args) {
        Pessoa p1=new Pessoa();
        Aluno p2=new Aluno();
        Professor p3=new Professor();
        Funcionario p4=new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");

        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");

        p1.setIdade(12);
        p2.setIdade(23);
        p3.setIdade(45);
        p4.setIdade(34);

        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("estoque");

        /* dá merda se tentar fazer isso aqui
        p1.receberAum(550.20);
        p2.mudarTrabalho();
        p4.cancelarMatr();
        */

        //Classe Abstrata:Não pode ser instanciada.Só pode servir como progenitora
        //Método Abstrato:Declarado,mas não implementado na progenitora.
        //Classe Final:Não pode ser herdada por outra classe.Obrigatoriamente filha.
        //Método Final:Não pode ser sobrescrito pelas suas sub-classes.Obrigatoriamente herdado.

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}