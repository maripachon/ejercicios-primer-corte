import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre;
        String telefono;
        // Datos del cliente
        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese su teléfono: ");
        telefono = scanner.nextLine();

        // Precios de los productos
        final double PRECIO_MOUSE = 85000;
        final double PRECIO_TECLADO = 230000;
        final double PRECIO_MONITOR = 940000;
        final double PRECIO_DISCO_DURO = 220000;
        final double PRECIO_USB = 60000;
        final double IVA = 0.16;

        int Mouse = 0, Teclado = 0, Monitor = 0, DiscoDuro = 0, USB = 0;
        boolean continuarComprando = true;

        while (continuarComprando) {
            System.out.println("\nSeleccione el producto a comprar:");
            System.out.println("1. Mouse");
            System.out.println("2. Teclado");
            System.out.println("3. Monitor");
            System.out.println("4. Disco Duro");
            System.out.println("5. USB");
            System.out.println("6. Finalizar compra");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();
            int cantidad;

            if (opcion == 6) {
                continuarComprando = false;
                break;
            }

            System.out.print("Ingrese la cantidad: ");
            cantidad = scanner.nextInt();

            switch (opcion) {
                case 1: Mouse += cantidad;
                    break;
                case 2: Teclado += cantidad;
                    break;
                case 3: Monitor += cantidad;
                    break;
                case 4: DiscoDuro += cantidad;
                    break;
                case 5: USB += cantidad;
                    break;
                default: System.out.println("Opción no válida");
            }
        }

        // Calcular valores
        double totalMouse = Mouse * PRECIO_MOUSE;
        double totalTeclado = Teclado * PRECIO_TECLADO;
        double totalMonitor = Monitor * PRECIO_MONITOR;
        double totalDiscoDuro = DiscoDuro * PRECIO_DISCO_DURO;
        double totalUSB = USB * PRECIO_USB;
        double totalSinIVA = totalMouse + totalTeclado + totalMonitor + totalDiscoDuro + totalUSB;
        double ivaCalculado = totalSinIVA * IVA;
        double totalConIVA = totalSinIVA + ivaCalculado;

        // Mostrar factura
        // Mostrar factura
        System.out.println("\n---------------------------");
        System.out.println("      FACTURA DE VENTA      ");
        System.out.println("---------------------------");
        System.out.println("Cliente: " + nombre);
        System.out.println("Teléfono: " + telefono);
        System.out.println("---------------------------");
        System.out.printf("%-15s %-10s %-15s %-15s\n", "Producto", "Cantidad", "Valor Unitario", "Total");
        if (Mouse > 0)
            System.out.printf("%-15s %-10d %-15.2f %-15.2f\n", "Mouse", Mouse, PRECIO_MOUSE, totalMouse);
        if (Teclado > 0)
            System.out.printf("%-15s %-10d %-15.2f %-15.2f\n", "Teclado", Teclado, PRECIO_TECLADO, totalTeclado);
        if (Monitor > 0)
            System.out.printf("%-15s %-10d %-15.2f %-15.2f\n", "Monitor", Monitor, PRECIO_MONITOR, totalMonitor);
        if (DiscoDuro > 0)
            System.out.printf("%-15s %-10d %-15.2f %-15.2f\n", "Disco Duro", DiscoDuro, PRECIO_DISCO_DURO, totalDiscoDuro);
        if (USB > 0)
            System.out.printf("%-15s %-10d %-15.2f %-15.2f\n", "USB", USB, PRECIO_USB, totalUSB);
        System.out.println("---------------------------");
        System.out.printf("%-30s %-15.2f\n", "Total sin IVA:", totalSinIVA);
        System.out.printf("%-30s %-15.2f\n", "IVA (16%):", ivaCalculado);
        System.out.printf("%-30s %-15.2f\n", "Total con IVA:", totalConIVA);
    }
}
