public class App {

    public static void main(String[] args) {
        Juguete[] intem =new Juguete[5];
        intem[0]=new Juguete(150.0,5,"niñobebe");
        intem[1]=new Soldado(150.0,5);
        intem[2]=new Barbie(500.0,10,"infante","mama");
        intem[3]=new Juguete();
        intem[4]=new Soldado(600.0,4,"niñobebe","coronel");
        SumaTotal analisis1 = new SumaTotal(intem);
        analisis1.mostrarTotales();
    }
}
