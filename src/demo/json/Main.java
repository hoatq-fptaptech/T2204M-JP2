package demo.json;

import entities.CurrentWeather;
import services.WeatherService;

public class Main {
    public static void main(String[] args){
        try {
            CurrentWeather c = WeatherService.getCurrentWeather();
            if(c !=null){
                System.out.println(c.getName());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
