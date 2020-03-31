package macowins;

public class PrendaLiquidacion extends Prenda {
    public PrendaLiquidacion(TipoPrenda tipo, double precio_base) {
        super(tipo, precio_base);
    }

    @Override
    public double precio(){
        return this.precio_base / 2;
    }
}
