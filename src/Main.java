import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroLlamadasLocal = 0;
        int duracionTotalLocal = 0;
        int costoTotalLocal = 0;
        int numeroLlamadasLD = 0;
        int duracionTotalLD = 0;
        int costoTotalLD = 0;
        int numeroLlamadasCelular = 0;
        int duracionTotalCelular = 0;
        int costoTotalCelular = 0;
        int numeroLlamadas = 0;
        int duracionTotal = 0; int costoTotal = 0;
        int opcion;
        int tipoLlamada = 0;
        int duracion = 0;
        int costoMinuto = 0;
        int costoLlamada;
        String ultimaLlamada = "Ninguna";

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Registrar una llamada");
            System.out.println("2. Mostrar información de la línea");
            System.out.println("3. Reiniciar uso de la línea");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Seleccione el tipo de llamada:");
                System.out.println("1. Llamada Local");
                System.out.println("2. Llamada Larga Distancia");
                System.out.println("3. Llamada a Celular");
                System.out.print("Ingrese el tipo de llamada: ");
                tipoLlamada = scanner.nextInt();

                System.out.print("Ingrese la duración en minutos: ");
                duracion = scanner.nextInt();

                if (tipoLlamada == 1) {
                    costoMinuto = 50;
                    ultimaLlamada = "Llamada Local";
                    numeroLlamadasLocal++;
                    duracionTotalLocal += duracion;
                    costoTotalLocal += duracion * costoMinuto;
                } else if (tipoLlamada == 2) {
                    costoMinuto = 350;
                    ultimaLlamada = "Llamada Larga Distancia";
                    numeroLlamadasLD++;
                    duracionTotalLD += duracion;
                    costoTotalLD += duracion * costoMinuto;
                } else if (tipoLlamada == 3) {
                    costoMinuto = 150;
                    ultimaLlamada = "Llamada a Celular";
                    numeroLlamadasCelular++;
                    duracionTotalCelular += duracion;
                    costoTotalCelular += duracion * costoMinuto;
                } else {
                    System.out.println("Tipo de llamada no válido.");
                    continue;
                }

                costoLlamada = duracion * costoMinuto;
                numeroLlamadas++;
                duracionTotal += duracion;
                costoTotal += costoLlamada;

                System.out.println("Llamada registrada con éxito.");
            }
            else if (opcion == 2) {
                System.out.println("\nInformación de la línea telefónica:");
                System.out.println("Llamadas Locales:");
                System.out.println("  - Número de llamadas: " + numeroLlamadasLocal);
                System.out.println("  - Duración total: " + duracionTotalLocal + " minutos");
                System.out.println("  - Costo total: $" + costoTotalLocal + " pesos");

                System.out.println("\nLlamadas Larga Distancia:");
                System.out.println("  - Número de llamadas: " + numeroLlamadasLD);
                System.out.println("  - Duración total: " + duracionTotalLD + " minutos");
                System.out.println("  - Costo total: $" + costoTotalLD + " pesos");

                System.out.println("\nLlamadas a Celular:");
                System.out.println("  - Número de llamadas: " + numeroLlamadasCelular);
                System.out.println("  - Duración total: " + duracionTotalCelular + " minutos");
                System.out.println("  - Costo total: $" + costoTotalCelular + " pesos");

                System.out.println("\nResumen Total:");
                System.out.println("  - Número de llamadas realizadas: " + numeroLlamadas);
                System.out.println("  - Duración total de llamadas: " + duracionTotal + " minutos");
                System.out.println("  - Costo total de llamadas: $" + costoTotal + " pesos");
                System.out.println("  - Última llamada realizada: " + ultimaLlamada);
            }
            else if (opcion == 3) {
                numeroLlamadasLocal = duracionTotalLocal = costoTotalLocal = 0;
                numeroLlamadasLD = duracionTotalLD = costoTotalLD = 0;
                numeroLlamadasCelular = duracionTotalCelular = costoTotalCelular = 0;
                numeroLlamadas = duracionTotal = costoTotal = 0;
                ultimaLlamada = "Ninguna";
                System.out.println("Los datos de la línea han sido reiniciados.");
            }
            else if (opcion == 4) {
                System.out.println("Saliendo de la aplicación...");
            }
            else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
