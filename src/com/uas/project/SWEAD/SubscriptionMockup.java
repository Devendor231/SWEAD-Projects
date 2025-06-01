package com.uas.project.SWEAD;

public class SubscriptionMockup implements Observer {
    private final String url;
    private final CC_Enums channel;
    public SubscriptionMockup(String url, CC_Enums channel) {
        this.url = url;
        this.channel = channel;
    }
    public void update(String url) {
        if (this.url.equals(url)) {
            new NotificationMockup("Update detected at " + url).deliver(channel);
        }
    }
}