package rmi.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 *
 * @author Jeferson and Mateus
 */
public class ChatServerDriver {
    public static void main(String[] args) throws MalformedURLException, RemoteException{
        Naming.rebind("//localhost:2020/RMIChatServer", new ChatServer());
    }
}
