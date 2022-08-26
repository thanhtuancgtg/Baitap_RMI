import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            String chon;
            System.out.println("dang tim servive...");
            calcServiceITF cItf = (calcServiceITF) Naming.lookup("rmi://localhost:9876/rmicalcService");
            do {
                System.out.println("Hay lua chon dich vu: ");
                System.out.println("1. Tinh bieu thuc a [+-*/] b");
                System.out.println("2. Tinh tong 1 + 3 + 5 + 7 + ... + (2n+1)");
                System.out.println("3. Exit de thoat");
                System.out.print("Moi chon: ");
                chon = sc.nextLine();
                switch (chon) {
                    case "1":
                        System.out.println("nhap bieu thuc");
                        String nhap = sc.nextLine();
                        float kq = cItf.tinhbieuthuc(nhap);
                        System.out.println("ket qua bieu thuc la: " + kq);
                        break;
                    case "2":
                        System.out.println("nhap n: ");
                        int n = sc.nextInt();
                        int tong = cItf.tongsole(n);
                        System.out.println("ket qua tong so le la: " + tong);
                        break;

                    default:
                        break;
                }
            } while (!chon.contains("exit"));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}