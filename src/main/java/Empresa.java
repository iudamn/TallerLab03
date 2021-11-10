import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private String direccion;
	public ArrayList<Sucursal> _sucursal = new ArrayList<Sucursal>();

	public void agregarSucursal(int codigo, String region) {
		Sucursal sucursal = new Sucursal(codigo,region,this);
		this._sucursal.add(sucursal);
	}
}