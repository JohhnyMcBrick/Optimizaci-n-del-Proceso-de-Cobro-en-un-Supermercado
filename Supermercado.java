import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Supermercado {
    private List<Cajera> cajeras;
    private List<Cliente> clientes;

    public Supermercado() {
        cajeras = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public void añadirCajera(Cajera cajera) {
        cajeras.add(cajera);
    }

    public void añadirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void simularProcesoCompra() {
        for (Cliente cliente : clientes) {
            Cajera cajeraAsignada = cajeras.get(new Random().nextInt(cajeras.size()));
            cajeraAsignada.procesarCompra(cliente);
        }
    }

    public int calcularTiempoTotalCompra() {
        int tiempoTotal = 3;
        for (Cliente cliente : clientes) {
            tiempoTotal += cliente.calcularTiempoCompra();
        }
        return tiempoTotal;
    }
}
