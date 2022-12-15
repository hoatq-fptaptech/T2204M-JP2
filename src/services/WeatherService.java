package services;

import com.google.gson.Gson;
import entities.CurrentWeather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherService {
    private static final String currentURL = "https://api.openweathermap.org/data/2.5/weather?q=Hanoi,vietnam&appid=09a71427c59d38d6a34f89b47d75975c&units=metric";

    private static String fetchContent(String url) throws IOException {
        final int OK = 200;
        URL uri = new URL(url);
        HttpURLConnection conn = (HttpURLConnection)uri.openConnection();
        int responsCode = conn.getResponseCode();
        if(responsCode == OK){
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            StringBuffer rs = new StringBuffer();
            while ( (line=in.readLine()) != null ){
                rs.append(line);
            }
            in.close();
            return rs.toString();
        }
        return null;
    }

    public static CurrentWeather getCurrentWeather() throws Exception{
        String content = fetchContent(currentURL);
        if(content != null) {
            Gson gson = new Gson();
            return gson.fromJson(content, CurrentWeather.class);
        }
        return null;
    }
}
