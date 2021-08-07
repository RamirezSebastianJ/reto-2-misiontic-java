public class Barbie extends Juguete{
    //Constantes
    private static final String OFICIOBASE = "mama";

    //variables
    private String oficio;

    public Barbie() {
        this.oficio = OFICIOBASE;
    }

    public Barbie(double precio) {
        super(precio);
        this.oficio = OFICIOBASE;
    }

    public Barbie(int tamano) {
        super(tamano);
        this.oficio = OFICIOBASE;
    }

    public Barbie(String oficio) {
        this.oficio = oficio;
        this.oficio = OFICIOBASE;
    }

    public Barbie(double precio, String oficio) {
        super(precio);
        this.oficio = oficio;
    }

    public Barbie(int tamano, String oficio) {
        super(tamano);
        this.oficio = oficio;
    }

    public Barbie(String generoEdad, String oficio) {
        super(generoEdad);
        this.oficio = oficio;
    }

    public Barbie(double precio, int tamano) {
        super(precio, tamano);
        this.oficio = OFICIOBASE;
    }

    public Barbie(double precio, int tamano, String generoEdad) {
        super(precio, tamano, generoEdad);
        this.oficio = OFICIOBASE;
    }

    public Barbie(double precio, int tamano, String generoEdad, String oficio) {
        super(precio, tamano, generoEdad);
        this.oficio = oficio;
    }

    @Override
    public double saldoFinal() {
        switch (oficio){
            case "piloto":
                return super.saldoFinal()+50.0;
            case "doctora":
                return super.saldoFinal()+30.0;
            case "mama":
                return super.saldoFinal()+120.0;
        }
        return super.saldoFinal();
    }

}
