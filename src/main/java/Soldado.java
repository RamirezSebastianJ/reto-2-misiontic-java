public class Soldado extends Juguete{
    //Constantes
    private static final String RANGOBASE = "teniente";

    //variables
    private String rango;

    public Soldado() {
        this.rango = RANGOBASE;
    }

    public Soldado(double precio) {
        super(precio);
        this.rango = RANGOBASE;
    }

    public Soldado(int tamano) {
        super(tamano);
        this.rango = RANGOBASE;
    }

    public Soldado(String rango) {
        this.rango = rango;
    }

    public Soldado(double precio, int tamano) {
        super(precio, tamano);
        this.rango = RANGOBASE;
    }

    public Soldado(double precio, String rango) {
        super(precio);
        this.rango = rango;
    }

    public Soldado(int tamano, String rango) {
        super(tamano);
        this.rango = rango;
    }

    public Soldado(String generoEdad, String rango) {
        super(generoEdad);
        this.rango = rango;
    }

    public Soldado(double precio, int tamano, String generoEdad) {
        super(precio, tamano, generoEdad);
        this.rango = RANGOBASE;
    }

    public Soldado(double precio, int tamano, String generoEdad, String rango) {
        super(precio, tamano, generoEdad);
        this.rango = rango;
    }

    @Override
    public double saldoFinal() {
        switch (rango){
            case "teniente":
                return super.saldoFinal()+50.0;
            case "capitan":
                return super.saldoFinal()+60.0;
            case "coronel":
                return super.saldoFinal()+70.0;
        }
        return super.saldoFinal();
    }
}
