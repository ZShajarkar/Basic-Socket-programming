/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session22;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.*;
import java.nio.channels.*;

/**
 *
 * @author user
 */
public class Client {
    static int i=0;
    public static void main(String[] args) {
        int port=768;
        i++;
        String des="D:\\code\\mmd.txt";
        try{   
               Socket socket=new Socket("127.0.0.1", port);
               
                byte[] block = new byte[512];
           OutputStream outputStream=new FileOutputStream(des);
            InputStream in=   socket.getInputStream();
           
 
 int  i;
 while((i=in.read(block))!=-1){
    outputStream.write(block, 0, i);
 }
        }catch(Exception e){
            System.out.println(e.getCause()+" : "+e.getClass()+" : "+e.getMessage());
        }
    }
}
