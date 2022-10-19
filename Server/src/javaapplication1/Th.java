package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Vector;

class Th extends Thread{
    BufferedReader in;
    Vector<OutputStreamWriter> listClients;
    @Override
    public void run(){
        System.out.println("Thread lunched");
        
        while(true){
            try{
                String msg = in.readLine();
                System.out.println(msg);
                
                // can be used in the server class or the thread, it has to be here.
                for(int i =0; i < listClients.size(); i++){
                    OutputStreamWriter o = listClients.get(i);
                    o.write(msg + "\n");
                    o.flush();
                }
            }catch(IOException e){}
        }
    }
    
}
