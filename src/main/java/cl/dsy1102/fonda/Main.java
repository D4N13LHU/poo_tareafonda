package cl.dsy1102.fonda;

/**
 * Punto de entrada de la Tarea Fiestas Patrias - Fonda San Belarmino.
 *
 * Revisa el enunciado en README.md. Debes crear, en este mismo paquete,
 * las clases del diagrama: Bebida, BebidaAlcoholica, BebidaSinAlcohol,
 * la interfaz ConsumoResponsable y la clase GestorFonda.
 */
public class Main {

    public static void main(String[] args) {
        BebidaSinAlcohol bebida1 = new BebidaSinAlcohol("Jugo Natural", 0.5, 50, 2000);
        BebidaSinAlcohol bebida2 = new BebidaSinAlcohol("Mote con Huesillo", 0.3, 40, 1500);
        BebidaAlcholica bebida3 = new BebidaAlcholica("Terremoto", 1.0, 30, 3000, 3);
        BebidaAlcholica bebida4 = new BebidaAlcholica("Chicha", 1.5, 20, 2500, 2);

        // TODO 2: marcar la bebida alcoholica 'Chicha' con la venta restringida.
        // TODO 3: registrarlas todas en el gestor.
        // TODO 4: solicitar las cuatro ventas indicadas en el enunciado
        // TODO 5: buscar por nombre "Chicha" y listar todas las bebidas.

        System.out.println("Proyecto listo. Comienza por la clase Bebida.");
    }
}
