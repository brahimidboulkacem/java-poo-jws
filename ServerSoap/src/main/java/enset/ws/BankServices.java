package enset.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueEnset")
public class BankServices {

    double math= Math.random()*100.0;
    Date date_now = new Date();
    @WebMethod(operationName = "Convert")
    public double conversion (@WebParam(name = "Montant") double mnt)
    {
        return mnt*10.00;
    }
    @WebMethod
    public Compte getCompte (@WebParam(name = "Code") int code)
    {

        return new Compte(code, math, date_now);
    }
    @WebMethod
    public List<Compte> ListComptes()
    {
        return List.of(
              new  Compte(1, math,date_now),
              new Compte(2, math,date_now),
              new Compte(3, math,date_now)
        );

    }
}
