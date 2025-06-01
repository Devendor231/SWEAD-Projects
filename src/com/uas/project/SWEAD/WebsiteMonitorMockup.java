package com.uas.project.SWEAD;

import java.util.ArrayList;
import java.util.List;

public class WebsiteMonitorMockup implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private final List<String> urls = new ArrayList<>();
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers(String url) {
        for (Observer observer : observers) {
            observer.update(url);
        }
    }
    public void subscribe(String url, CC_Enums channel) {
        SubscriptionMockup subM = new SubscriptionMockup(url, channel);
        registerObserver(subM);
        urls.add(url);
    }
    public void checkWebsites() {
        for (String url : urls) {
            boolean updated = Math.random() > 0.75;
            if (updated) {
                notifyObservers(url);
            }
        }
    }
}
