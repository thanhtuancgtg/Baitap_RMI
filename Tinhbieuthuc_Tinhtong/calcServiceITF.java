import java.rmi.Remote;
import java.rmi.RemoteException;

public interface calcServiceITF extends Remote {
    public float tinhbieuthuc(String bieuthuc) throws RemoteException;

    public int tongsole(int n) throws RemoteException;
}