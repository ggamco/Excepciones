package com.cice.cifrado;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileReader fr = null;
        try {
            //fr.toString();
            fr = new FileReader("src/text.txt");
            System.out.println("LEEMOS EL FICHERO");
            System.out.println("ESTO NO SE EJECUTA EN CASO DE EXCEPCION");
        } catch(FileNotFoundException ex){
            System.out.println("ERROR AL CREAR EL FICHERO TEXT.TXT");
            File fichero = new File("src/texto.txt");
            fr = new FileReader(fichero);
        } finally {
            System.out.println("FINALLY");
            fr.close();
        }

        fr.toString();
        System.out.println("CONTINUAMOS EJECUCION");

        Prueba p = new Prueba();
        try {
            p.lanzarExcepcion();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
