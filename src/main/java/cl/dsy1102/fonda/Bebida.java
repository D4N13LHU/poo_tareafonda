package cl.dsy1102.fonda;

public abstract class Bebida {
    private String nombre;
    private double volumen;
    private int stock;
    private double precioBase;


    public Bebida(String nombre, double volumen, int stock, double precioBase){
        this.nombre = nombre;
        this.volumen = volumen;
        this.stock = stock;
        this.precioBase = precioBase;
    }

    public String getNombre() { return nombre; }
    public double getVolumen() { return volumen; }
    public int getStock() { return  stock; }
    public double getPrecioBase() { return precioBase; }


    public abstract double calcularPrecioVenta();
}
