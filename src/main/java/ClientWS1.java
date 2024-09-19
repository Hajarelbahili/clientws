import proxy.BanqueService;
import proxy.BanqueWS;

public class ClientWS1 {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();

        System.out.println(stub.convert(499));
    }
}
