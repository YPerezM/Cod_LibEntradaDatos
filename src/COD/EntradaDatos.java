

package COD;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class EntradaDatos {
    public static int introducir(int tipo){
        Scanner dato=new Scanner(System.in);
        int num=0;
        if (tipo==0){
         num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número", null));
        }
        else if (tipo==1){
         System.out.println("Introduce un número");
         num=dato.nextInt();
        }
        return num;
    }
}
