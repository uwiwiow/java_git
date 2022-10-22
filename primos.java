import java.io.IOException;
import java.util.ArrayList;
public class primos {
    public static void main (String [] args) throws IOException {
        ArrayList <Integer> divisores = new ArrayList <Integer>();
        ArrayList <Integer> primo = new ArrayList <Integer>();
        
        inOut comando = new inOut();
        
        System.out.println("Hasta que numero desea encontrar primos?");
        
        int numero = comando.numIn();
        
        for (int h = 0; h < numero + 1; h++) {
            for (int i = h; i > 0; i--) {
                int resultado = h % i;
                if (resultado == 0) {
                    divisores.add(i);
                }
            }
            if (divisores.size() == 2) { primo.add(h); }
            divisores.clear();
        }
        
        System.out.println("Los numeros primos hasta " + numero + " son ");
        for (int i = 0; i < primo.size(); i++) {
            System.out.print(primo.get(i));
            System.out.print(" ");
        }
    }
}
