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
        Server srv = new Server(2000);
        srv.inAscolto();
        srv.scrivi("benvenuto client");
    }
}
