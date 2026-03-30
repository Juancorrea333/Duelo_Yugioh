public class CartaMonstruo extends Carta {
    private int ataque;
    private int defensa;
    private int nivel;

    public CartaMonstruo(String nombre, int ataque, int defensa, int nivel) {
        super(nombre);
        this.ataque = ataque;
        this.defensa = defensa;
        this.nivel = nivel;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getNivel() {
        return nivel;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return getNombre() + " (ATK: " + ataque + ", DEF: " + defensa + ", LVL: " + nivel + ")";
    }

}