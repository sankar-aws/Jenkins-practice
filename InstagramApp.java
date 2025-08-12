package com.example.instagram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InstagramApp {
    private static List<String> posts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        System.out.println("=== Welcome to Instagram CLI ===");

        do {
            System.out.println("\n1. Post a photo");
            System.out.println("2. View all posts");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter caption: ");
                    String caption = sc.nextLine();
                    posts.add("📸 " + caption);
                    System.out.println("✅ Photo posted!");
                    break;

                case "2":
                    if (posts.isEmpty()) {
                        System.out.println("No posts yet!");
                        System.out.println("No Story");
                    } else {
                        System.out.println("\n--- All Posts ---");
                        for (int i = 0; i < posts.size(); i++) {
                            System.out.println((i + 1) + ". " + posts.get(i));
                        }
                    }
                    break;

                case "3":
                    System.out.println("bye bye!");
                    System.out.println("Nakku");
                    break;

                default:
                    System.out.println("❌ Invalid choice, try again.");
            }
        } while (!choice.equals("3"));

        sc.close();
    }
}
