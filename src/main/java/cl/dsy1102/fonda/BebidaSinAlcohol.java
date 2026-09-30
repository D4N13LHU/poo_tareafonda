package cl.dsy1102.fonda;

public class BebidaSinAlcohol extends Bebida {
    public BebidaSinAlcohol(String nombre, double volumen, int stock, double precioBase) {
        super(nombre, volumen, stock, precioBase);
    }

    @Override
    public double calcularPrecioVenta() {
        return getPrecioBase();

    }
}
