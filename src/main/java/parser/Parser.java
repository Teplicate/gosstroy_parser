package parser;

import org.apache.http.HttpResponse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Scanner;

public class Parser {

    public String parseGetRef(HttpResponse response) throws IOException
    {
        Scanner scanner = new Scanner(response.getEntity().getContent()).useDelimiter("\\A");
        String page = scanner.hasNext() ? scanner.next() : "";
        scanner.close();

        Document document = Jsoup.parse(page, "http://rosreestr.ru/");
        Elements link = document.select("td.brdw1111");
        Element href = link.select("a[href]").get(3);
        String url = href.attr("abs:href");
        System.out.println(url);

        return url;
    }

    public String[] parseData(String url) throws IOException
    {
        String [] data;
        Document document = Jsoup.connect(url).get();
        Element table = document.select("table").get(2);
        Elements rows = table.select("td");
        data = new String[rows.size() / 2];

        for (int i = 1, k = 0; i < rows.size(); i += 2)
        {
            if (i == 22)
            {
                data[k++] = rows.get(i + 1).text().trim();
                continue;
            }
            data[k++] = rows.get(i).text();
            if (i == 5)
            {
                i = 6;
            }
        }
        return data;
    }
}
