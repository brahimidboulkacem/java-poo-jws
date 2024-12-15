import enset.ws.BankServices;
import jakarta.xml.ws.Endpoint;

public class ServerJws {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:5000/";
        Endpoint.publish(url, new BankServices());
        System.out.println("Welcome to web service Enset into url : "+url);

    }
}
