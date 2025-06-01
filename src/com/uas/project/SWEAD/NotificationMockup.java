package com.uas.project.SWEAD;

public class NotificationMockup {
    private final String givenmessage;

    public NotificationMockup(String message) {
        this.givenmessage = message;
    }

    public void deliver(CC_Enums channel) {
        System.out.println("Over the nonexistent " + channel + " channel there has been an " + givenmessage);
    }
}
