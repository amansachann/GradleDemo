package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Main {
    public static void main(String[] args) {

        OkHttpClient client = new OkHttpClient();
        String url = "https://example.com/";
        Request request = new Request.Builder().url(url).build();
        try(Response response = client.newCall(request).execute()) {
            if(!response.isSuccessful()) {
                System.err.println("Unexpected code " + response);
            }
            System.out.println(response.body().string());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}