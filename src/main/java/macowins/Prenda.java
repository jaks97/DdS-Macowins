package macowins;

public class Prenda {
    protected double precioBase;
    public enum TipoPrenda {
        SACO{
            public String toString() { return "Saco"; }
        },
        PANTALON{
            public String toString() { return "Pantalón"; }
        },
        CAMISA{
            public String toString() { return "Camisa"; }
        },
    }

    private TipoPrenda tipo; // Quizás usar un enum no es la mejor idea. Pero decidí hacerlo así porque el enunciado no plantea comportamiento diferente para cada prenda.
                             // Hacer clases para cada tipo de prenda en ese caso me parecia demasiado.

    private EstadoPrenda estado;

    public TipoPrenda getTipo() {
        return tipo;
    }

    public Prenda(TipoPrenda tipo, double precioBase) {
        this.tipo = tipo;
        this.precioBase = precioBase;
    }

    public double precio() {
        return estado.precioModificado(precioBase);
    }
}
