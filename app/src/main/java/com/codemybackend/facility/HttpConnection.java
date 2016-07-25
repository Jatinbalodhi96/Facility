package com.codemybackend.facility;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpConnection {

    UriBuilder uriBuilder = new UriBuilder();

    HttpURLConnection httpURLConnection = null;
    BufferedReader reader = null;

    final String req_url = uriBuilder.getURL();

    String requested_json_string;

    public String ResponseJSON() {

        {
            try {
                URL url = new URL(req_url);

                httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();

                InputStream inputStream = httpURLConnection.getInputStream();
                StringBuffer buffer = new StringBuffer();

                String in;

                while ((in = reader.readLine()) != null) {
                    buffer.append(in + "\n");
                }
                if (buffer.length() == 0) {
                    return null;
                }

                requested_json_string = buffer.toString();


            } catch (MalformedURLException e1) {
                e1.printStackTrace();

            } catch (IOException e) {
                e.printStackTrace();

            }finally {
                httpURLConnection.disconnect();
            }

        }
        return requested_json_string;
    }
}
