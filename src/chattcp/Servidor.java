package chattcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author gustavo
 */
public class Servidor {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(1500);
            while(true){
                Socket socket = server.accept();
                Chat frame = new Chat(socket,"Servidor");
                frame.setVisible(true);
            }
        } catch (IOException ex) {
            System.out.println("Erro na comunicação" + ex.getMessage());
        }
    }
}
