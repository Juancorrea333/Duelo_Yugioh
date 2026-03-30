import java.util.Random;

public class Duelo {

    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugadorActivo;
    private Jugador jugadorOponente;
    private Random random;

    public Duelo(String nombrej1, String nombrej2) {
        this.jugador1 = new Jugador(nombrej1);
        this.jugador2 = new Jugador(nombrej2);
        this.random = new Random();
    }

    public void iniciar() {
        System.out.println("*****DUELO DE YU-GI-OH!*****");
        System.out.println(jugador1.getNombre() + " vs " + jugador2.getNombre());
        prepararMazo();
        repartirCartasIniciales();
        decidirQuienEmpieza();
    }

    private void prepararMazo() {
        Mazo mazoCompleto = new Mazo();

        // 30 monstruos
        mazoCompleto.agregarCarta(new CartaMonstruo("Mago Oscuro", 2500, 2100, 7));
        mazoCompleto.agregarCarta(new CartaMonstruo("Dragón Blanco", 3000, 2500, 8));
        mazoCompleto.agregarCarta(new CartaMonstruo("Soldado de Fuego", 1800, 1200, 4));
        mazoCompleto.agregarCarta(new CartaMonstruo("Elfo Guardián", 1400, 1700, 4));
        mazoCompleto.agregarCarta(new CartaMonstruo("Guerrero de Roca", 1200, 2000, 3));
        mazoCompleto.agregarCarta(new CartaMonstruo("Dragón de Llamas", 2200, 1800, 6));
        mazoCompleto.agregarCarta(new CartaMonstruo("Arquero Veloz", 1600, 1000, 4));
        mazoCompleto.agregarCarta(new CartaMonstruo("Titán de Hielo", 2400, 2000, 7));
        mazoCompleto.agregarCarta(new CartaMonstruo("Gnomo Explosivo", 900, 600, 2));
        mazoCompleto.agregarCarta(new CartaMonstruo("Serpiente Antigua", 1900, 1500, 5));
        mazoCompleto.agregarCarta(new CartaMonstruo("Caballero Negro", 2100, 1800, 6));
        mazoCompleto.agregarCarta(new CartaMonstruo("Hada Luminosa", 1300, 1400, 3));
        mazoCompleto.agregarCarta(new CartaMonstruo("Golem de Piedra", 1000, 2200, 4));
        mazoCompleto.agregarCarta(new CartaMonstruo("Ninja Sombra", 1700, 1100, 4));
        mazoCompleto.agregarCarta(new CartaMonstruo("Dragón del Trueno", 2600, 2100, 8));
        mazoCompleto.agregarCarta(new CartaMonstruo("Monstruo del Pantano", 1100, 1300, 3));
        mazoCompleto.agregarCarta(new CartaMonstruo("Fenix Renacido", 2300, 1600, 6));
        mazoCompleto.agregarCarta(new CartaMonstruo("Lobo Feroz", 1500, 1200, 4));
        mazoCompleto.agregarCarta(new CartaMonstruo("Angel Caido", 2000, 1700, 5));
        mazoCompleto.agregarCarta(new CartaMonstruo("Enano Minero", 800, 900, 2));
        mazoCompleto.agregarCarta(new CartaMonstruo("Basilisco", 1800, 1600, 5));
        mazoCompleto.agregarCarta(new CartaMonstruo("Centauro Guerrero", 1900, 1400, 5));
        mazoCompleto.agregarCarta(new CartaMonstruo("Elemental de Agua", 1600, 1800, 4));
        mazoCompleto.agregarCarta(new CartaMonstruo("Dragón de Sombra", 2700, 2200, 8));
        mazoCompleto.agregarCarta(new CartaMonstruo("Muñeco Maldito", 1000, 800, 2));
        mazoCompleto.agregarCarta(new CartaMonstruo("Samurái Eterno", 2100, 1900, 6));
        mazoCompleto.agregarCarta(new CartaMonstruo("Troll del Bosque", 1300, 1600, 3));
        mazoCompleto.agregarCarta(new CartaMonstruo("Grifo Alado", 2000, 1500, 5));
        mazoCompleto.agregarCarta(new CartaMonstruo("Espectro Marino", 1700, 1400, 4));
        mazoCompleto.agregarCarta(new CartaMonstruo("Coloso de Metal", 2400, 2300, 7));

        // 10 magias
        for (int i = 0; i < 5; i++) {
            mazoCompleto.agregarCarta(new PotOfGreed());
            mazoCompleto.agregarCarta(new BuffMagic());
        }

        // mezclar y repartir
        mazoCompleto.mezclar();

        for (int i = 0; i < 20; i++) {
            Carta carta = mazoCompleto.robar();
            if (carta != null) {
                jugador1.getMazo().agregarCarta(carta);
            }
        }
        for (int i = 0; i < 20; i++) {
            Carta carta = mazoCompleto.robar();
            if (carta != null) {
                jugador2.getMazo().agregarCarta(carta);
            }
        }
    }

    private void repartirCartasIniciales() {
        for (int i = 0; i < 5; i++) {
            jugador1.robarCarta();
            jugador2.robarCarta();
        }
        System.out.println("\nCartas repartidas!");
        System.out.println(jugador1.getNombre() + " tiene " + jugador1.getMano().size() + " cartas.");
        System.out.println(jugador2.getNombre() + " tiene " + jugador2.getMano().size() + " cartas.");
    }

    private void decidirQuienEmpieza() {
        if (random.nextInt(2) == 0) {
            jugadorActivo = jugador1;
            jugadorOponente = jugador2;
        } else {
            jugadorActivo = jugador2;
            jugadorOponente = jugador1;
        }
        System.out.println("\n" + jugadorActivo.getNombre() + " empieza el duelo!");
    }
}