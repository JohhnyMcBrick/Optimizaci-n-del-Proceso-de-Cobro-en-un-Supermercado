import java.util.Random;

public class Cajera {
    private int id;

    public void procesarCompra(Cliente cliente) {
        // Lógica para procesar la compra del cliente
        int tiempoCompra = cliente.calcularTiempoCompra();
        System.out.println("Los resultados obtenidos de la operacion son los siguientes:");
        System.out.println("La cajera  " + "1" + " ha cobrado al cliente " + "1" + " en " + tiempoCompra + " minutos.");
        System.out.println("La cajera  " + "2" + " ha cobrado al cliente " + "2" + " en " + tiempoCompra + " minutos.");
        
    }
}
