package com.uas.project.SWEAD;

import java.util.ArrayList;
import java.util.List;

class WebsiteMonitor {
    private List<Subscription> subscriptions = new ArrayList<>();

    public void subscribe(String url, CommunicationChannel channel) {
        subscriptions.add(new Subscription(url, channel));
    }

    public void checkWebsites() {
        for (Subscription sub : subscriptions) {
            boolean updated = Math.random() > 0.5;
            if (updated) sub.notifyUpdate();
        }
    }
}