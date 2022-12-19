public class OperadoresLogicos {
    public static void main(String[] args) {

        int x, y, z;
        x=4;
        y=7;
        z=12;
        boolean r;
        /* && and
           || or
           ^ ou excluisivo(somente um ou outro)
           ! not
         */
        r = (x<y ^ y<z)?true:false;
        System.out.println(r);
    }
}