package macowins;

public class Prenda {
    private double precioBase;
    public enum TipoPrenda {
        SACO,
        PANTALON,
        CAMISA,
    }

    private TipoPrenda tipo; // Quizás usar un enum no es la mejor idea. Pero decidí hacerlo así porque el enunciado no plantea comportamiento diferente para cada prenda.
                             // Hacer clases para cada tipo de prenda en ese caso me parecia demasiado.

    private EstadoPrenda estado;

    public Prenda(TipoPrenda tipo, double precioBase, EstadoPrenda estado) {
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.estado = estado;
    }

    /**
     * Devuelve el precio con los descuentos ya aplicados
     */
    public double precio() {
        return estado.precioModificado(precioBase);
    }
}
