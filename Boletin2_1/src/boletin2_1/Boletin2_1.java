
package boletin2_1;
import java.util.Scanner;
/**
 *
 * @author finfanterodal
 */
public class Boletin2_1 {

    
    public static void main(String[] args) {
        
Scanner leer = new Scanner(System.in);  
float PrecioTarifa,PrecioPagado,porcentaje;
//Leemos Datos
System.out.println("Introduce el precio de tarifa:");
PrecioTarifa=leer.nextFloat();
System.out.println("Introduce el precio pagado:");
PrecioPagado=leer.nextFloat();
//Calculamos Porcentaje
porcentaje=100-(PrecioPagado*100/PrecioTarifa);
System.out.println("\nPorcentaje descontado = "+porcentaje+"%");






    }
    
}
