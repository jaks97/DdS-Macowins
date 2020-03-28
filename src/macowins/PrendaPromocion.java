package macowins;

public class PrendaPromocion extends Prenda{
    private int descuento; // Porcentaje de descuento de esta prenda

    public PrendaPromocion(TipoPrenda tipo, double precio_base, int descuento) {
        super(tipo, precio_base);
        this.descuento = descuento;
    }

    @Override
    public double precio(){
        return this.precio_base * (1 - descuento / 100);
    }
}
