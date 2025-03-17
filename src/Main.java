import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double temperatura, resultado;


        do {
            mostrarMenu();
            opcion = leerEntero(scanner, "Seleccione una opción (1-16): ", 1, 16);

            if (opcion == 16) {
                System.out.println("Saliendo del programa...");
                break;
            }

            temperatura = leerDouble(scanner, "Ingrese la temperatura a convertir: ");
            resultado = convertirTemperatura(opcion, temperatura);

            System.out.println("Resultado de la conversión: " + resultado);
            System.out.println();

        } while (true);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("\nConversor de Temperatura");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Celsius a Kelvin");
        System.out.println("3. Celsius a Rankine");
        System.out.println("4. Celsius a Réaumur");
        System.out.println("5. Fahrenheit a Celsius");
        System.out.println("6. Fahrenheit a Kelvin");
        System.out.println("7. Fahrenheit a Rankine");
        System.out.println("8. Fahrenheit a Réaumur");
        System.out.println("9. Kelvin a Celsius");
        System.out.println("10. Kelvin a Fahrenheit");
        System.out.println("11. Kelvin a Rankine");
        System.out.println("12. Kelvin a Réaumur");
        System.out.println("13. Rankine a Celsius");
        System.out.println("14. Rankine a Fahrenheit");
        System.out.println("15. Rankine a Kelvin");
        System.out.println("16. Salir");
    }

    public static int leerEntero(Scanner scanner, String mensaje, int min, int max) {
        int valor;
        while (true) {
            try {
                System.out.print(mensaje);
                valor = scanner.nextInt();
                if (valor >= min && valor <= max) {
                    return valor;
                } else {
                    System.out.println("Error: Ingrese un número entre " + min + " y " + max);
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Ingrese un número entero.");
                scanner.next(); // Limpiar buffer de entrada
            }
        }
    }

    public static double leerDouble(Scanner scanner, String mensaje) {
        double valor;
        while (true) {
            try {
                System.out.print(mensaje);
                valor = scanner.nextDouble();
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada inválida. Ingrese un número válido.");
                scanner.next();
            }
        }
    }

    public static double convertirTemperatura(int opcion, double temperatura) {
        switch (opcion) {
            case 1: return (temperatura * 9/5) + 32; // Celsius a Fahrenheit
            case 2: return temperatura + 273.15; // Celsius a Kelvin
            case 3: return (temperatura + 273.15) * 9/5; // Celsius a Rankine
            case 4: return temperatura * 4/5; // Celsius a Réaumur
            case 5: return (temperatura - 32) * 5/9; // Fahrenheit a Celsius
            case 6: return (temperatura - 32) * 5/9 + 273.15; // Fahrenheit a Kelvin
            case 7: return temperatura + 459.67; // Fahrenheit a Rankine
            case 8: return (temperatura - 32) * 4/9; // Fahrenheit a Réaumur
            case 9: return temperatura - 273.15; // Kelvin a Celsius
            case 10: return (temperatura - 273.15) * 9/5 + 32; // Kelvin a Fahrenheit
            case 11: return temperatura * 9/5; // Kelvin a Rankine
            case 12: return (temperatura - 273.15) * 4/5; // Kelvin a Réaumur
            case 13: return (temperatura - 491.67) * 5/9; // Rankine a Celsius
            case 14: return temperatura - 459.67; // Rankine a Fahrenheit
            case 15: return temperatura * 5/9; // Rankine a Kelvin
            default: return 0;
        }
    }
}
