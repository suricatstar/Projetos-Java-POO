public class Aula04 {
    public static void main(String[] args) {
        /*Caneta c1 = new Caneta();
        c1.setModelo("BIC");
        c1.setPonta(0.5f);
        //c1.status();
        System.out.println("Tenho uma caneta " + c1.getModelo() +
                " de ponta " + c1.getPonta());*/
        Caneta c1 = new Caneta("NIC","Preta",0.5f);
        c1.status();
        Caneta c2 = new Caneta("PEN","rosa",1.0f);
        c2.status();
    }
}