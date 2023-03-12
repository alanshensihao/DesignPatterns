package Observer.Display;

import Observer.Weather.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private WeatherData weatherData;
    
    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("StatisticsDisplay, Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
