/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichero;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Shalc
 */
public class Fichero {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        try {
            Scanner sc = new Scanner(System.in);    //system out para hacer un string de salida y system in de entrada
            System.out.println("Introduzca el fichero a leer \n"); //el \n es para el salto de linea
            String fichero = sc.nextLine();//la siguiente linea que se escriba se almacena en la variable string
            
            leerDatos(fichero); 
            
        } 
        catch (Exception e) {
            System.out.println("FUNCIÓN NO ENCONTRADA");
        }
    }
    public static void leerDatos (String archivo){
        String texto = new String (); //variable de tipo string una almacenara el contenido del fichero y otra la que ira leyendo fila a fila
        try {
            FileReader fr = new FileReader(archivo);//Contenido del archico lo coge y se lleva en el buffer de memoria
            BufferedReader entrada = new BufferedReader(fr);
            
            //METODO LEYENDO LÍNEA A LÍNEA
//            String s;
//            while((s=entrada.readLine())!=null); //cuando me va a devolver mi metodo read line nulo, cuando este en el final del fichero
//                texto += s + "\n";//para leer el fichero, la primera le leera la linea y se almacenara en la s, pero luego texto almacenara todas las lineas 
//                                   // s= El viernes     función = texto = El viernes y el tabulador se queda abajo por la "\n"
//                System.out.println("\nDatos leidos del archivo con método READLINE: \n" + texto + "tamaño del fichero: \n" + texto.length());
               




               //Metodo Leyendo Carácter a Carácter
               int contador;
               contador=0;
               char c;
               entrada.skip(10);// salta X caracteres para posicionarse donde quieras ya sea 10, 15 o lo que fuera
               int caracter = entrada.read();
               while (caracter !=-1){ //bucle, -1 me devuelve cuando no devuelve nada y si lee en un valor positivo
                   c=(char) caracter; //catea la variable que se acaba de leer
                   System.out.print(c); //imprime por pantalla
                   contador = contador +1;
                   caracter = entrada.read(); //lee el siguiente carácter
                   
               }

               System.out.println("\nTamaño del fichero: " + contador);
               entrada.close();//elimina el buffer
        } 
        
        catch(java.io.FileNotFoundException fnfex) { //En cxaso de que salte el error que no encuentra el fichero, lo que haremos es mostrar por pantalla
            System.out.println("Archivo no encontrado " + fnfex);//nos saltara por pantalla este mensaje
        }
        catch(java.io.IOException ioex){
            
        }
    }
}
