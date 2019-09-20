package edu.cecar.test;

/**
*
* Clase: TestControlador
*
* versión:0.1
*
* fecha Creación: 19/09/2019
*
* fecha Modificación: 19/09/2019
*
* Autor: Carmen Salgado...
*
* @author Casalg
* 
* @class Expression class is undefined on line 14, column 12 in Templates/Classes/Class.java.
*
* Copyright: CECAR
*
**//**
*
* ESTA CLASE PERMITE TESTEAR LOS SERVIDORES DEL SOFTWARE...
*
**/

import edu.cecar.servidores.ServidorGoRest;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;

public class TestServidores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        try {
            new ServidorGoRest();
        } catch (Exception e) {
           
            System.err.println(" ERROR: "+e);
          Logger.getLogger(TestServidores.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
    
}
