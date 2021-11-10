import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //se creó una empresa para facilitar la revision del codigo
        Empresa empresa1 = new Empresa("nombre","direccion");
        //se le agregó una sucursal
        empresa1.agregarSucursal(123,"araucania");
        //a la sucursal agregada se le agregó un camión
        empresa1._sucursal.get(0).agregarCamion(123,123,"descripcioncamion",false);
        //al camión se le agrego un flete
        empresa1._sucursal.get(0)._camion.get(0).agregarFlete(123,"descripcionflete");
        //al flete se le agrego un pack
        empresa1._sucursal.get(0)._camion.get(0)._fletes.get(0).agregarPack();
        System.out.println(empresa1._sucursal.get(0)._camion.get(0).calcularValorTotal());
        empresa1._sucursal.get(0)._camion.get(0).cambiarEstado();
        Menu menu1= new Menu();
        Flete flete1= new Flete();
        menu1.menu();
    }
}
