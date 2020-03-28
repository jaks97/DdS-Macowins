package macowins;

public class PrendaNueva extends Prenda{
    public PrendaNueva(TipoPrenda tipo, double precio_base) {
        super(tipo, precio_base);
    }

    @Override
    public double precio(){
        return this.precio_base;
    }
}
