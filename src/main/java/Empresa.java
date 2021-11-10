import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private String direccion;
	public ArrayList<Sucursal> _sucursal = new ArrayList<Sucursal>();

	public Empresa(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public void agregarSucursal(int codigo, String region) {
		Sucursal sucursal = new Sucursal(codigo,region,this);
		this._sucursal.add(sucursal);
	}
}