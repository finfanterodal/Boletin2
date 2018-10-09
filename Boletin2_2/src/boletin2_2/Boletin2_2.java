
package boletin2_2;
import java.util.Scanner;
/**
 *
 * @author finfanterodal
 */
public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
    //Leemos datos
    float celsius, kelvin,fharenheit;
    System.out.println("Introduce la temperatura en Celsius");
    celsius=leer.nextFloat();
    //Calculamos
    fharenheit=(celsius*(9/5))+32;
    kelvin=celsius+273;
    //Visualizamos
    System.out.println("\nGrados Fharenheit= "+fharenheit+"\nGrados kelvin= "+kelvin);             
    }
    
}
