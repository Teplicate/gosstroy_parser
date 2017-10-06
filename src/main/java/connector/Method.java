package connector;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import sun.misc.IOUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class Method {

    private HttpClient httpClient;

    public Method(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public HttpResponse postMethod(String data) throws IOException
    {
        HttpPost httpPost = new HttpPost("https://rosreestr.ru/wps/portal/" +
                "p/cc_ib_portal_services/online_request/!ut/p/z1/04_Sj9CPykssy0xP" +
                "LMnMz0vMAfIjo8zi3QNNXA2dTQy93QMNzQ0cPR29DY0N3Q0MQkz1w_Eq8DfUj6JEP" +
                "1ABSL8BDuBoANQfhdcKZyMCCkBOJGRJQW5ohEGmpyIAKLXudw!!/p0/IZ7_01HA1A4" +
                "2KODT90AR30VLN22001=CZ6_GQ4E1C41KGQ170AIAK131G00T5=MEcontroller!QCPSearchAction==/");

        ArrayList<NameValuePair> parameters = new ArrayList<NameValuePair>();

        parameters.add(new BasicNameValuePair("search_action", "true"));
        parameters.add(new BasicNameValuePair("search_type", "CAD_NUMBER"));
        parameters.add(new BasicNameValuePair("cad_num", data));
        parameters.add(new BasicNameValuePair("start_position", "59"));
        parameters.add(new BasicNameValuePair("street_type", "srt0"));

        httpPost.setEntity(new UrlEncodedFormEntity(parameters, "UTF-8"));
        HttpResponse response = httpClient.execute(httpPost);

        System.out.println(response.getStatusLine());

        return response;
    }
}
