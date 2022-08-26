import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(9876);
            calcService cs = new calcService();
            Naming.bind("rmi://localhost:9876/rmicalcService", cs);
            System.out.println("server Start");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}