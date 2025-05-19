package com.uas.project.SWEAD;

class Notification {
    private String message;

    public Notification(String message) {
        this.message = message;
    }

    public void deliver(CommunicationChannel channel) {
        System.out.println("[MOCK " + channel + "] " + message);
    }
}