public class Main {
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();


        // Crear clientes y cajeras
        Cliente cliente1 = new Cliente();
        // ...crear más clientes

        Producto producto1 = new Producto();
        // ...crear más productos

        // Agregar productos a los clientes
        cliente1.getProductosComprados().add(producto1);
        // ...agregar más productos al cliente1

        // ...agregar más productos al cliente2

        // Crear y añadir cajeras al supermercado
        Cajera cajera1 = new Cajera();
        // ...crear más cajeras si es necesario

        supermercado.añadirCajera(cajera1);
        // ...añadir más cajeras al supermercado

        // Añadir clientes al supermercado
        supermercado.añadirCliente(cliente1);
        // ...añadir más clientes al supermercado

        // Simular el proceso de compra
        supermercado.simularProcesoCompra();

        // Calcular tiempo total de compra
        int tiempoTotal = supermercado.calcularTiempoTotalCompra();
        System.out.println("Tiempo total de compra para todos los clientes: " + tiempoTotal + " minutos.");
    }
}




