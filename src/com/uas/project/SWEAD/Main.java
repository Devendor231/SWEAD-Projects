package com.uas.project.SWEAD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WebsiteMonitorMockup mockmonitor = new WebsiteMonitorMockup();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("Press 1. and choose which website to subscribe to");
            System.out.println("Press 2. to see whether any updates occured in your subcribed list");
            System.out.println("Press 3. to exit and close the application");
            System.out.print("> Enter your choice: ");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                System.out.print("Enter the URL of the website you wish to stalk: ");
                String url = scanner.nextLine();
                System.out.print("Choose the channel you wish to be notified over (EMAIL, SMS): ");
                String channelInput = scanner.nextLine();
                CC_Enums channel = CC_Enums.valueOf(channelInput);
                mockmonitor.subscribe(url, channel);
                System.out.println("Subscribed to " + url + " via " + channel);
            } else if (input.equals("2")) {
                System.out.println("Checking all subscribed websites...");
                mockmonitor.checkWebsites();
            } else if (input.equals("3")) {
                System.out.println("Program terminated, please start again or not.");
                break;
            } else {
                System.out.println("Invalid option.");
            }
            System.out.println();
        }
        scanner.close();
    }
}