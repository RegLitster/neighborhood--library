package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Book[] library = {
                new Book(515, "234-1-53-3567234", "The Big Dog", true, "John Smith"),
                new Book(964, "978-3-16-148410-0", "Lost in the Forest", false, ""),
                new Book(256, "123-4-56-7891011", "Journey to the Stars", true, "Emily Watson"),
                new Book(426, "321-9-87-6543210", "Secrets of the Ocean", false, ""),
                new Book(254, "456-2-33-1122334", "The Last Horizon", true, "Michael Lee"),
                new Book(986, "789-5-11-9988776", "Whispers in the Wind", false, ""),
                new Book(783, "852-1-45-7639123", "Echoes of Tomorrow", false, ""),
                new Book(642, "963-2-11-9988774", "Shadows of the Past", false, ""),
                new Book(731, "741-6-89-1234567", "The Forgotten Realm", true, "Laura Bennett"),
                new Book(859, "314-7-22-5566778", "Rain Over Midnight", false, ""),
                new Book(920, "105-3-66-3344556", "Beneath the Iron Sky", true, "Kevin Stone"),
                new Book(374, "978-0-12-345678-9", "Winds of the North", false, ""),
                new Book(582, "978-1-23-456789-0", "The Silent River", true, "Anna Carter"),
                new Book(619, "978-0-19-876543-2", "Beneath Crimson Skies", false, ""),
                new Book(407, "978-3-59-821234-5", "Legends of the Deep", true, "David Cho"),
                new Book(293, "978-0-67-098765-4", "Shattered Reflections", false, ""),
                new Book(835, "978-2-13-456789-1", "Through the Iron Gates", false, ""),
                new Book(718, "978-4-56-123456-7", "The Clockmaker's Son", true, "Elena Ruiz"),
                new Book(641, "978-7-89-654321-0", "Voices in the Fog", false, ""),
                new Book(502, "978-9-87-654321-3", "A Song for the Fallen", true, "Mark Fields"),
                new Book(176, "978-5-67-890123-4", "The Edge of Memory", false, ""),
        };


        System.out.println("=== Welcome to The Library ===\n");


        while (true) {
            System.out.println("Please enter your choice:");
            System.out.println("1: Show Available Books");
            System.out.println("2: Show Checked out Books");
            System.out.println("3: EXIT");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    showAvailableBooks(library);
                    System.out.println("Would you like to Check Out a Book?\n 1: Yes\n 2: No");
                    int answer = input.nextInt();
                    input.nextLine();
                    if (answer == 1) {
                        System.out.println("Please enter your name");
                        String name = input.nextLine();
                        System.out.println("Please enter your Book ID");
                        int bookID = input.nextInt();
                        input.nextLine();
                        checkOut(library, bookID, name);
                    }
                    System.out.println("Press ENTER to continue...");// this is just a break
                    input.nextLine();
                    break;
                case 2:
                    showCheckedOutBooks(library);
                    System.out.println("C: to check in\nX: to go back to the main menu");
                    String checkIn = input.nextLine().trim().toLowerCase();
                    if (checkIn.equals("c")) {
                        System.out.println("Please enter the ID of the Book you would like to check in");
                        int bookID = input.nextInt();
                        input.nextLine();
                        checkIn(library, bookID);
                    }
                    System.out.println("Press ENTER to continue...");// also a break
                    input.nextLine();
                    break;
                case 3:
                    System.out.println("Thank you for using the library!");
                    System.exit(0);
                    input.close();
                    break;

                default:
                    System.out.println("Invalid choice. Try again");
            }

        }
    }


    public static void showAvailableBooks(Book[] inventory) {
        for (Book book : inventory) {
            if (book != null && !book.isCheckedout()) {
                System.out.println("Title: " + book.getTitle() + " ISBN: " + book.getIsbn() + "  ID: " + book.getId());

            }
        }
        System.out.println();
    }

    public static void showCheckedOutBooks(Book[] inventory) {
        for (Book book : inventory) {
            if (book != null && book.isCheckedout()) {
                System.out.println("Checked Out By: " + book.getCheckedOutTo() + " ISBN: " + book.getIsbn() + " Title: " + book.getTitle() + "  ID: " + book.getId());
            }
        }
        System.out.println(); // these ar just to add a space between the lines
    }


    public static void checkOut(Book[] inventory, int bookID, String name) {

        for (Book book : inventory) {
            if (book != null && book.getId() == bookID) {
                if (!book.isCheckedout()) {
                    book.checkOut(name);
                    System.out.println("Book Checked Out\n");
                } else {
                    System.out.println("That Book Is Not Available\n");
                }
                return;
            }
        }
        System.out.println("We Have No Record Of The Book\n");
    }

    public static void checkIn(Book[] inventory, int bookID) {
        for (Book book : inventory) {
            if (book != null && book.getId() == bookID) {
                book.checkIn();
                System.out.println("Book Checked In\n");
                return;
            }
        }
        System.out.println("Could not find Book\n");
    }


}

