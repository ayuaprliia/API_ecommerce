import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        // Mengatur port untuk API
        int port = 8000;
        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        }

        // Menginisialisasi server dengan port yang telah ditentukan
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);


        server.createContext("/users", new Response.UsersHandler());
        server.createContext("/products", new Response.ProductsHandler());
        server.createContext("/orders", new Response.OrdersHandler());
        server.createContext("/orderDetails", new Response.OrderDetailsHandler());

        // Add more handlers for other endpoints (/products, /orders, /reviews) if needed
        server.setExecutor(null);
        server.createContext("/users/data", new Server.DataHandler());
        server.start();
        System.out.println("Listening on port: "+port);
    }
}
