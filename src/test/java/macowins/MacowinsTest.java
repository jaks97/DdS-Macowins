package macowins;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class MacowinsTest {
    Macowins macowins;

    @Before
    public void initialize() {
        // Instancio Macowins
        macowins = new Macowins();

        // Creo algunas prendas
        Prenda saco = new Prenda(Prenda.TipoPrenda.SACO, 200, new PrendaNueva());
        Prenda pantalon = new Prenda(Prenda.TipoPrenda.PANTALON, 200, new PrendaLiquidacion());
        Prenda camisa = new Prenda(Prenda.TipoPrenda.CAMISA, 150, new PrendaPromocion(50));

        // Creo algunas ventas
        Venta venta1 = new Venta(new Efectivo());
        venta1.agregarPrenda(saco);
        macowins.vender(venta1);
        Venta venta2 = new Venta(new Tarjeta(6));
        venta2.agregarPrenda(pantalon);
        venta2.agregarPrenda(camisa);
        macowins.vender(venta2);
    }

    @Test
    public void testGananciasDelDia() {
        assertEquals(405, macowins.obtenerGanancias(LocalDate.now()), 0.01); // Las ganancias del dia son la suma de los totales de las ventas
    }
}