import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String nombre;
    private int lp;
    private List<Carta> mano;
    private Mazo mazo;
    private Campo campo;
    
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.lp = 8000;
        this.mazo = new Mazo();
        this.mano = new ArrayList<>();
        this.campo = new Campo();
    }
    public String getNombre() {
        return nombre;
    }   
    public int getLp() { return lp; }
    public List<Carta> getMano() { return mano; }
    public Mazo getMazo() { return mazo; }
    public Campo getCampo() { return campo; }

    public void recibirDanio(int danio) {
        this.lp -= danio;
        if (this.lp < 0) this.lp = 0;
    }

    public void robarCarta() {
        Carta carta = mazo.robar();
        if (carta != null) {
            mano.add(carta);
        }
    }

    public void agregarCartaMano(Carta carta) {
        mano.add(carta);
    }

    public boolean estaVivo() {
        return lp > 0;
    }
}
