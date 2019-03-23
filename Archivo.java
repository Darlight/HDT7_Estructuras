/*
Universidad del Valle de Guatemala
Seccion 10 - Pareja 9
Josue Sagastume - 18173
Mario Perdomo - 18029
Archivo.java
 */
import java.io.*;
public class Archivo{

    //Metodo para leer archivos de texto
    //Recibe como parametro la direccion del lugar del archivo
    public void leerTxt(String direccion){

        String texto = "";

        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            //Variable temporal para guardar el texto
            String temp = "";
            //Variable para leer un buffer
            String bfRead;
            //Realiza el ciclo mientras bfRead tenga datos
            while((bfRead = bf.readLine()) != null){
                //Guarda el texto del archivo
                temp = temp + bfRead;
            }
            texto = temp;

            while()
        } catch (Exception e){
            System.out.println("No se encontro el archivo en la direccion dada");
        }
        return texto;
    }

}