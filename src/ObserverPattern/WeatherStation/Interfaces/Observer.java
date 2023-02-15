package ObserverPattern.WeatherStation.Interfaces;

public interface Observer {
    public void update(float temperature,float humidity,float pressure);
}
