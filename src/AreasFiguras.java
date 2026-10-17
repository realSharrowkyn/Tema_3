import java.util.Scanner;
public class AreasFiguras {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese que area desea calcular: \n 1) Cuadrado \n 2) Rectangulo \n 3) Triangulo \n 4) Circulo");
        opcion = scanner.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Ingrese la longitud del lado de su cuadrado: ");
                double Lado = scanner.nextDouble();
                double AreaCuadrado = Lado * Lado;
                System.out.println("Area del cuadrado = " + AreaCuadrado);
                break;
            case 2:
                System.out.println("Ingrese la base de su rectangulo: ");
                double BaseRectangulo = scanner.nextDouble();
                System.out.println("Ingrese la altura: ");
                double AlturaRectangulo = scanner.nextDouble();
                double AreaRectangulo = ((BaseRectangulo * AlturaRectangulo));
                System.out.println("Area del rectangulo: " + AreaRectangulo);
                break;
            case 3:
                System.out.println("Ingrese la base de su triangulo: ");
                double Base = scanner.nextDouble();
                System.out.println("Ingrese la altura: ");
                double Altura = scanner.nextDouble();
                double AreaTriangulo = ((Base * Altura) / 2);
                System.out.println("Area del triangulo: " + AreaTriangulo);
                break;
            case 4:
                System.out.println("Ingrese el radio de su circulo: ");
                double Radio = scanner.nextDouble();
                double AreaCirculo = Math.PI * Math.pow(Radio, 2);
                System.out.println("Area del circulo: " + AreaCirculo);
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
        }
    }
}
