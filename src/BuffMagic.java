public class BuffMagic extends CartaMagia {

    public BuffMagic() {
        super("Terraforming");
    }

    @Override
    public void activar(Jugador activo, Jugador oponente) {
        if (activo.getCampo().estaVacio()) {
            System.out.println("No tienes monstruos en el campo para aplicar el buff.");
            return;
        }

        System.out.println("¿A que monstruo deseas aplicar +500 ATK?");
        for (int i = 0; i < activo.getCampo().getMonstruos().size(); i++) {
            System.out.println((i + 1) + ". " + activo.getCampo().getMonstruos().get(i));
        }

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int opcion = sc.nextInt() - 1;

        if (opcion < 0 || opcion >= activo.getCampo().getMonstruos().size()) {
            System.out.println("Opcion invalida.");
            return;
        }

        CartaMonstruo monstruo = activo.getCampo().getMonstruos().get(opcion);
        monstruo.setAtaque(monstruo.getAtaque() + 500);
        System.out.println(monstruo.getNombre() + " ahora tiene " + monstruo.getAtaque() + " ATK!");
    
    }

    @Override
    public String toString() {
        return "[MAGIA] Terraforming - +500 ATK a un monstruo";
    }

}
