import java.util.Scanner;

public class Gasolinera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalCargas = 0;
        int cargasConDescuento = 0;
        double totalLitros = 0;
        double importeBrutoTotal = 0;
        double totalCobrado = 0;
        String continuar;

        do {
            System.out.println("---Registro de Carga de Combustible---");
            double litros;
            do {
                System.out.println("Ingrese los litros cargados: ");
                litros = scanner.nextDouble();
                if (litros <= 0) {
                    System.out.println("Error: Los litros deben ser mayores que cero.");
                }
            } while (litros <= 0);

            double precio;
            do {
                System.out.println("Ingrese el precio por litro: ");
                precio = scanner.nextDouble();
                if (precio <= 0) {
                    System.out.println("Error: El precio debe ser mayor que cero.");
                }
            } while (precio <= 0);

            double importeBruto = litros * precio;
            double importeFinal = importeBruto;

            if (litros >= 40) {
                double descuento = importeBruto * 0.05;
                importeFinal = importeBruto - descuento;
                cargasConDescuento++;
            }

            System.out.println("Total a pagar: " + importeFinal);

            totalCargas++;
            totalLitros += litros;
            importeBrutoTotal += importeBruto;
            totalCobrado += importeFinal;

            System.out.println("¿Desea registrar otra carga?\n(Si/No): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("Si"));

        System.out.println("---RESUMEN DEL DÍA---");
        System.out.println("Total de cargas registradas: " + totalCargas);
        System.out.println("Cargas que recibieron descuento: " + cargasConDescuento);
        System.out.println("Total de litros vendidos: " + totalLitros);
        System.out.println("Importe total antes de descuentos: " + importeBrutoTotal);
        System.out.println("Total cobrado en el día: " + totalCobrado);
        System.out.println("Importe promedio por carga: " + (totalCobrado / totalCargas));
    }
}