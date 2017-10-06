package parser;

import org.apache.http.HttpResponse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.Scanner;

public class Parser {

    public String createNextURL(HttpResponse response) throws IOException
    {
        String URL = "rosreesr.ru";
        URL += response.getAllHeaders()[2].getValue();
        return URL;
    }

    public String parseGetRef(HttpResponse response) throws IOException
    {
        Scanner scanner = new Scanner(response.getEntity().getContent()).useDelimiter("\\A");
        String page = scanner.hasNext() ? scanner.next() : "";
        scanner.close();

        Document document = Jsoup.parse(page);

        Element link = document.select("a").first();
        String url = link.absUrl("href");

        System.out.println(url);

        return url;
    }
}
