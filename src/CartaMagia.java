public abstract class CartaMagia extends Carta implements Activable {

    public CartaMagia(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return getNombre() + " (Carta de Magia)";
    }
    
}
