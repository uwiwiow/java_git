import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
public class cenaduria {
    public static void main(String[] args) throws IOException {
        //en la 1d cada index es una persona
        //en la 2d: 0 nombre de la persona, 1 enchiladas, 2 sopes, 3 gorditas, 4 comida total
        ArrayList<ArrayList<String>> arrPersona = new ArrayList<ArrayList<String>>();
        //arr para conseguir el numero mayor de persona que mas pidio comida
        ArrayList<Integer> arrMayorComprador = new ArrayList<Integer>();
        //arr para conseguir la comida que menos se compro en total
        ArrayList<Integer> arrMenorComida = new ArrayList<Integer>();
        //array con las opciones de comidas en string
        ArrayList<String> arrComponentes = new ArrayList<String>();
        arrComponentes.add("Enchiladas");
        arrComponentes.add("Sopes");
        arrComponentes.add("Gorditas");
        
        boolean continuar = true;
        int inc = 0;
        while (continuar == true) {
            arrPersona.add(new ArrayList<String>());

            //pedir datos
            System.out.println("A la cuenta de quien desea agregar comida?");
            String persona = txtIn();
            System.out.println("Cuantas enchiladas consumio?");
            String enchiladas = txtIn();
            System.out.println("Cuantos sopes consumio?");
            String sopes = txtIn();
            System.out.println("Cuantas gorditas consumio?");
            String gorditas = txtIn();
            
            //agregarlos a la array
            arrPersona.get(inc).add(persona);
            arrPersona.get(inc).add(enchiladas);
            arrPersona.get(inc).add(sopes);
            arrPersona.get(inc).add(gorditas);
            
            inc = inc + 1;
            
            //para pedir mas clientes
            Boolean opcIncorrecta = true;
            while (opcIncorrecta) {
                System.out.println("Quiere continuar agregando clientes?");
                System.out.println("<si>    <no>");
                String resp = txtIn();
                switch (resp) {
                    case "si" -> {
                        System.out.println("Iniciando de nuevo la eleccion");
                        opcIncorrecta = false;
                    }
                    case "no" -> {
                        System.out.println("Terminando...");
                        continuar = false;
                        opcIncorrecta = false;
                    }
                    default -> {
                        System.out.println("No ha seleccionado ninguna opcion\n");
                    }
                }
            }
            
        }
        
        //imprimir todos los valores de la array de persona
        for (int i = 0; i < arrPersona.size(); i++) {
            for (int j = 0; j < arrPersona.get(i).size(); j++) {
                System.out.print(arrPersona.get(i).get(j) + " ");
            }
            System.out.println();
        }
        
        //conseguir la comida total de cada persona
        int comidaTotal;
        String strComidaTotal;
        int enchiladas;
        String strEnchiladas;
        int sopes;
        String strSopes;
        int gorditas;
        String strGorditas;
        for (int i = 0; i < arrPersona.size(); i++) {
            strEnchiladas = arrPersona.get(i).get(1);
            enchiladas = Integer.parseInt(strEnchiladas);
            strSopes = arrPersona.get(i).get(2);
            sopes = Integer.parseInt(strSopes);
            strGorditas = arrPersona.get(i).get(3);
            gorditas = Integer.parseInt(strGorditas);
            comidaTotal = enchiladas + sopes + gorditas;
            strComidaTotal = String.valueOf(comidaTotal);
            arrPersona.get(i).add(strComidaTotal);
            
            arrMayorComprador.add(comidaTotal);
        }
        
        //conseguir el mayor comprador de comida total
        int indexMayorComprador;
        Object mayorComprador = Collections.max(arrMayorComprador);
        indexMayorComprador = arrMayorComprador.indexOf(mayorComprador);
        String clienteMasCompras = arrPersona.get(indexMayorComprador).get(0);
        
        //conseguir el total comprador por todos los clientes de cada comida
        int totalEnchiladas = 0;
        for (int i = 0; i < arrPersona.size(); i++) {
            String strEnchiladasPorPersona = arrPersona.get(i).get(1);
            int enchiladasPorPersona = Integer.parseInt(strEnchiladasPorPersona);
            totalEnchiladas = totalEnchiladas + enchiladasPorPersona;
        }
        arrMenorComida.add(totalEnchiladas);
        int totalSopes = 0;
        for (int i = 0; i < arrPersona.size(); i++) {
            String strSopesPorPersona = arrPersona.get(i).get(2);
            int sopesPorPersona = Integer.parseInt(strSopesPorPersona);
            totalSopes = totalEnchiladas + sopesPorPersona;
        }
        arrMenorComida.add(totalSopes);
        int totalGorditas = 0;
        for (int i = 0; i < arrPersona.size(); i++) {
            String strGorditasPorPersona = arrPersona.get(i).get(3);
            int gorditasPorPersona = Integer.parseInt(strGorditasPorPersona);
            totalGorditas = totalEnchiladas + gorditasPorPersona;
        }
        arrMenorComida.add(totalGorditas);
        
        Object cantMenorComida = Collections.min(arrMenorComida);
        int indexMenorComida = arrMenorComida.indexOf(cantMenorComida);
        String comidaMenosComprada = arrComponentes.get(indexMenorComida);
        
        
        
        System.out.println("El cliente que mas pidio comida fue " + clienteMasCompras + ". Por esta razon se llevara un premio!");
        
        System.out.println("La comida menos comprada fue " + comidaMenosComprada + ".");
    }
    
    public static String txtIn () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String texto = br.readLine();
        return texto;
    }
    
    public static Integer numIn() throws IOException {
        String strNum = txtIn();
        int num = Integer.parseInt(strNum);
        return num;
    }
    
}
