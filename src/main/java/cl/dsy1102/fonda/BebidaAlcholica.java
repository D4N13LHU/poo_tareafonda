package cl.dsy1102.fonda;

public class BebidaAlcholica extends Bebida {
    private int limiteConsumo;

    public BebidaAlcholica(String nombre, double volumen, int stock, double precioBase, int limiteConsumo) {
        super(nombre, volumen, stock, precioBase);
        this.limiteConsumo = limiteConsumo;


    }

    public int getLimiteConsumo() { return limiteConsumo; }

    @Override
    public double calcularPrecioVenta() {
        return getPrecioBase() * 1.20;
    }
}
