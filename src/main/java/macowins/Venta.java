package macowins;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Venta {
    protected List<Prenda> prendas = new ArrayList<Prenda>();
    private LocalDate fecha;
    private MedioPago medioDePago;

    public Venta(MedioPago medioDePago) {
        fecha = LocalDate.now();
        this.medioDePago = medioDePago;
    }
    public List<Prenda> getPrendas() {
        return prendas;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double precio() {
        return prendas.stream().mapToDouble(Prenda::precio).sum() + medioDePago.recargo(prendas);
    }

    public void agregarPrenda(Prenda prenda) {
        prendas.add(prenda);
    }
}
