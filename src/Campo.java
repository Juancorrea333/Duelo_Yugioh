import java.util.ArrayList;
import java.util.List;

public class Campo {
    private List<CartaMonstruo> monstruos;

    public Campo() {
        this.monstruos = new ArrayList<>();
    }

    public void agregarMonstruo(CartaMonstruo monstruo) {
        monstruos.add(monstruo);
    }

    public void removerMonstruo(CartaMonstruo monstruo) {
        monstruos.remove(monstruo);
    }

    public List<CartaMonstruo> getMonstruos() {
        return monstruos;
    }

    public boolean estaVacio() {
        return monstruos.isEmpty();
    }
}