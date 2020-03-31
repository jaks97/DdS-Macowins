package macowins;

public class PrendaPromocion implements EstadoPrenda {
    private int descuento;

    public PrendaPromocion(int descuento) {
        this.descuento = descuento;
    }

    public double precioModificado(double precioBase) {
        return precioBase;
    }
}
