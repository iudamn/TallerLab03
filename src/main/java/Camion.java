import java.util.ArrayList;

public class Camion {
	private int codigoCamion;
	private int patente;
	private String descripcion;
	private boolean estado;
	public Sucursal _sucursal;
	public ArrayList<Flete> _fletes = new ArrayList<Flete>();

	public Camion(int codigoCamion, int patente, String descripcion, boolean estado, Sucursal _sucursal, ArrayList<Flete> _fletes) {
		this.codigoCamion = codigoCamion;
		this.patente = patente;
		this.descripcion = descripcion;
		this.estado = estado;
		this._sucursal = _sucursal;
		this._fletes = _fletes;
	}

	public void cambiarEstado() {
		throw new UnsupportedOperationException();
	}

	public void calcularValorTotal() {
		throw new UnsupportedOperationException();
	}
}