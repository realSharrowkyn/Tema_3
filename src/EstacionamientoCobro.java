import java.util.Scanner;

public class EstacionamientoCobro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MOTOCICLETA = 15;
        final int AUTOMOVIL = 20;
        final int CAMIONETA = 30;
        int opcion;

        int totalVehiculos = 0;
        int contadorMotos = 0;
        int contadorAutos = 0;
        int contadorCamionetas = 0;
        double dineroRecaudado = 0;

        System.out.println("--Bienvenido al estacionamiento--");
        do {
            System.out.println("Tipo de vehiculo por hora:");
            System.out.println("1): Motocicleta      $15");
            System.out.println("2): Automovil        $20");
            System.out.println("3): Camioneta        $30");
            System.out.println("4): Resumen del dia");
            System.out.println("5): Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese su tiempo de estancia en horas:");
                    double tiempoMoto = scanner.nextDouble();
                    double totalMoto = tiempoMoto * MOTOCICLETA;

                    contadorMotos++;
                    totalVehiculos++;
                    dineroRecaudado += totalMoto;

                    System.out.println("Tipo de vehiculo: Motocicleta");
                    System.out.println("Horas: " + tiempoMoto);
                    System.out.println("Total a pagar: $" + totalMoto);
                    break;

                case 2:
                    System.out.println("Ingrese su tiempo de estancia en horas:");
                    double tiempoAuto = scanner.nextDouble();
                    double totalAuto = tiempoAuto * AUTOMOVIL;

                    contadorAutos++;
                    totalVehiculos++;
                    dineroRecaudado += totalAuto;

                    System.out.println("Tipo de vehiculo: Automovil");
                    System.out.println("Horas: " + tiempoAuto);
                    System.out.println("Total a pagar: $" + totalAuto);
                    break;

                case 3:
                    System.out.println("Ingrese su tiempo de estancia en horas:");
                    double tiempoCamioneta = scanner.nextDouble();
                    double totalCamioneta = tiempoCamioneta * CAMIONETA;

                    contadorCamionetas++;
                    totalVehiculos++;
                    dineroRecaudado += totalCamioneta;

                    System.out.println("Tipo de vehiculo: Camioneta");
                    System.out.println("Horas: " + tiempoCamioneta);
                    System.out.println("Total a pagar: $" + totalCamioneta);
                    break;

                case 4:
                    System.out.println("========= RESUMEN DEL DIA =========");
                    System.out.println("Vehiculos atendidos: " + totalVehiculos);
                    System.out.println("Motocicletas: " + contadorMotos);
                    System.out.println("Automoviles: " + contadorAutos);
                    System.out.println("Camionetas: " + contadorCamionetas);
                    System.out.println("Total recaudado: $" + dineroRecaudado);
                    break;

                case 5:
                    System.out.println("¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opcion no valida, por favor seleccione una opcion de la 1 a la 5");
                    break;
            }
        } while (opcion != 5);
    }
}
