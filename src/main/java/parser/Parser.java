package parser;

import org.apache.http.HttpResponse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

public class Parser {

    public void parseGetRef(HttpResponse response) throws IOException
    {
        Scanner scanner = new Scanner(response.getEntity().getContent()).useDelimiter("\\A");
        String page = scanner.hasNext() ? scanner.next() : "";
        scanner.close();

        Document document = Jsoup.parse(page, "http://rosreestr.ru/");

        Elements link = document.select("td.brdw1111");

        Element href = link.select("a[href]").get(3);
        String url = href.attr("abs:href");
        System.out.println(url);
    }
}
