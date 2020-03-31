package macowins;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public abstract class Venta {
    protected List<Prenda> prendas = new ArrayList<Prenda>();
    private LocalDate fecha;

    public Venta() {
        fecha = LocalDate.now();
    }
    public List<Prenda> getPrendas() {
        return prendas;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double precio() {
        return prendas.stream().mapToDouble((Prenda prenda) -> prenda.precio()).sum();
    }

    public void agregarPrenda(Prenda prenda) {
        prendas.add(prenda);
    }
}
