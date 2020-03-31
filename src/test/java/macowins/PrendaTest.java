package macowins;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrendaTest {
    @Test
    public void testPrecioNueva() {
        Prenda saco = new Prenda(Prenda.TipoPrenda.SACO, 200, new PrendaNueva());
        assertEquals(200, saco.precio(), 0.01); // El precio de una prenda nueva no se ve modificado
    }
    @Test
    public void testPrecioLiquidacion() {
        Prenda pantalon = new Prenda(Prenda.TipoPrenda.PANTALON, 200, new PrendaLiquidacion());
        assertEquals(100, pantalon.precio(), 0.01); // El precio de una prenda en liquidacion es la mitad del precio base
    }
    @Test
    public void testPrecioPromocion() {
        Prenda camisa = new Prenda(Prenda.TipoPrenda.CAMISA, 150, new PrendaPromocion(50));
        assertEquals(100, camisa.precio(), 0.01); // El precio de una prenda en promocion es el precio base menos el descuento
    }
}