package Coffe;

public class Cafe {
    private double precioBase = 100.0;
    private int peso = 5;
    private char calidadC='F';

    public Cafe() {
    }

    public Cafe(double precioBase) {
        this.precioBase = precioBase;
    }

    public Cafe(int peso) {
        this.peso = peso;
    }


    public Cafe(double precioBase, char calidadC) {
        this.precioBase = precioBase;
        this.calidadC = calidadC;
    }

    public Cafe(double precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Cafe(double precioBase, int peso, char calidadC) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.calidadC = calidadC;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double CalularPrecio(){
        double precioFinal = this.precioBase;
        switch (this.calidadC){
            case 'A':
                precioFinal+= 10;
                break;
            case 'B':
                precioFinal+= 8;
                break;
            case 'C':
                precioFinal+= 6;
                break;
            case 'D':
                precioFinal+= 5;
                break;
            case 'E':
                precioFinal+= 3;
                break;
            case 'F':
                precioFinal+= 1;
                break;
        }

        if(peso>=0 && peso<19){
            precioFinal+=10;
        }
        if(peso>=19 && peso<49){
            precioFinal+=50;
        }
        if(peso>=49&&peso<79){
            precioFinal+=80;
        }
        if(peso>=79){
            precioFinal+= 100;
        }

        return precioFinal;
    }
}
