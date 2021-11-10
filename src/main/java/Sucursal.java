import java.util.ArrayList;

public class Sucursal {
	private int codigoSucursal;
	private String region;
	public Empresa _empresa;
	public ArrayList<Camion> _camion = new ArrayList<Camion>();

	public Sucursal(int codigoSucursal, String region, Empresa _empresa) {
		this.codigoSucursal = codigoSucursal;
		this.region = region;
		this._empresa = _empresa;
	}
	public void agregarCamion(int codigoCamion,int patente, String descripcion,
							  boolean estado) {
		Camion camion = new Camion(codigoCamion,patente,descripcion,estado,this);
		this._camion.add(camion);
	}
	public void desvincularCamion(){
		if(this._camion.size() > 0) {
			this._camion.remove(this._camion.get(0));
		}
	}
}