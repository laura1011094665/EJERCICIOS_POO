package Figura;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        float base,altura;
        double r,p;
        String answer="Si";
        int queFigura;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Usted quiere clacular el area de una figura?");
        answer=lectura.next();
        
        while (answer.equals("Si")) {

            System.out.println("¿Qué figura desea calcular?,"+"\n1.Triangulo"+"\n2.Rectangulo"+"\n3.Circulo");
            queFigura=lectura .nextInt();

            switch (queFigura) {
                case 1:
                System.out.print("Ingrese el valor de la base del triángulo:");
                base=lectura .nextFloat();
        
                System.out.print("Ingrese el valor de la altura del triángulo:");
                altura=lectura .nextFloat();
        
                Triangulo tri1=new Triangulo(base,altura);
                tri1.calcularArea();
                    break;

                    case 2:
                    System.out.print("Ingrese el valor de la base del rectángulo:");
                    base=lectura.nextFloat();

                    System.out.print("Ingrese el valor de la altura del rectángulo:");
                    altura=lectura .nextFloat();

                    Rectangulo r1=new Rectangulo(base,altura); //This is an objetc
                    r1.calcularArea(); 
                        break;

                        case 3:
                        System.out.print("Ingrese el valor del perímetro del círculo:");
                        r=lectura .nextFloat();

                        System.out.print("Ingrese el valor del radio del círculo:");
                        p=lectura .nextFloat();

                        Circulo cir1=new Circulo(r,p);
                        cir1.calcularArea();
                            break;
            
                default:
                System.out.println("El número ingresado, no está dentro de las opciones");
                    break;
            }

        System.out.println("Quiere realizar más cálculos?");
        answer=lectura.next();

        }System.out.println("Gracias...");
        lectura.close();
    }
}