package macowins;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Macowins {
    private List<Prenda> prendas = new ArrayList<Prenda>();
    private List<Venta> ventas = new ArrayList<Venta>();

    public void agregarPrenda(Prenda prenda) {
        prendas.add(prenda);
    }

    public List<Prenda> getPrendas() {
        return prendas;
    }

    public void vender(Venta venta){
        ventas.add(venta);
    }

    public double obtenerGanancias(LocalDate fecha){
        return obtenerVentas(fecha).mapToDouble((Venta venta) -> venta.precio()).sum();
    }

    public Stream<Venta> obtenerVentas(LocalDate fecha){
        return ventas.stream().filter((Venta venta) -> venta.getFecha().equals(fecha));
    }
}
