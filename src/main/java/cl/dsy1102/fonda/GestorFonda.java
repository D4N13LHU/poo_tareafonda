package cl.dsy1102.fonda;

import java.util.ArrayList;
import java.util.List;

public class GestorFonda {
    private List<Bebida> inventario;

    public GestorFonda() {
        this.inventario = new ArrayList<>();
    }

    // TODO 3: Registrar todas en el gestor
    public void agregarBebida(Bebida bebida) {
        inventario.add(bebida);
    }

    // Método para realizar ventas y descontar stock
    public void venderBebida(Bebida bebida, int cantidadVendida) {
        // Verifica si la bebida tiene venta restringida
        if (bebida instanceof ConsumoResponsable) {
            ConsumoResponsable bebidaResp = (ConsumoResponsable) bebida;
            if (bebidaResp.isVentaRestringida()) {
                System.out.println("❌ Venta denegada: La bebida '" + bebida.getNombre() + "' tiene la venta restringida.");
                return;
            }
        }

        // Verifica el stock y vende
        if (bebida.getStock() >= cantidadVendida) {
            bebida.setStock(bebida.getStock() - cantidadVendida);
            double total = bebida.calcularPrecioVenta() * cantidadVendida;
            System.out.println("✅ Venta exitosa: " + cantidadVendida + "x " + bebida.getNombre() + " | Total: $" + total);
        } else {
            System.out.println("⚠️ Error: Stock insuficiente para " + bebida.getNombre());
        }
    }

    // TODO 5: Buscar por nombre "Chicha"
    public void buscarPorNombre(String nombre) {
        System.out.println("\n--- RESULTADO DE BÚSQUEDA ---");
        for (Bebida b : inventario) {
            if (b.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Encontrada: " + b.getNombre() + " | Stock actual: " + b.getStock());
                return;
            }
        }
        System.out.println("No se encontró la bebida: " + nombre);

    }

    // TODO 5: Listar todas las bebidas
    public void listarBebidas() {
        System.out.println("\n--- INVENTARIO COMPLETO ---");
        for (Bebida b : inventario) {
            System.out.println("- " + b.getNombre() + " | Precio Venta: $" + b.calcularPrecioVenta() + " | Stock: " + b.getStock());
        }
    }
}