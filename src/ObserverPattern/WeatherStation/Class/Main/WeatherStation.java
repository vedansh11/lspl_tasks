package ObserverPattern.WeatherStation.Class.Main;

import ObserverPattern.WeatherStation.Class.WeatherData;
import ObserverPattern.WeatherStation.Implementations.CurrentConditionDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay currentConditionDisplay =new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(81, 20, 19.2f);
        weatherData.setMeasurements(78, 90, 29.2f);


    }
}
