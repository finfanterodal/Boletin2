
package boletin2_3;
import java.util.Scanner;
/**
 *
 * @author finfanterodal
 */
public class Boletin2_3 {

   
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
byte bcien,bveinte,bcinco,muno;
int cdinero;
//Leemos datos
System.out.println("Introduce la cantidad de billetes de cien");
    bcien=leer.nextByte();
System.out.println("Introduce la cantidad de billetes de veinte");
    bveinte=leer.nextByte();
System.out.println("Introduce la cantidad de billetes de cinco");
    bcinco=leer.nextByte();
System.out.println("Introduce la cantidad de billetes de cinco");
    muno=leer.nextByte();
//Calculamos
cdinero=100*bcien+20*bveinte+5*bcinco+1*muno;
//Visualizamos
System.out.println("\nLa cantidad total de dinero es = "+cdinero);
;
    



    }
    
}
