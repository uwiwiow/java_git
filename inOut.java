import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class inOut {
    
    public String txtIn() throws IOException  {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String texto = br.readLine();
        return texto;
    }
    
    public Integer numIn() throws IOException {
        String strNum = txtIn();
        int num = Integer.parseInt(strNum);
        return num;
    }
    
    public Double decIn() throws IOException {
        String strNum = txtIn();
        Double num = Double.valueOf(strNum);
        return num;
    }
    
    public Boolean siNo() throws IOException {
        Boolean terminado = false;
        Boolean opc = null;
        while (!terminado) {
            String strOpc = txtIn().toLowerCase();
            switch (strOpc) {
                case "si" -> {opc = true; terminado = true;}
                case "s" -> {opc = true; terminado = true;}
                case "no" -> {opc = false; terminado = true;}
                case "n" -> {opc = false; terminado = true;}
                default -> System.out.println("No ha seleccionado ninguna opcion\n\n<si>               <no>");
            }
        }
        return opc;
    }
}
