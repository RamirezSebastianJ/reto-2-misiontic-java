public class SumaTotal{
    private float totalJuguete = 0;
    private float totalSoldado = 0;
    private float totalBarbie = 0;
    private Juguete intem[];

    public SumaTotal() {
    }

    public SumaTotal(Juguete[] intem) {
        this.intem = intem;
    }

    public SumaTotal(int totalJuguete, int totalSoldado, int totalBarbie) {
        this.totalJuguete = totalJuguete;
        this.totalSoldado = totalSoldado;
        this.totalBarbie = totalBarbie;
    }

    public void mostrarTotales() {
        for (Juguete item:intem) {
            String object = ((Object)item).getClass().getSimpleName().toString();
            switch (object){
                case "Juguete":
                    totalJuguete+=item.saldoFinal();
                    break;
                case "Soldado":
                    totalSoldado+=item.saldoFinal();
                    break;
                case "Barbie":
                    totalBarbie+= item.saldoFinal();
                    break;
            }
        }
        totalJuguete+=totalBarbie+totalSoldado;
        System.out.println("La suma del precio de los juguetes  es de "+totalJuguete);
        System.out.println("La suma del precio de los Soldados es de "+ totalSoldado);
        System.out.println("La suma del precio de las Barbies es de "+totalBarbie);
    }
}
