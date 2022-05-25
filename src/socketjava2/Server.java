/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketjava2;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniele
 */
public class Server {
    ServerSocket ss;
    Socket so;
    BufferedWriter bw;
    public Server(int porta){
        try {
            ss = new ServerSocket(porta);
            System.out.println("il server è in ascolto");
            //viene creato il countdown, definito e con il metodo start avviato
            Countdown c = new Countdown(10);
            c.start();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inAscolto(){
        try {
            so = ss.accept();
            System.out.println("connessione stabilita");
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void scrivi(String messaggio){
        try {
            bw = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
            bw.write(messaggio+"\n");
            bw.flush(); //ci permette di inviare il messaggio
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}