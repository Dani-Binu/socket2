/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketjava2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniele
 */
public class MainClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //istanziato il client
            Client cli = new Client(InetAddress.getLocalHost(), 2000);
            //viene inserito in una stringa il messaggio del server
            String messLetto = cli.leggi();
            //viene stampato a video il messaggio
            System.out.println(messLetto);

        } catch (UnknownHostException ex) {
            Logger.getLogger(MainClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
