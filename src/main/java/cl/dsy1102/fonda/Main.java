package cl.dsy1102.fonda;

public class Main {
    public static void main(String[] args) {
        BebidaSinAlcohol bebida1 = new BebidaSinAlcohol("Jugo Natural", 0.5, 50, 2000);
        BebidaSinAlcohol bebida2 = new BebidaSinAlcohol("Mote con Huesillo", 0.3, 40, 1500);
        BebidaAlcholica bebida3 = new BebidaAlcholica("Terremoto", 1.0, 30, 3000, 3);
        BebidaAlcholica bebida4 = new BebidaAlcholica("Chicha", 1.5, 20, 2500, 2);

        // TODO 2: marcar la bebida alcoholica 'Chicha' con la venta restringida.
        bebida4.setVentaRestringida(true);

        // TODO 3: registrar todas en el gestor.
        GestorFonda gestor = new GestorFonda();
        gestor.agregarBebida(bebida1);
        gestor.agregarBebida(bebida2);
        gestor.agregarBebida(bebida3);
        gestor.agregarBebida(bebida4);

        // TODO 4: solicitar las cuatro ventas indicadas en el enunciado.
        System.out.println("\n--- PROCESANDO VENTAS ---");
        gestor.venderBebida(bebida1, 5); // Vende Jugo
        gestor.venderBebida(bebida2, 3); // Vende Mote
        gestor.venderBebida(bebida3, 2); // Vende Terremoto
        gestor.venderBebida(bebida4, 1); // Intenta vender Chicha (marcará error por restricción)

        // TODO 5: buscar por nombre "Chicha" y listar todas las bebidas.
        gestor.buscarPorNombre("Chicha");
        gestor.listarBebidas();

        System.out.println("\nProyecto listo. Comienza por la clase Bebida.");

    }
}
