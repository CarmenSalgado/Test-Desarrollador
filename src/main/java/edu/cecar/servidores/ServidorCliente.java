package edu.cecar.servidores;

/**
*
* Clase: ServidorCliente
*
* versión:0.1
*
* fecha Creación: 15/09/2019
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
* ESTA CLASE PERMITE...
*
**/

import edu.cecar.componentes.comunicacion.SocketCliente;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServidorCliente {
    
 private SocketCliente socketCliente;
 
  public Object consultarServidor(String direccionIP, String opcion,int id) throws Exception{
    
   Object result = null;
     try {
         result = new Object();
         socketCliente = new SocketCliente(direccionIP, id);
         
         //SALIDA: SOLICITA UN SERVICIO Y ESPERA EL RESULTADO//
         socketCliente.getSalida().println(opcion + "," + id);
         String resultServicio = socketCliente.getEntrada().readLine();
         
         if (opcion.equals("first_name")||opcion.equals("last_name")||opcion.equals("gender")||opcion.equals("dob")||
             opcion.equals("email")||opcion.equals("phone")||opcion.equals("website")||opcion.equals("address")||opcion.equals("status")) {
              
              ArrayList<String[]> arrayList = resultArraylist(resultServicio);
               result =arrayList;
             
         } else if(opcion.equals("TODOS")) {
            
            
            
         }
         
     }catch (IOException ex) {
       Logger.getLogger(ServidorCliente.class.getName()).log(Level.SEVERE, null, ex);
      }
    socketCliente.cerrarSocket();
   return result;
  }

    private ArrayList<String[]> resultArraylist(String resultServicio){
        
     ArrayList<String[]> arrayList = new ArrayList<String[]>();
     //        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      String[] array = resultServicio.split("");
        if (array[0].length()> 0 && !array[0].equals("")) {
            
            for (String registros : array) {
             
             //OBTENER Y AGREGAR LOS REGISTROS AL ARRAYLIST//
             String[] columna = registros.split("");
             arrayList.add(columna);
            }
            
        }
     return arrayList;
    }

}
