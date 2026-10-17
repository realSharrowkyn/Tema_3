import java.util.Scanner;

public class CentroMedico {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int EdadPaciente;
        double CostoConsulta;
        int totalPacientes = 0;
        int contadorNiños = 0;
        int contadorAdolescentes = 0;
        int contadorAdultos = 0;
        int contadorAdultomayor = 0;
        double DescuentosAplicados = 0;
        double dineroRecaudado = 0;
        String continuar;

        do {
            System.out.println("--- Bienvenido a su centro medico ---");
            System.out.println("Ingrese su edad en años: ");
            EdadPaciente = scanner.nextInt();
            System.out.println("Ingrese el costo de su consulta: ");
            CostoConsulta = scanner.nextDouble();

            double totalAPagar = CostoConsulta;

            if (EdadPaciente >= 60) {
                contadorAdultomayor++;
                double descuento = CostoConsulta * 0.15;
                totalAPagar = CostoConsulta - descuento;
                DescuentosAplicados += descuento;
            } else if (EdadPaciente >= 18) {
                contadorAdultos++;
            } else if (EdadPaciente >= 12) {
                contadorAdolescentes++;
            } else {
                contadorNiños++;
            }

            dineroRecaudado += totalAPagar;
            totalPacientes++;

            System.out.println("¿Registrar otro paciente? \nIngrese Si para continuar y No para salir");
            continuar = scanner.next();
        } while(continuar.equalsIgnoreCase("Si"));

        System.out.println("---RESUMEN DEL DIA---");
        System.out.println("Total de niños: " + contadorNiños);
        System.out.println("Total adolescentes: " + contadorAdolescentes);
        System.out.println("Total adultos: " + contadorAdultos);
        System.out.println("Total adultos mayores: " + contadorAdultomayor);
        System.out.println("Total por descuentos aplicados: $" + DescuentosAplicados);
        System.out.println("Total recaudado: $" + dineroRecaudado);

        if (totalPacientes > 0) {
            System.out.println("Promedio por paciente: " + (dineroRecaudado / totalPacientes));
        } else {
            System.out.println("No se registraron pacientes.");
        }
    }
}
