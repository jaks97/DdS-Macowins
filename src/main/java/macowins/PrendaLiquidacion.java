package macowins;

public class PrendaLiquidacion implements EstadoPrenda {
    public double precioModificado(double precioBase) {
        return precioBase / 2; // El precio de una prenda de liquidacion es la mitad que su precio base
    }
}
