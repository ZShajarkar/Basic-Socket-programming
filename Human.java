/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session22;

import java.net.Socket;

/**
 *
 * @author user
 */
public class Human extends Thread{
    Socket socket;

    public Human(Socket socket) {
        this.socket = socket;
    }
    
}
