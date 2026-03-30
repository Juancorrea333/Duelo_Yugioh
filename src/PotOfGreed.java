public class PotOfGreed extends CartaMagia{

    public PotOfGreed() {
        super("Pot of Greed");
    }

    @Override
    public void activar(Jugador activo, Jugador oponente) {
        System.out.println("Pot of Greed activado! Robas 2 cartas.");
        activo.robarCarta();
        activo.robarCarta();
    }

    @Override
    public String toString() {
        return "[MAGIA] Pot of Greed - Roba 2 cartas";
    }
}
