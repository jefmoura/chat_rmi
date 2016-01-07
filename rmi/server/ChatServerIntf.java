package rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import chatrmi.ChatClient;

/**
 *
 * @author Jeferson and Mateus
 */
public interface ChatServerIntf extends Remote {
    void registerChatClient(ChatClient chatClient) throws RemoteException;
    void broadcastMessage(String message) throws RemoteException;
    void deleteChatClient(String username) throws RemoteException;
}
