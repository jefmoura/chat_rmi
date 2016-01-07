package chatrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;
import rmi.server.ChatServerIntf;

/**
 *
 * @author Jeferson and Mateus
 */
public class ChatUser {
    private ChatServerIntf chatServer;
    private String username = null;
    
    protected ChatUser(String username, ChatServerIntf chatServer) throws RemoteException {
        this.username = username;
        this.chatServer = chatServer;
    }
    
    public String getUsername(){
        return this.username;
    }
    
    public ChatServerIntf getChatServer(){
        return this.chatServer;
    }
}
