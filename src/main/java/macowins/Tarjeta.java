package macowins;

import java.util.List;

public class Tarjeta implements MedioPago {
    private int cuotas;
    private static final double COEFICIENTE = 0.5;

    public Tarjeta(int cuotas) {
        this.cuotas = cuotas;
    }

    public double recargo(List<Prenda> prendas) {
        return cuotas * COEFICIENTE + prendas.stream().mapToDouble((Prenda prenda) -> prenda.precio() * 0.01).sum();
    }
}
