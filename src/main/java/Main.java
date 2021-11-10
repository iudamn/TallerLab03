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
        //al flete se le agregaron 2 packs de productos
        empresa1._sucursal.get(0)._camion.get(0)._fletes.get(0).agregarPack();
        empresa1._sucursal.get(0)._camion.get(0)._fletes.get(0).agregarPack();
        //sout con el valor total tras haber agregado el pack
        System.out.println(empresa1._sucursal.get(0)._camion.get(0).calcularValorTotal());
        empresa1._sucursal.get(0)._camion.get(0).cambiarEstado();
        //se quitó el pack agregado
        empresa1._sucursal.get(0)._camion.get(0)._fletes.get(0).quitarPack();
        //se comprobo que el precio cambió
        System.out.println(empresa1._sucursal.get(0)._camion.get(0).calcularValorTotal());
        //se desvinculó el camion de la sucursal
        empresa1._sucursal.get(0).desvincularCamion();

        Menu menu1= new Menu();
        Flete flete1= new Flete();
        menu1.menu();
    }
}
