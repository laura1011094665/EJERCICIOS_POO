package Principal;
import java.util.Scanner;

import Salud.Empleado;
import Salud.Persona;
public class inicio {
    public static void main(String[] args) {   
        double estatura,peso;
        double Total=0,ValorH,Hora;
        String Cargo="", Departamento="";
        String nom, apell, tipoDoc;
        int Numdoc=0;

        Scanner lectura = new Scanner(System.in);
         Persona Luciana = new  Persona();
         Empleado empleado =new Empleado(Cargo,Departamento,Numdoc,Numdoc);
         
        /*System.out.println("Digite el nombre: ");
        nom=lectura.next();
        System.out.println("digite el apellido: ");
        apell=lectura.next();
        System.out.println("digite el tipo de documento: ");
        tipoDoc=lectura.next();
        System.out.println("digite el numero de documento: ");
        Numdoc=lectura.nextInt();*/

        System.out.print("Ingrese su Peso: ");
        peso = lectura.nextDouble();
        System.out.print("Ingrese su Estatura: ");
        estatura = lectura.nextDouble();

        Luciana.pedirDatos();
        Luciana.mostrarPersona();
        Luciana.calcularImc( estatura, peso);
        
        lectura.close();
        
    }
    
}
