package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

/**
 *
 * @author Mountaha
 */
public class Server {
    public static void main(String[] args) {
         
        try{
ServerSocket sersoc = new ServerSocket (2013) ;

Vector<OutputStreamWriter> listClients = new Vector<OutputStreamWriter>();

while(true){
    Socket soc = sersoc.accept();
    OutputStreamWriter sortie = new OutputStreamWriter(soc.getOutputStream()); 
    BufferedReader entree = new BufferedReader(new InputStreamReader (soc.getInputStream()));  
    
    
    Th t = new Th(); 
    t.in = entree;
    t.listClients = listClients;t.start();
    
    String msg = entree.readLine();
    System.out.println(msg);

}

        } catch(IOException e){}

    
    }}
