import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class calcService extends UnicastRemoteObject implements calcServiceITF {
    protected calcService() throws RemoteException {
        super();
    }

    public float tinhbieuthuc(String bieuthuc) {
        String[] split = bieuthuc.split("");
        String toantu = split[1];
        int so1 = Integer.valueOf(split[0]);
        int so2 = Integer.valueOf(split[2]);
        if (toantu.equals("+")) {
            return so1 + so2;
        } else if (toantu.equals("-")) {
            return so1 - so2;
        } else if (toantu.equals("*")) {
            return so1 * so2;
        } else if (toantu.equals("/"))
            ;
        {
            return so1 / so2;
        }
    }

    public int tongsole(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++)
            sum += (2 * i + 1);
        return sum;
    }
}