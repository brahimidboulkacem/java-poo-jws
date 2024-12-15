package web.enset;
import proxy.BankServices;
import proxy.BanqueEnset;
import proxy.Compte;

import java.util.Scanner;

public class ClientsJws {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Code Client : ");
        int code = scanner.nextInt();
        BankServices stub = new BanqueEnset().getBankServicesPort();
        Compte cmp = stub.getCompte(code);
        System.out.println("code client : "+cmp.getCode());
        System.out.println("solde client : "+cmp.getSolde());
        System.out.println("date de creation : "+ cmp.getDatecreation());

    }
}
