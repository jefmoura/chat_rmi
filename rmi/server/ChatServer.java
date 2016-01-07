package rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import chatrmi.ChatClient;

/**
 *
 * @author Jeferson and Mateus
 */
public class ChatServer extends UnicastRemoteObject implements ChatServerIntf {
    
    private static final long serialVersionUID = 1L;
    private ArrayList<ChatClient> chatClients;
    
    protected ChatServer() throws RemoteException {
        chatClients = new ArrayList<ChatClient>();
    }

    @Override
    public synchronized void registerChatClient(ChatClient chatClient) throws RemoteException {
        this.chatClients.add(chatClient);
    }

    @Override
    public synchronized void broadcastMessage(String message) throws RemoteException {
        int iterator = 0;
        
        for(;iterator < chatClients.size(); ++iterator){
            chatClients.get(iterator).retrieveMessage(message + "\n");
        }
    }

    @Override
    public void deleteChatClient(String username) throws RemoteException {
        int index;
        index = chatClients.indexOf(username);
        chatClients.remove(index);
    }
    
}
