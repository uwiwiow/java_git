import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
public class dosLetras {
    public static void main (String [] args) throws IOException {
        ArrayList <String> letras = new ArrayList <String>();
        inOut command = new inOut();
        Random r = new Random();
        
        System.out.println("De la cantidad de digitos de la contraseña");
        int digitos = command.numIn();
        System.out.println("con ascii?");
        boolean ascii = command.siNo();
        System.out.println("Cuantas desea generar?");
        int iter = command.numIn();
        System.out.println("Su contraseña es: ");
        
        
        int num1;
        int num2;
        int num3;
        
        for (int iaa = 0; iaa < iter; iaa++) {
            
            if (ascii) {
                num1 = 0;
                num2 = 256;
                num3 = num2;

                for (int i = num1; i < num2; i++) {
                    char ai = (char) i;
                    String ia = String.valueOf(ai);
                    letras.add(ia);
                }

                for (int i = 0; i < digitos; i++) {
                    int n = r.nextInt(num3);
                    while (n >= 127 && n <= 160 || n == 9 || n == 10 || n == 13 || n == 32) {
                        n = r.nextInt(num3);
                    }
                    System.out.print(letras.get(n));
                }
            }
            else {
                num1 = 33;
                num2 = 127;
                num3 = 92;

                for (int i = num1; i < num2; i++) {
                    char ai = (char) i;
                    String ia = String.valueOf(ai);
                    letras.add(ia);
                }

                for (int i = 0; i < digitos; i++) {
                    int n = r.nextInt(num3);
                    System.out.print(letras.get(n));
                }

            }
            System.out.println("");
        }
        
    }
}