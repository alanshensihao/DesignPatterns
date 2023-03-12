package Observer;

import Observer.Display.CurrentConditionsDisplay;
import Observer.Display.ForecastDisplay;
import Observer.Display.StatisticsDisplay;
import Observer.Weather.WeatherData;

public class ObserverTest {
    // weather monitoring system

    // goal, display measurements when called, different type of measurements

    // publishers + subscribers = observer pattern

    // the observer pattern:
    // defines a one-to-many dependency between objects so that when one object changes state
    // all of its dependencies are notified and updated automatically

    // one to many relationship
    
    // design principle
    // strive for loosely coupled designs bewteen objects that interact
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentDisplay =
            new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay =
            new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay =
            new ForecastDisplay(weatherData);
        weatherData.setMeasurments(80, 65, 30.4f);
        weatherData.setMeasurments(85, 25, 34.4f);
        weatherData.setMeasurments(90, 45, 36.4f);
    }
}
