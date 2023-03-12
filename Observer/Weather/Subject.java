package Observer.Weather;

import Observer.Display.Observer;

public interface Subject {
    // composition
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
