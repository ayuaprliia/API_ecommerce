import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws IOException {
            // Inisialisasi HTTP Server
            HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

            // Menambahkan produk awal
            Product product1 = new Product(1, "Produk 1", 10.0);
            Product product2 = new Product(2, "Produk 2", 20.0);
            Database.addProduct(product1);
            Database.addProduct(product2);

            // Handler untuk endpoint /products
            server.createContext("/products", new ProductHandler());

            // Handler untuk endpoint /products/{id}
            server.createContext("/products/{id}", new ProductDetailHandler());

            // Start server
            server.start();
            System.out.println("Server started on port 8000.");
        }
    }










}
