/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 *
 * @author Mountaha
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Fenetre fen = new Fenetre();
            fen.setVisible(true);
            
            Socket soc =new Socket("127.0.0.1",2013);
            
            
            OutputStreamWriter sortie = new OutputStreamWriter (soc.getOutputStream()); 
            // read  the informations coming
            BufferedReader entree = new BufferedReader (new InputStreamReader (soc.getInputStream ())); 
            
            fen.out = sortie;
            while(true){
                String m = entree.readLine();
                System.out.println(m);
                
            }


} catch(IOException e){ 
    System.out.println("Hi this is the clients catch");
}



    }
    
}
