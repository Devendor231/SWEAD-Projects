public class Main {
    public static void main(String[] args) {
        WebsiteMonitor monitor = new WebsiteMonitor();
        monitor.subscribe("http://example.com", CommunicationChannel.EMAIL);
        monitor.subscribe("http://news.com", CommunicationChannel.SMS);
        monitor.checkWebsites();
    }
}