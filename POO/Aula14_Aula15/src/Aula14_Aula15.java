public class Aula14_Aula15 {
    public static void main(String[] args) {
        Video v[] =new Video[3];
        v[0]=new Video("Aula 1 de POO");
        v[1]=new Video("Aula 12 de PHP");
        v[2]=new Video("Aula 10 de HTML5");

        Gafanhoto g[]=new Gafanhoto[2];
        g[0]=new Gafanhoto("João",13,"M","João1234");
        g[1]=new Gafanhoto("Daniel",15,"M","DannyLanches");

        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
}