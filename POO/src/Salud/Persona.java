package Salud;

import java.util.Scanner;

public class Persona {

    private int edad;
    private int Documento;
    private String TipoDoc;
    private String sexo;
    private String nom;
    private String apellido;
    private double peso;
    private double estatura;

    public Persona(){
        
    }

    public void pedirDatos() {

        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingrese el Tipo de Documento: ");
        TipoDoc = lectura.next();
        System.out.print("Ingrese el Numero de Documento: ");
        Documento = lectura.nextInt();
        System.out.print("Ingrese su Nombre: ");
        nom = lectura.next();
        System.out.print("Ingrese su Apellido: ");
        apellido = lectura.next();
        System.out.print("Ingrese su Edad: ");
        edad = lectura.nextInt();
        System.out.print("Ingrese su Sexo: ");
        sexo = lectura.next();

        lectura.close();
    }

    public void mostrarPersona() {
        System.out.println("Tipo de Documento: " + TipoDoc);
        System.out.println("Documento: " + Documento);
        System.out.println("Nombre: " + nom);
        System.out.println("Apellido: " + apellido);
        System.out.println("Peso: " + peso);
        System.out.println("Estatura: " + estatura);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
    }

    /*
     * public void calcularImc() {
     * double pesoAc;
     * pesoAc=(peso*2)/(estatura*2);
     * System.out.println("Tu peso actual es de: " +pesoAc);
     * if (pesoAc<20){
     * System.out.println("Usted esta desnutrido");
     * }else if(pesoAc>25){
     * System.out.println("Usted esta en sobre peso");
     * }else if (pesoAc<20 && pesoAc>25){
     * System.out.println("Usted esta bien de peso");
     * }
     * }
     */
    public double calcularImc(double peso, double estatura){
        double imc;
        imc=peso/(estatura*estatura);
        System.out.println("El peso que tiene actualmente es: "+imc);
        
        if (imc<20){
        System.out.println("El peso es ta muy bajito");
        }else if  (imc>20 || imc<25 ){
            System.out.println("Usted esta bien de peso ");
        }else if (imc>25){
            System.out.println("Usted esta tiene mucho peso");
        }
        
        return imc;
}
}

