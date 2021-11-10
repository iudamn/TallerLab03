import java.util.ArrayList;

public class Camion {
	private int codigoCamion;
	private int patente;
	private String descripcion;
	private boolean estado;
	public Sucursal _sucursal;
	public ArrayList<Flete> _fletes = new ArrayList<Flete>();

	public void cambiarEstado() {
		throw new UnsupportedOperationException();
	}

	public void calcularValorTotal() {
		throw new UnsupportedOperationException();
	}
}