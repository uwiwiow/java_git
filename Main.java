import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Complejo c1 = new Complejo (5,5);
        
        System.out.println("El complejo " + c1 + " es:");
        System.out.println("Parte Real " + c1.getReal());
        System.out.println("Parte imaginaria " + c1.getImag());
        System.out.println("Y la suma de los numeros es " + c1.getSumaRealImag());
        
        Complejo c2 = new Complejo ();
        int num = numIn();
        c2.setReal(num);
        num = numIn();
        c2.setImag(num);
        System.out.println("El complejo " + c2 + " es:");
        System.out.println("Parte Real " + c2.getReal());
        System.out.println("Parte imaginaria " + c2.getImag());
        System.out.println("Y la suma de los numeros es " + c2.getSumaRealImag());
    }
    
    public static String txtIn () throws IOException {
        BufferedReader buffer = new BufferedReader (new InputStreamReader (System.in));
        String texto = buffer.readLine();
        return texto;
    }
    
    public static Integer numIn() throws IOException {
        String strNum = txtIn();
        int num = Integer.parseInt(strNum);
        return num;
    }
}
