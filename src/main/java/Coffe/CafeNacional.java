package Coffe;

public class CafeNacional extends Cafe{
    private boolean tostado = false;

    public CafeNacional(boolean tostado) {
        this.tostado = tostado;
    }

    public CafeNacional(double precioBase, boolean tostado) {
        super(precioBase);
        this.tostado = tostado;
    }

    public CafeNacional(int peso, boolean tostado) {
        super(peso);
        this.tostado = tostado;
    }

    public CafeNacional(char calidadC, boolean tostado) {
        super(calidadC);
        this.tostado = tostado;
    }

    public CafeNacional(double precioBase, char calidadC, boolean tostado) {
        super(precioBase, calidadC);
        this.tostado = tostado;
    }

    public CafeNacional(double precioBase, int peso, boolean tostado) {
        super(precioBase, peso);
        this.tostado = tostado;
    }

    public CafeNacional(double precioBase, int peso, char calidadC, boolean tostado) {
        super(precioBase, peso, calidadC);
        this.tostado = tostado;
    }

    public CafeNacional() {
    }

    public CafeNacional(double precioBase) {
        super(precioBase);
    }

    public CafeNacional(int peso) {
        super(peso);
    }

    public CafeNacional(char calidadC) {
        super(calidadC);
    }

    public CafeNacional(double precioBase, char calidadC) {
        super(precioBase, calidadC);
    }

    public CafeNacional(double precioBase, int peso) {
        super(precioBase, peso);
    }

    public CafeNacional(double precioBase, int peso, char calidadC) {
        super(precioBase, peso, calidadC);
    }

    @Override
    public double CalularPrecio() {
        double precioFinal = super.CalularPrecio();
        if(this.tostado){
            precioFinal += 50;
        }
        return precioFinal;
    }
}
