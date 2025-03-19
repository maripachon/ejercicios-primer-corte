import java.util.Scanner;

// Clase base Vehiculo
class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void mostrarInfo() {
        System.out.println(marca + " " + modelo + " (" + año + ")");
    }
}

// Subclase Coche
class Coche extends Vehiculo {
    public Coche(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Coche: " + marca + " " + modelo + " (" + año + ") - 4 ruedas");
    }
}

// Subclase Moto
class Moto extends Vehiculo {
    public Moto(String marca, String modelo, int año) {
        super(marca, modelo, año);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Moto: " + marca + " " + modelo + " (" + año + ") - 2 ruedas");
    }
}

// Clase principal
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            System.out.println("\n¿Qué tipo de vehículo deseas registrar? (1. Coche / 2. Moto): ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir salto de línea

            System.out.print("Ingrese la marca: ");
            String marca = scanner.nextLine();

            System.out.print("Ingrese el modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("Ingrese el año: ");
            int año = scanner.nextInt();

            Vehiculo vehiculo;

            if (opcion == 1) {
                vehiculo = new Coche(marca, modelo, año);
            } else {
                vehiculo = new Moto(marca, modelo, año);
            }

            System.out.println("\nInformación del vehículo registrado:");
            vehiculo.mostrarInfo();

            // Preguntar si quiere registrar otro vehículo
            System.out.print("\n¿Deseas registrar otro vehículo? (s/n): ");
            scanner.nextLine(); // Consumir salto de línea
            respuesta = scanner.nextLine();

        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println("\nRegistro finalizado. ¡Gracias!");
        scanner.close();
    }
}
