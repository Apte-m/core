import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MainApp {
    public static void main(String[] args) throws IOException {

        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(10, TimeUnit.SECONDS)
                .build();

        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("locations")
                .addPathSegment("v1")
                .addPathSegment("cities")
                .addPathSegment("search")
                .addQueryParameter("apikey", "JOl4ckgAPNFueiKlYdtvw8G8JRRVK17V")
                .addQueryParameter("language", "ru")
                .addQueryParameter("q", "Санкт Петербург")
                .build();


        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();


        Response response = okHttpClient.newCall(request).execute();
        String res = response.body().string();
        System.out.println(res);

        //*****************
        OkHttpClient okHttpClientTwo = new OkHttpClient().newBuilder()
                .readTimeout(10, TimeUnit.SECONDS)
                .build();

        HttpUrl urlTwo = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment("295212")
                .addQueryParameter("apikey", "JOl4ckgAPNFueiKlYdtvw8G8JRRVK17V")
                .addQueryParameter("language", "ru")
                .build();

        Request requestTwo = new Request.Builder()
                .url(urlTwo)
                .get()
                .build();

        Response responseTwo = okHttpClientTwo.newCall(requestTwo).execute();
        String result = responseTwo.body().string();
        System.out.println(result);

    }


}
