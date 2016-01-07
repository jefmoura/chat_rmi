package chatrmi;

import java.rmi.RemoteException;

/**
 *
 * @author Jeferson
 */
public interface ChatClientIntf {
    void retrieveMessage(String message) throws RemoteException;
}
