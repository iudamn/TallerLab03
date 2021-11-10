import java.util.ArrayList;

public class Sucursal {
	private int codigoSucursal;
	private String region;
	public Empresa _empresa;
	public ArrayList<Camion> _camion = new ArrayList<Camion>();

	public Sucursal(int codigoSucursal, String region, Empresa _empresa, ArrayList<Camion> _camion) {
		this.codigoSucursal = codigoSucursal;
		this.region = region;
		this._empresa = _empresa;
		this._camion = _camion;
	}
	public void agregarCamion(int codigoCamion,int patente, String descripcion,
							  boolean estado,Sucursal sucursal, ArrayList<Flete> fletes) {
		Camion camion = new Camion(codigoCamion,patente,descripcion,estado,sucursal,fletes);
		this._camion.add(camion);
	}
}