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
            ServerSocket serverChat = new ServerSocket(1500);
            ServerSocket serverAnexo = new ServerSocket(1600);
            while(true){
                Socket socketChat = serverChat.accept();
                Socket socketAnexo = serverAnexo.accept();
                Chat frame = new Chat(socketChat,socketAnexo,"Servidor");
                frame.setVisible(true);
            }
        } catch (IOException ex) {
            System.out.println("Erro na comunicação" + ex.getMessage());
        }
    }
}
