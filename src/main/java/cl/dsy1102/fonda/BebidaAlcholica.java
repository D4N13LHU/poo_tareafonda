package cl.dsy1102.fonda;

public class BebidaAlcholica extends Bebida implements ConsumoResponsable{
    private int limiteConsumo;
    private boolean ventaRestringida;

    public BebidaAlcholica(String nombre, double volumen, int stock, double precioBase, int limiteConsumo) {
        super(nombre, volumen, stock, precioBase);
        this.limiteConsumo = limiteConsumo;
        this.ventaRestringida = false;


    }

    public int getLimiteConsumo() {
        return limiteConsumo;
    }

    @Override
    public double calcularPrecioVenta() {
        return getPrecioBase() * 1.20;

    }
    @Override
    public void setVentaRestringida(boolean restringida){
        this.ventaRestringida = restringida;
    }
    @Override
    public boolean isVentaRestringida(){
        return this.ventaRestringida;
    }
}
