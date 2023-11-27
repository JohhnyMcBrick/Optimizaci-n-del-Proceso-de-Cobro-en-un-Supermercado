import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private int id;
    private List<Producto> productosComprados;

    public int getId() {
        return id;
    }

     public Cliente() {
        productosComprados = new ArrayList<>(); // Inicializa la lista en el constructor
    }

    public List<Producto> getProductosComprados() {
        return productosComprados;
    }

    public int calcularTiempoCompra() {
    int tiempoTotal = 3;
    // Lógica para calcular el tiempo total de compra
    return tiempoTotal;
}

public double calcularCostoTotal() {
    double costoTotal = 50.0;
    // Lógica para calcular el costo total de los productos comprados
    return costoTotal;
}
}

