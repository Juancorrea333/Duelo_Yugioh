import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mazo {
    private List<Carta> cartas;
    private Random random;
    

    public Mazo() {
        this.cartas = new ArrayList<>();
        this.random = new Random();
    }

    public void agregarCarta(Carta carta) {
        cartas.add(carta);
    }

    public void mezclar() {
        for (int i = cartas.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Carta temp = cartas.get(i);
            cartas.set(i, cartas.get(j));
            cartas.set(j, temp);
        }
    }

    public Carta robar() {
        if (cartas.isEmpty()) {
            return null;
        }
        return cartas.remove(0);
    }

    public boolean estaVacio() {
        return cartas.isEmpty();
    }

    public int size() {
        return cartas.size();
    }
}