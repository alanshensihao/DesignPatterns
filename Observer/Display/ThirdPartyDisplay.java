package Observer.Display;

import Observer.Weather.WeatherData;

public class ThirdPartyDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private WeatherData weatherData;
    
    public ThirdPartyDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("ThirdPartyDisplay, Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
