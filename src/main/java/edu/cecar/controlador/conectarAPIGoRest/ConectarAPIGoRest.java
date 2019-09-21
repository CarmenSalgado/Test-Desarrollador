package edu.cecar.controlador.conectarAPIGoRest;

/**
*
* Clase: ControladorPersonal
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
* @class Expression class is undefined on line 15, column 12 in Templates/Classes/Class.java.
*
* Copyright: CECAR
*
**//**
*
* ESTA CLASE PERMITE CONECTAR CON LA API GOREST...
*
**/

import edu.cecar.modelo.EmpleadoPotencial;
import java.io.*;
import java.util.*;

public class ConectarAPIGoRest {
    
  //  //
 String PUBLICKEY = "Bearer fmAJ-z9zXlB5g0S-Uzt5g6RDdZsuEy4jf3kq";
 String PRIVATEKEY = "Ey58xRGjLnmr4tR3VHULDArouD-JZknca5B-";
 
  private static Map<Integer, EmpleadoPotencial> mapResultados = null;
  private static ConectarAPIGoRest conectarAPIGoRest = null;

    public ConectarAPIGoRest() {
    }
  
   public static ConectarAPIGoRest getInstance(){
    
     if (conectarAPIGoRest==null) {
        
       conectarAPIGoRest = new ConectarAPIGoRest();
       conectarAPIGoRest.getArrayListUsuarios(250);
               
     }
    
    return conectarAPIGoRest;
   }
    
    

    private void getArrayListUsuarios(int i) {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     
    
    }

}
