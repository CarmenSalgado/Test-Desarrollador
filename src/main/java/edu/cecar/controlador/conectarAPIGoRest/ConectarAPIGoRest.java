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
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.codec.digest.DigestUtils;
import us.monoid.json.*;
import us.monoid.web.Resty;

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
    
    public JSONObject getJSOnResourceCharacters(int numeroRegistros) throws IOException, Exception {

        long timeStamp = System.currentTimeMillis();

        String stringToHash = timeStamp + PRIVATEKEY + PUBLICKEY;
        String hash = DigestUtils.md5Hex(stringToHash);
        String url = "";
        url = String.format(" ", timeStamp, PUBLICKEY, hash, numeroRegistros);

        return new Resty().json(url).object();

    }

    private Map<Integer, EmpleadoPotencial> getArrayListUsuarios(int numeroRegistros) {
    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     if (mapResultados == null) {
            mapResultados = new HashMap<>();
            try {

                //Se obtiene el array con los Personajes
                JSONArray jSONArray = getJSOnResourceCharacters(numeroRegistros).
                        getJSONObject("data").getJSONArray("results");

                //Se recorre el jSONArray
                for (int i = 0; i < jSONArray.length(); i++) {

                    Map<Integer,String> mapfirst_name = new HashMap<>();
                    Map<Integer,String> maplast_name = new HashMap<>();
                    Map<Integer,String> mapgender = new HashMap<>();
                    Map<Integer,String> mapdob = new HashMap<>();
                    Map<Integer,String> mapemail = new HashMap<>();
                    Map<Integer,String> mapphone = new HashMap<>();
                    Map<Integer,String> mapwebsite = new HashMap<>();
                    Map<Integer,String> mapaddress = new HashMap<>();
                    Map<Integer,String> mapstatus = new HashMap<>();

                    EmpleadoPotencial empleadoPotencial = new EmpleadoPotencial(i, PUBLICKEY, PUBLICKEY, PUBLICKEY, PUBLICKEY, PUBLICKEY);

                    //obtenemos los first_name del empleadoPotencial
                    JSONArray jSONArrayfirst_name = jSONArray.getJSONObject(i).getJSONObject(" ").getJSONArray(" ");
                    for (int j = 0; j < jSONArrayfirst_name.length(); j++) {
                        int id = Integer.parseInt(jSONArrayfirst_name.getJSONObject(j).getString("resourceURI").split(" ")[1]);
                        mapfirst_name.put(id, jSONArrayfirst_name.getJSONObject(j).getString(" "));
                    }
                     //obtenemos los last_name del empleadoPotencial
                     JSONArray jSONArraylast_name = jSONArray.getJSONObject(i).getJSONObject(" ").getJSONArray(" ");
                    for (int j = 0; j < jSONArraylast_name.length(); j++) {
                        int id = Integer.parseInt(jSONArraylast_name.getJSONObject(j).getString("resourceURI").split(" ")[1]);
                        maplast_name.put(id, jSONArraylast_name.getJSONObject(j).getString(" "));
                    }
                     
                    //obtenemos los gender del empleadoPotencial
                     JSONArray jSONArraygender = jSONArray.getJSONObject(i).getJSONObject(" ").getJSONArray(" ");
                    for (int j = 0; j < jSONArraygender.length(); j++) {
                        int id = Integer.parseInt(jSONArraygender.getJSONObject(j).getString("resourceURI").split(" ")[1]);
                        mapgender.put(id, jSONArraygender.getJSONObject(j).getString(" "));
                    }
                    //obtenemos los dob del empleadoPotencial
                     JSONArray jSONArraydob = jSONArray.getJSONObject(i).getJSONObject(" ").getJSONArray(" ");
                    for (int j = 0; j < jSONArraydob.length(); j++) {
                        int id = Integer.parseInt(jSONArraydob.getJSONObject(j).getString("resourceURI").split(" ")[1]);
                        mapdob.put(id, jSONArraydob.getJSONObject(j).getString(" "));
                    }
                    //obtenemos los dob del empleadoPotencial
                     JSONArray jSONArrayemail = jSONArray.getJSONObject(i).getJSONObject(" ").getJSONArray(" ");
                    for (int j = 0; j < jSONArrayemail.length(); j++) {
                        int id = Integer.parseInt(jSONArrayemail.getJSONObject(j).getString("resourceURI").split(" ")[1]);
                        mapemail.put(id, jSONArrayemail.getJSONObject(j).getString(" "));
                    }
                    //obtenemos los dob del empleadoPotencial
                     JSONArray jSONArrayphone = jSONArray.getJSONObject(i).getJSONObject(" ").getJSONArray(" ");
                    for (int j = 0; j < jSONArrayphone.length(); j++) {
                        int id = Integer.parseInt(jSONArrayphone.getJSONObject(j).getString("resourceURI").split(" ")[1]);
                        mapphone.put(id, jSONArrayphone.getJSONObject(j).getString(" "));
                    }
                    //obtenemos los dob del empleadoPotencial
                     JSONArray jSONArraywebsite = jSONArray.getJSONObject(i).getJSONObject(" ").getJSONArray(" ");
                    for (int j = 0; j < jSONArraywebsite.length(); j++) {
                        int id = Integer.parseInt(jSONArraywebsite.getJSONObject(j).getString("resourceURI").split(" ")[1]);
                        mapwebsite.put(id, jSONArraywebsite.getJSONObject(j).getString(" "));
                    }
                    //obtenemos los dob del empleadoPotencial
                     JSONArray jSONArraystatus = jSONArray.getJSONObject(i).getJSONObject(" ").getJSONArray(" ");
                    for (int j = 0; j < jSONArraystatus.length(); j++) {
                        int id = Integer.parseInt(jSONArraystatus.getJSONObject(j).getString("resourceURI").split(" ")[1]);
                        mapstatus.put(id, jSONArraystatus.getJSONObject(j).getString(" "));
                    }
                    //obtenemos los address del empleadoPotencial
                     JSONArray jSONArrayaddress = jSONArray.getJSONObject(i).getJSONObject(" ").getJSONArray(" ");
                    for (int j = 0; j < jSONArrayaddress.length(); j++) {
                        int id = Integer.parseInt(jSONArrayaddress.getJSONObject(j).getString("resourceURI").split(" ")[1]);
                        mapaddress.put(id, jSONArrayaddress.getJSONObject(j).getString(" "));
                    }

                    

                    empleadoPotencial.setMapfirst_name(mapfirst_name);
                    empleadoPotencial.setMaplast_name(maplast_name);
                    empleadoPotencial.setMapgender(mapgender);
                    empleadoPotencial.setMapdob(mapdob);
                    empleadoPotencial.setMapemail(mapemail);
                    empleadoPotencial.setMapphone(mapphone);
                    empleadoPotencial.setMapwebsite(mapwebsite);
                    empleadoPotencial.setMapaddress(mapaddress);
                    empleadoPotencial.setMapstatus(mapstatus);
                    
                    

                    mapResultados.put(empleadoPotencial.getidentificador(), empleadoPotencial);

                }

            } catch (Exception ex) {
                Logger.getLogger(ConectarAPIGoRest.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return mapResultados;
    
    }

}
