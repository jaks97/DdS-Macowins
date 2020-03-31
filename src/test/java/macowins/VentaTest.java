package macowins;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VentaTest {
    Prenda saco;
    Prenda pantalon;
    Prenda camisa;

    @Before
    public void initialize() {
        // Creo algunas prendas
        saco = new Prenda(Prenda.TipoPrenda.SACO, 200, new PrendaNueva());
        pantalon = new Prenda(Prenda.TipoPrenda.PANTALON, 200, new PrendaLiquidacion());
        camisa = new Prenda(Prenda.TipoPrenda.CAMISA, 150, new PrendaPromocion(50));
    }

    @Test
    public void testVentaEfectivo(){
        Venta venta = new Venta(new Efectivo()); // Armo una venta en efectivo
        venta.agregarPrenda(saco); // Agrego una prenda
        double subtotal = saco.precio(); // Calculo el subtotal como el precio del saco
        assertEquals(subtotal, venta.precio(), 0.01); // El precio de la venta deberia ser igual al subtotal, pues no hay recargo en efectivo
    }

    @Test
    public void testVentaTarjeta(){
        Venta venta = new Venta(new Tarjeta(6)); // Armo una venta en efectivo
        venta.agregarPrenda(pantalon); // Agrego una prenda
        venta.agregarPrenda(camisa); // Agrego una prenda
        double subtotal = pantalon.precio() + camisa.precio(); // Calculo el subtotal como la suma de las prendas
        double recargo = 5; // Recargo por la compra en 6 cuotas
        assertEquals(subtotal + recargo, venta.precio(), 0.01); // El precio de la venta deberia ser igual a la del saco, pues no hay recargo en efectivo
    }
}