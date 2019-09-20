package edu.cecar.componente.singleton;
/**
*
* Clase: Singleton
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
* ESTA CLASE PERMITE...
*
**/

public final class SingletonEmpleadoPotencial {
    
 private static SingletonEmpleadoPotencial singletonEmpleadoPotencial;
  public static SingletonEmpleadoPotencial getSingletonEmpleadoPotencial() {
     
   if (singletonEmpleadoPotencial==null) {
       
       singletonEmpleadoPotencial = new SingletonEmpleadoPotencial();
   }
   return singletonEmpleadoPotencial;
  }
    
 

}
