package macowins;

import java.util.List;

public class Efectivo implements MedioPago {
    public double recargo(List<Prenda> prendas) {
        return 0; // No hay recargo por ventas en efectivo
    }
}
