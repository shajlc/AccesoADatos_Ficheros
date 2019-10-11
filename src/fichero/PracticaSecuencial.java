package fichero;
import java.io.*;
import java.util.Scanner;

public class PracticaSecuencial {

   
    public static void main(String[] args) {
       try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el fichero a leer: \n");
        String fichero = sc.nextLine();
       
        int numReg = CalculaRegistro(fichero);
         System.out.println("Número de registros: " + numReg+ "\n");
         
        Scanner scReg= new Scanner(System.in);
        System.out.println("Introduzca el número de registro a leer: \n");
        String registro = scReg.nextLine();
       
        Scanner scCampo= new Scanner(System.in);
        System.out.println("Introduzca el campo a leer: nombre | nota | asignatura \n");
        String campo = scCampo.nextLine();
       
        obtenerCampo(registro, campo, fichero);
       }
       catch(Exception e){
            System.out.println("FUNCIÓN NO ENCONTRADA");
        }
    }
    public static int CalculaRegistro(String archivo){
        int nReg=0;
        try{
            FileReader fr = new FileReader(archivo);
            BufferedReader entrada = new BufferedReader(fr);
           
           
             while((entrada.readLine())!=null)
                nReg ++;
            entrada.close();
        }
       
        catch(java.io.FileNotFoundException fnfex){
            System.out.println("Archivo no encontrado" + fnfex);
        }
        catch(java.io.IOException ioex){}
         return nReg;
    }
   
    public static void obtenerCampo(String reg, String campo, String archivo){
        int registro = Integer.parseInt(reg);
        char caracter;
       
        try{
            FileReader fr = new FileReader(archivo);
            BufferedReader entrada = new BufferedReader(fr);
           
            for(int i=1; i<=registro; i++){
                if (i==registro) {
                    if (campo.equals("nombre")){
                        caracter = (char) entrada.read();
                        while (caracter !='*'){
                            System.out.print(caracter);
                            caracter = (char) entrada.read();}
                       
                    }else if (campo.equals("nota")){
                            caracter = (char) entrada.read();
                            while(caracter !='*'){
                                caracter = (char) entrada.read();
                            }
                            caracter = '-';
                            while(caracter !='*'){
                                caracter = (char) entrada.read();
                                System.out.print(caracter);
                            }
                           
                    }else if (campo.equals("asignatura")){
                        int numAsterisco=0;
                        boolean leerDato= false;
                        caracter = (char) entrada.read();
                        while (caracter !='.'){
                            if (caracter == '*'){
                                numAsterisco ++;
                                if (numAsterisco==2)
                                    leerDato= true;
                            }
                        caracter = (char) entrada.read();
                        if (leerDato ==true && caracter!='.')
                            System.out.print(caracter);
                        }
                    }
               
                }entrada.readLine();
            }
        }
       
        catch(java.io.FileNotFoundException fnfex){
            System.out.println("Archivo no encontrado" + fnfex);
        }
        catch(java.io.IOException ioex){}
    }
   
}
