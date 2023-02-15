package ObserverPattern.WeatherStation.Implementations;

import ObserverPattern.WeatherStation.Interfaces.DisplayElement;
import ObserverPattern.WeatherStation.Interfaces.Observer;
import ObserverPattern.WeatherStation.Interfaces.Subject;


//This is our first observer
public class CurrentConditionDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;

    //constructer is used to register the observer in the WeatherData class by using the object of
    // subject so that we can use registerobserver method


    private Subject weatherData; //instance variable it is also known as the reference for the interface of Subject
    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current conditions" + temperature + "F degrees and " + humidity + "% humidity");
    }


    @Override
    public void update(float temperature, float humidity, float pressure) {
            this.temperature=temperature;
            this.humidity=humidity;
            display();
    }
}
