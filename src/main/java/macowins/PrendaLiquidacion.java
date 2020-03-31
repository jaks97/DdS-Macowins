package macowins;

public class PrendaLiquidacion implements EstadoPrenda {
    public double precioModificado(double precioBase) {
        return precioBase / 2;
    }
}
