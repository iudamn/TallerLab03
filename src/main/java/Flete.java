import java.util.ArrayList;

public class Flete {
	private int codigoFlete;
	private String descripcionFlete;
	public ArrayList<Producto> pack = new ArrayList<Producto>();

	public void agregarPack() {
		if (this.pack.size() < 5) {
			Producto producto = new Producto();
			this.pack.add(producto);
		}
	}

	public void quitarPack() {
		if (this.pack.size() > 1) {
			this.pack.remove(this.pack.get(0));
		}
	}
}