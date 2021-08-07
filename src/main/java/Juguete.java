public class Juguete {
    //Constantes
    private static final String GENEROEDAD = "niño";
    private static final int TAMANO = 1;
    private static final double PRECIO = 100.0;

    //Variables
    private String generoEdad;
    private int tamano;
    public double precio;

    public Juguete() {
        this.generoEdad = GENEROEDAD;
        this.tamano = TAMANO;
        this.precio = PRECIO;
    }

    public Juguete(double precio) {
        this.precio = precio;
        this.generoEdad = GENEROEDAD;
        this.tamano = TAMANO;
    }

    public Juguete(int tamano) {
        this.tamano = tamano;
        this.generoEdad = GENEROEDAD;
        this.precio = PRECIO;
    }

    public Juguete(String generoEdad) {
        this.generoEdad = generoEdad;
        this.tamano = TAMANO;
        this.precio = PRECIO;
    }

    public Juguete(double precio, int tamano) {
        this.generoEdad = GENEROEDAD;
        this.tamano = tamano;
        this.precio = precio;
    }

    public Juguete(double precio, int tamano, String generoEdad) {
        this.generoEdad = generoEdad;
        this.tamano = tamano;
        this.precio = precio;
    }

    //getters
    public String getGeneroEdad() {
        return generoEdad;
    }

    public int getTamano() {
        return tamano;
    }

    public double getPrecio() {
        return precio;
    }

    //setter

    public void setGeneroEdad(String generoEdad) {
        this.generoEdad = generoEdad;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;

    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double saldoFinal(){
        switch(this.generoEdad){
            case "niñobebe":
                this.precio +=100.0;
                break;
            case "niñabebe":
                this.precio +=80.0;
                break;
            case "niño":
                this.precio +=50.0;
                break;
            case "niña":
                this.precio +=70.0;
                break;
            default:
                this.precio +=50.0;
                this.generoEdad = GENEROEDAD;
                break;
        }

        switch (this.tamano){
            case 1:
                this.precio += 200.0;
                break;
            case 2:
                this.precio += 300.0;
                break;
            case 3:
                this.precio += 400.0;
                break;
            case 4:
                this.precio += 500.0;
                break;
            case 5:
                this.precio += 600.0;
                break;
            case 6:
                this.precio += 700.0;
                break;
            default:
                this.precio += 200.0;
                this.tamano = TAMANO;
                break;
        }
        return precio;
    }
}
