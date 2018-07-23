package com.cice.cifrado;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Prueba {

    /**
     *
     * @throws FileNotFoundException
     */
    public void test() throws FileNotFoundException {
        FileReader fr = new FileReader("");
    }

    public void lanzarExcepcion() throws CiceException {
        throw new CiceException("Mensaje personalizado");
    }
}
