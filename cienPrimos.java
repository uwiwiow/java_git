import java.io.IOException;
import java.util.ArrayList;
public class cienPrimos {
    public static void main (String [] args) throws IOException {
        ArrayList <Integer> divisores = new ArrayList <Integer>();
        ArrayList <Integer> primo = new ArrayList <Integer>();
        inOut command = new inOut();
        System.out.println("Cuantos numeros primos desea encontrar?");
        int cant = command.numIn();
        int numero = 0;
        while (primo.size() != cant) {
            numero++;
            for (int i = numero; i > 0; i--) {
                int resultado = numero % i;
                if (resultado == 0) {
                    divisores.add(i);
                }
            }
            if (divisores.size() == 2) { primo.add(numero); }
            divisores.clear();
        }
        for (int i = 0; i < primo.size(); i++) {
            System.out.print(primo.get(i));
            System.out.print(" ");
            if ((i+1)%10 == 0 && i != 0){ System.out.println(""); }
        }
    }
}
