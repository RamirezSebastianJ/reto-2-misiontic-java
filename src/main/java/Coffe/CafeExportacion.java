package Coffe;

public class CafeExportacion extends Cafe{
    private int cif = 20;
    private boolean verde = false;



    public CafeExportacion(int cif, boolean verde) {
        this.cif = cif;
        this.verde = verde;
    }

    public CafeExportacion(double precioBase, int peso) {
        super(precioBase, peso);
    }

    public CafeExportacion(double precioBase, int cif, boolean verde) {
        super(precioBase);
        this.cif = cif;
        this.verde = verde;
    }

    public CafeExportacion(int peso, int cif, boolean verde) {
        super(peso);
        this.cif = cif;
        this.verde = verde;
    }

    public CafeExportacion(char calidadC, int cif, boolean verde) {
        super(calidadC);
        this.cif = cif;
        this.verde = verde;
    }

    public CafeExportacion(double precioBase, char calidadC, int cif, boolean verde) {
        super(precioBase, calidadC);
        this.cif = cif;
        this.verde = verde;
    }

    public CafeExportacion(double precioBase, int peso, int cif, boolean verde) {
        super(precioBase, peso);
        this.cif = cif;
        this.verde = verde;
    }

    public CafeExportacion(double precioBase, int peso, char calidadC, int cif, boolean verde) {
        super(precioBase, peso, calidadC);
        this.cif = cif;
        this.verde = verde;
    }

    @Override
    public double CalularPrecio() {
        double precioFinal = super.CalularPrecio();
        if(this.verde){
            precioFinal+=50;
        }

        if(cif>40){
            precioFinal+= super.getPrecioBase()*0.3;
        }

        return precioFinal;
    }
}
