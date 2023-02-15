package ObserverPattern.WeatherStation.Class;

import ObserverPattern.WeatherStation.Interfaces.Observer;
import ObserverPattern.WeatherStation.Interfaces.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;

    private float humidity;
    private float pressure;

    public WeatherData(){
        observers=new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if((observers.indexOf(o))>=0) {
            observers.remove(observers.indexOf(o));
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i <= observers.size()-1; i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }
    public void measurementsChanged(){
        notifyObserver();
    }

   public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;

        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
   }
}
