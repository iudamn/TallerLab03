import java.io.IOException;
import java.util.Scanner;

public class Menu {
    Flete f1= new Flete();
    // agregar y quitar productos (add & remove) a un embarque, que permita cambiar el estado del camión,
    // agregar nuevos camiones a la flota y desvincular camiones de la flota.

    // calcular el valor total de un embarque para un camión, en un momento determinado,
    // considerando que por cada producto transportado se cobra $5000 independiente de su tamaño o peso.

    public void menu () throws IOException {
        System.out.println("¿Qué desea hacer?");
        System.out.println("[0] Salir (S/N)");
        System.out.println("[1] Agregar productos a un embarque");
        System.out.println("[2] Quitar productos a un embarque");
        System.out.println("[3] Cambiar estado del camión");
        System.out.println("[4] Agregar nuevos camiones a la flota");
        System.out.println("[5] Desvincular camiones a la flota");
        int opcion = 0;
        opcion = validateInput("012345", -1, 6);
        menuSwitch(opcion);
    }

    public void menuSwitch ( int opcion) throws IOException {
        switch (opcion) {
            case 0:
                exit();
                break;
            case 1:
                f1.agregarPack();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }

    public void exit () {
        String respuesta = getInput("Desea salir del programa? S/N");
        respuesta = respuesta.toLowerCase();
        if (respuesta.contains("s")) {
            System.exit(0);
        } else if (respuesta.contains("n")) {
            System.out.println("");
        }
    }

    public String getInput (String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.next();
    }

    public int validateInput(String validacion,int a, int b){
        while (true) {
            String input = getInput("Seleccione una opción:");
            if (validacion.indexOf(input) >= 0) {
                int option = Integer.parseInt(input);
                if (a < option && option < b) {
                    return option;
                }
            } else {
                System.out.println("Opción inválida");
            }
        }
    }

}