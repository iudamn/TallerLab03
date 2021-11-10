import java.util.ArrayList;

public class Camion {
	private int codigoCamion;
	private int patente;
	private String descripcion;
	private boolean estado;
	public Sucursal _sucursal;
	public ArrayList<Flete> _fletes = new ArrayList<Flete>();

	public Camion(int codigoCamion, int patente, String descripcion, boolean estado, Sucursal sucursal) {
		this.codigoCamion = codigoCamion;
		this.patente = patente;
		this.descripcion = descripcion;
		this.estado = estado;
		this._sucursal=sucursal;
	}

	public void agregarFlete(int codigoFlete, String descripcionflete) {
		Flete flete = new Flete(codigoFlete,descripcionflete);
		this._fletes.add(flete);
	}

	public void cambiarEstado() {
		this.estado = !this.estado;
		System.out.println(isEstado());
	}

	public double calcularValorTotal() {
		double valor = 0;
		for(Flete fletes : this._fletes){
			for(Producto productos : fletes.pack){
				valor = valor+500;
			}
		}
		return valor;
	}

	public boolean isEstado() {
		return estado;
	}
}