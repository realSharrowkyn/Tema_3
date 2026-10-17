import java.util.Scanner;

public class SumaDeNumeros {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int acumulador = 0;
        int contador = 0;
        int x = 0;
        int respuesta = 0;
        do {
            System.out.println("Ingrese un numero para sumar:");
            x = scanner.nextInt();
            acumulador = acumulador + x;
            contador++; // Es igual a poner contador = contador + 1;
            System.out.println("Desea ingresar otro numero? \n 1) Si \n 2) No");
            respuesta = scanner.nextInt();
        }while (respuesta == 1);
        System.out.println("Respuesta = " + acumulador);
        System.out.println("Se sumaron  = " + contador + " numeros");

    }
}
