/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session22;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author user
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int port=768;
        int b;
        String source="D:\\code\\Zeinab.txt";
        try{
        ServerSocket serverSocket=new ServerSocket(port);
            System.out.println("Listen......");
                   byte[] block = new byte[512];
            while(true){
        Socket socket=serverSocket.accept();   
                Human a= new Human(socket);
                a.start();
            FileInputStream fileInputStream=new FileInputStream(source);
   OutputStream outputStream=a.socket.getOutputStream();
 
   while((b= fileInputStream.read(block))!=-1)
   {
       outputStream.write(block,0,b);
     
   }
   socket.close();
   fileInputStream.close();
   outputStream.close();
            }
        }catch(Exception e){
            System.out.println(e.getCause()+" : "+e.getMessage()+" : "+e.getClass());
        }
    }
    
}
