/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichero;
import java.io.*;

/**
 *
 * @author Shalc
 */
public class FicherosAleatoriosClase {
    
    public static void main (String[] args) throws IOException{
        //nos creamos un objeto file de tipo fichero
 //       File fichero=new File("fichero.txt");
        //nos creamos un objeto file de tipo carpeta
 //       File directorio=new File("carpetita");//("carpetita/carpetita2/..")
        
        //Creamos la carpeta
//        System.out.println("Creando directorio...");
//        boolean bool_dir = false;
//        bool_dir = directorio.mkdir();
//        System.out.println(bool_dir);
//        System.out.println("\n");
        
        
        
        ////////////////////////PARA CREAR FICHERO//////////////////////////
        //Creamos el fichero
//        System.out.println("Creando fichero...");
//        boolean bool_file = false;
//        bool_file = fichero.createNewFile();
//        System.out.println(bool_file);
//        System.out.println("\n");



        //////////////////////PARA SABER SI EXISTE LA CARPETA O DIRECTORIO//////////////////////////////
//        System.out.println("Existe fichero..."+ fichero.exists()+"\n");
//        System.out.println("Existe fichero..."+ directorio.exists()+"\n");
       


        /////////////////////////Indica si son directorios//////////////////////////////////////
//        System.out.println("¿Son directorios?: ");
//        System.out.println("fichero "+fichero.isDirectory());
//        System.out.println("directorio "+directorio.isDirectory());
//        System.out.println("\n");
        
        
        
        ///////////////////Indica si son ficheros////////////////
//        System.out.println("¿Son ficheros?: ");
//        System.out.println("fichero "+fichero.isFile());
//        System.out.println("directorio "+directorio.isFile());
//        System.out.println("\n");



        ///////////////////Indica la ruta absoluta del fichero o directorio///////////////
//        System.out.println("Ruta absoluta: C:\\Users\\Shalc\\Documents\\NetBeansProjects\\Fichero\\carpetita");
//        System.out.println("fichero "+fichero.getAbsolutePath());
//        System.out.println("directorio"+directorio.getAbsolutePath());
//        System.out.println("\n");        


        ///////////////Indica si se puede leer//////////////////
//            System.out.println("¿Se pueden leer?:");
//            System.out.println("fichero "+fichero.canRead());
//            System.out.println("directorio "+directorio.canRead());
//            System.out.println("\n");



        ///////////////////////////Indica si se puede escribir//////////////////////////
//        System.out.println("¿Se pueden escribir?:");
//        System.out.println("fichero "+fichero.canWrite());
//        System.out.println("directorio "+directorio.canWrite());
//        System.out.println("\n");



        ///////////////////////Indica si se puede ejecutar/////////////////////
//        System.out.println("¿Se pueden ejecutar?:");
//        System.out.println("fichero "+fichero.canExecute());
//        System.out.println("Directorio "+directorio.canExecute());
//        System.out.println("\n");

//---------------21-10-19-----------------------
           //NoS CREAMOS UN OBJETO FILE TIPO FICHERO
           //1char=2bytes, 1float=4bytes todo eso es 16 bytes
        File fichero = new File ("fichero.txt");

           RandomAccessFile aa = new RandomAccessFile (fichero, "rw");
           
//           long posActual = aa.getFilePointer();
//           System.out.println(posActual);
//           aa.seek(4);
//           posActual = aa.getFilePointer();
//           System.out.println("\n"+posActual);
//           aa.skipBytes(2);
//           posActual = aa.getFilePointer();
//           System.out.println("\n"+posActual);
//           System.out.println("\n tamaño total del archivo"+aa.length());
//           System.out.println("\n tamaño total del archivo"+aa.length()/66);



//            aa.writeFloat(9.25f);//la variable de tipo float ocupa 4 bytes
//            aa.writeFloat(8.50f);
//            char caracter = 'c';
//            aa.writeChar((int) caracter );
//            System.out.println("longitud del fichero "+aa.length());
//            System.out.println("\n número de registros "+aa.length()/10);



//               NO FUNCIONA
//              aa.seek(0);
//              float nota1 = aa.readFloat();
//              float nota2 = aa.readFloat();
//              char caracter = aa.readChar();
//              System.out.println("nota1 "+nota1+ "nota2" + nota2 + " caracter " + caracter);
                


//                aa.seek(6);
//                System.out.print(aa.readFloat());
                
                //ver cuatro resgitros con un for 
                int regs =(int) aa.length()/10;
                System.out.println("Tamaño total del fichero: "+ aa.length()+"\nNúmero de registros:"+regs);
                float nota1;
                float nota2;
                char caracter;
                for (int i=0; i<regs ; i++){
                    nota1 =aa.readFloat();
                    nota2=aa.readFloat();
                    caracter = aa.readChar();
                    System.out.println("nota1 "+nota1+ " nota2 " + nota2 + " caracter " + caracter);
                
                }
    }
}
