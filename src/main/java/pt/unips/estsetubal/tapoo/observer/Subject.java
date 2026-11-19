package pt.unips.estsetubal.tapoo.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Manages observers without depending on their concrete classes.
 */
public abstract class Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(Objects.requireNonNull(observer, "observer"));
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers() {
        for (Observer observer : List.copyOf(observers)) {
            observer.update();
        }
    }
}
