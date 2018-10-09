
package boletin2_4;
import java.util.Scanner;
/**
 *
 * @author finfanterodal
 */
public class Boletin2_4 {

 
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
int bcien=0,bveinte=0,bcinco=0,muno=0,cdinero;
//Leemos la cantidad de dinero
System.out.println("Introduce la cantidad total de dinero");
    cdinero=leer.nextInt();
//Bucles para contar billetes.

while(cdinero>=100){
cdinero=cdinero-100;
bcien=bcien+1;
}

while(cdinero>=20){
cdinero=cdinero-20;
bveinte=bveinte+1;
}

while(cdinero>=5){
cdinero=cdinero-5;
bcinco=bcinco+1;
}

while(cdinero>=1){
cdinero=cdinero-1;
muno=muno+1;
}
//Visualizamos.
System.out.println("\nBilletes de Cien = "+bcien+"\nBilletes de Veinte = "+bveinte+"\nBilletes de Cinco = "+bcinco+"\nMonedas de Uno = "+muno);
    }
    
}

