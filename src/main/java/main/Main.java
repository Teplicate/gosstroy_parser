package main;

import connector.Method;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClients;
import parser.Parser;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Parser parser = new Parser();
        HttpClient httpClient = HttpClients.createDefault();
        Method method = new Method(httpClient);
        HttpResponse response = method.postMethod(" 02:55:020105:1947");
        String url = parser.parseGetRef(response);
        parser.parseData(url);

    }
}
