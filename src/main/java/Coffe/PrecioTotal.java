package Coffe;

public class PrecioTotal {
    private double totalCafe;
    private double totalCafeNacional;
    private double totalCafeExportacion;
    private Cafe[] listaCafe;

    public PrecioTotal(Cafe[] listaCafe) {
        this.listaCafe = listaCafe;
    }

    public PrecioTotal(double totalCafe, double totalCafeNacional, double totalCafeExportacion, Cafe[] listaCafe) {
        this.totalCafe = totalCafe;
        this.totalCafeNacional = totalCafeNacional;
        this.totalCafeExportacion = totalCafeExportacion;
        this.listaCafe = listaCafe;
    }

    public void setTotalCafe(double totalCafe) {
        this.totalCafe = totalCafe;
    }

    public void setTotalCafeNacional(double totalCafeNacional) {
        this.totalCafeNacional = totalCafeNacional;
    }

    public void setTotalCafeExportacion(double totalCafeExportacion) {
        this.totalCafeExportacion = totalCafeExportacion;
    }

    public void setListaCafe(Cafe[] listaCafe) {
        this.listaCafe = listaCafe;
    }

    public double getTotalCafe() {
        return totalCafe;
    }

    public double getTotalCafeNacional() {
        return totalCafeNacional;
    }

    public double getTotalCafeExportacion() {
        return totalCafeExportacion;
    }

    public Cafe[] getListaCafe() {
        return listaCafe;
    }

    public void mostrarTotales(){
        for (Cafe item:listaCafe) {
            String object = ((Object)item).getClass().getSimpleName().toString();
            switch (object){
                case "CafeExportacion":
                    this.totalCafeExportacion+=item.CalularPrecio();
                    break;
                case "CafeNacional":
                    this.totalCafeNacional+=item.CalularPrecio();
                    break;
                case "Cafe":
                    this.totalCafe+=item.CalularPrecio();
                    break;
            }
        }
        this.totalCafe+=this.totalCafeNacional+this.totalCafeExportacion;
        System.out.println("La suma del precio del café es de " + totalCafe);
        System.out.println("La suma del precio del café tipo nacional es de " + totalCafeNacional);
        System.out.print("La suma del precio del café tipo exportación es de " + totalCafeExportacion);
    }
}
