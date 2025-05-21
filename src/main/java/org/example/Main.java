package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        OkHttpClient client = new OkHttpClient();
//        String url = "https://example.com/";
//        Request request = new Request.Builder().url(url).build();
//        try(Response response = client.newCall(request).execute()) {
//            if(!response.isSuccessful()) {
//                System.err.println("Unexpected code " + response);
//            }
//            System.out.println(response.body().string());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TodoService todoService = retrofit.create(TodoService.class);
        Todo t = todoService.getTodoById("3").execute().body();
        System.out.println(t.toString());
    }
}