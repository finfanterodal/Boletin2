
package boletin2_5;
import java.util.Scanner;
/**
 *
 * @author finfanterodal
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);    
    float Sueldo, VentasTotales, Quilometraje, DiasDesplazamiento;
    double SueldoTotal,SueldoLiquido;
    System.out.println("Introduzca su sueldo:");
    Sueldo=leer.nextFloat();
    System.out.println("Introduzca sus ventas totales del año:");
    VentasTotales=leer.nextFloat();
    System.out.println("Introduzca el quilometraje total del año:");
    Quilometraje=leer.nextFloat();
    System.out.println("Introduzca los días totales de desplazamiento:");
    DiasDesplazamiento=leer.nextFloat();
    //Calculamos Sueldo Bruto
    SueldoTotal=Sueldo+0.05*VentasTotales+2*Quilometraje+30*DiasDesplazamiento;
    SueldoLiquido=SueldoTotal-(SueldoTotal*0.18)-36;
    System.out.println("\nSueldo Bruto = "+SueldoTotal+" €"+"\nSueldo liquido = "+SueldoLiquido+" €");        
    }
    
}
