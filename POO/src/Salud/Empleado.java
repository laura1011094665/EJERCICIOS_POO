package Salud;
import java.util.Scanner;
public class Empleado extends Persona {
    private String Cargo, Departamento;
    private int Horas, ValorH;

    public Empleado(String cargo, String departamento, int horas, int valorhora) {
        this.Cargo = Cargo;
        this.Departamento = Departamento;
        this.Horas = Horas;
        this.ValorH = ValorH;
    }
    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String cargo) {
        this.Cargo = Cargo;
    }
    public String getDepartamento() {
        return Departamento;
    }
    public void setDepartamento(String departamento) {
        this.Departamento = Departamento;
    }
    public int getHoras() {
        return Horas;
    }
    public void setHoras(int horas) {
        this.Horas = Horas;
    }
    public int getValorhora() {
        return ValorH;
    }
    public void setValorhora(int valorhora) {
        this.ValorH = ValorH;
    }

    public void dataEmpleado(){
        Scanner lectura=new Scanner(System.in);
        System.out.println("Cual es el cargo del empleado: ");
        Cargo=lectura.next();
        System.out.println("Cual es el departamento del empleado: ");
        Departamento=lectura.next();
        System.out.println("Cuales son las horas trabajadas: ");
        Horas=lectura.nextInt();
        System.out.println("Cuanto gana por Hora: ");
        ValorH=lectura.nextInt();
        lectura.close();
    }

    public void calcularHonorarios() {
        double reteica;
        double Total=0;
        Total=ValorH*Horas;
        reteica=(0.966*Total);
        Total=(Total-reteica);
        System.out.println("Los Honorarios del Empleado son: "+Total);
    }
}
