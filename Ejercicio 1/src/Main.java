import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehiculo vehiculo = null;


        while (vehiculo == null) {
            System.out.print("¿Qué vehículo desea conducir? (auto/moto): ");
            String tipoVehiculo = scanner.nextLine().toLowerCase();


            System.out.print("Ingrese la cantidad inicial de galones de gasolina: ");
            int gasolinaInicial = scanner.nextInt();

            
            switch (tipoVehiculo) {
                case "auto":
                    vehiculo = new Auto(gasolinaInicial);
                    break;
                case "moto":
                    vehiculo = new Moto(gasolinaInicial);
                    break;
                default:
                    System.out.println("Tipo de vehículo no válido. Por favor, elija 'auto' o 'moto'.");
            }
        }

        
        vehiculo.Conducir();

        
        System.out.print("¿Desea retanquear? (si/no): ");
        scanner.nextLine(); 
        String respuesta = scanner.nextLine().toLowerCase();

        if (respuesta.equals("si")) {
            System.out.print("Ingrese la cantidad de galones a tanquear: ");
            int cantidadGasolina = scanner.nextInt();
            vehiculo.Retanquear(cantidadGasolina);
            
            vehiculo.Conducir();
        }

        if (respuesta.equals("no")) {

            vehiculo.Conducir();
        }

        scanner.close();
    }
}
