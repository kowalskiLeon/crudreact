/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configs;

import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

/**
 *
 * @author guilherme.moura
 */
public class HttpClient {

    private static final int CONNECTION_TIMEOUT = (1000 * 60) * 10;
    private static final int SOCKET_TIMEOUT = (1000 * 60) * 15;
    private static HttpClient instance;
    private final HttpParams httpParams;
    private final DefaultHttpClient defaultHttpClient;

    private void setTimeOut(HttpParams params) {
        HttpConnectionParams.setConnectionTimeout(params, CONNECTION_TIMEOUT);
        HttpConnectionParams.setSoTimeout(params, SOCKET_TIMEOUT);
    }

    private HttpClient() {
        httpParams = new BasicHttpParams();
        setTimeOut(httpParams);
        defaultHttpClient = new DefaultHttpClient(httpParams);
    }

    public static DefaultHttpClient getInstance() {
        if (instance == null) {
            instance = new HttpClient();
        }
        return instance.defaultHttpClient;
    }
}
