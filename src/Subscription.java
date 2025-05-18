class Subscription {
    String url;
    CommunicationChannel channel;

    public Subscription(String url, CommunicationChannel channel) {
        this.url = url;
        this.channel = channel;
    }

    public void notifyUpdate() {
        new Notification("Update detected at " + url).deliver(channel);
    }
}