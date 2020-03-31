package macowins;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Macowins {
    private List<Venta> ventas = new ArrayList<Venta>();

    public void vender(Venta venta){
        ventas.add(venta);
    }

    public double obtenerGanancias(LocalDate fecha){
        return obtenerVentas(fecha).mapToDouble((Venta venta) -> venta.precio()).sum();
    }

    /**
     * Devuelve una coleccion con las ventas realizadas en una fecha determinada
     */
    public Stream<Venta> obtenerVentas(LocalDate fecha){
        return ventas.stream().filter((Venta venta) -> venta.getFecha().equals(fecha));
    }
}
