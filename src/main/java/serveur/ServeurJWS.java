package serveur;

import jakarta.xml.ws.Endpoint;
import service.CalculatriceWS;

public class ServeurJWS {
    public static void main(String[] args) {
        //Spécification de l'URL ou le service sera publié
        String url ="http://localhost:8084/";
        Endpoint.publish(url, new CalculatriceWS());
        System.out.println(url);
    }
}