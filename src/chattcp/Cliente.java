package chattcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gustavo
 */
public class Cliente {
    public static void main(String[] args) {
        try {
            Socket socketChat = new Socket("127.0.0.1",1500);
            Socket socketAnexo = new Socket("127.0.0.1",1600);
            Chat frame = new Chat(socketChat,socketAnexo,"Cliente");
            
            
            frame.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
