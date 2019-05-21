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
            Socket socket = new Socket("127.0.0.1",1500);
            Chat frame = new Chat(socket,"Cliente");
            frame.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
