/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketjava2;

/**
 *
 * @author Daniele
 */
public class MainServer {
        
    public static void main(String[] args) {
        //istanza del server
        Server srv = new Server(2000);
        //richiamo metodo server in ascolto
        srv.inAscolto();
        //invoca il metodo scrivi per inviare un messaggio al client
        srv.scrivi("benvenuto client");
    }
}
