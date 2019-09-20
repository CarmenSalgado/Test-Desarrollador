package edu.cecar.servidores;
/**
*
* Clase: SocketServidor
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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocketServidor {
 
 private ServerSocket serverSocket;
 private Socket socket;
 private BufferedReader entrada;
 private PrintWriter salida;
 
  public SocketServidor(int numPuertoTCP) {
      
     try {
         serverSocket = new ServerSocket(numPuertoTCP);
         socket = serverSocket.accept();
         
         //CANALES DE ENTRADA Y SALIDA//
         entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         salida = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
     } catch (IOException ex) {
         
         ex.printStackTrace();
         System.err.println("Estableciendo Conexión: " + ex);
         Logger.getLogger(SocketServidor.class.getName()).log(Level.SEVERE, null, ex);
     }
    
      
  }

    public ServerSocket getServerSocket() {
        return serverSocket;
    }

    public void setServerSocket(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public BufferedReader getEntrada() {
        return entrada;
    }

    public void setEntrada(BufferedReader entrada) {
        this.entrada = entrada;
    }

    public PrintWriter getSalida() {
        return salida;
    }

    public void setSalida(PrintWriter salida) {
        this.salida = salida;
    }
     
     public void cerrarSocket() {
		
		try {
			
			socket.close();
			serverSocket.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
     }
   
   
    
 

}
