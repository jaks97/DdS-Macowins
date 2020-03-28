package macowins;

public class VentaTarjeta extends Venta {
    private int cuotas;
    private static final double COEFICIENTE = 0.5;

    public VentaTarjeta(int cuotas) {
        super();
        this.cuotas = cuotas;
    }

    public double recargoCuotas() {
        return cuotas * COEFICIENTE + prendas.stream().mapToDouble((Prenda prenda) -> prenda.precio() * 0.01).sum();
    }

    public double precio() {
        return super.precio() + recargoCuotas();
    }
}
