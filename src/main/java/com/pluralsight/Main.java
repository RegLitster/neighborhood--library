package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Book[] library = new Book[20];
        library[0] = new Book(515, "234-1-53-3567234", "The Big Dog", true, "John Smith");
        library[1] = new Book(964, "978-3-16-148410-0", "Lost in the Forest", false, "");
        library[2] = new Book(256, "123-4-56-7891011", "Journey to the Stars", true, "Emily Watson");
        library[3] = new Book(426, "321-9-87-6543210", "Secrets of the Ocean", false, "");
        library[4] = new Book(254, "456-2-33-1122334", "The Last Horizon", true, "Michael Lee");
        library[5] = new Book(986, "789-5-11-9988776", "Whispers in the Wind", false, "");
        library[6] = new Book(783, "852-1-45-7639123", "Echoes of Tomorrow", false, "");
        library[7] = new Book(642, "963-2-11-9988774", "Shadows of the Past", false, "");
        library[8] = new Book(731, "741-6-89-1234567", "The Forgotten Realm", true, "Laura Bennett");
        library[9] = new Book(859, "314-7-22-5566778", "Rain Over Midnight", false, "");
        library[10] = new Book(920, "105-3-66-3344556", "Beneath the Iron Sky", true, "Kevin Stone");


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
                    if (answer == 1) {
                        System.out.println("Please enter your name");
                        String name = input.nextLine();
                        input.nextLine();
                        System.out.println("Please enter your Book ID");
                        int bookID = input.nextInt();
                        input.nextLine();
                        checkOut(library, bookID, name);
                    }
                        System.out.println("Press ENTER to continue...");
                        input.nextLine();
                    break;
                case 2:
                    showCheckedOutBooks(library);
                    System.out.println("Press C to check in\n Press X to go back to the main menu");
                    String checkIn = input.nextLine().trim().toLowerCase();
                    if (checkIn.equals("c")) {
                        System.out.println("Please enter the ID of the Book you would like to check in");
                        int bookID = input.nextInt();

                    }
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


        public static void showAvailableBooks (Book[]inventory){
            for (Book book : inventory) {
                if (book != null && !book.isCheckedout()) {
                    System.out.println("Title: " + book.getTitle() + " ISBN: " + book.getIsbn() + "  ID: " + book.getId());

                }
            }
            System.out.println();
        }

        public static void showCheckedOutBooks (Book[]inventory){
            for (Book book : inventory) {
                if (book != null && book.isCheckedout()) {
                    System.out.println("Checked Out By: " + book.getCheckedOutTo() + " ISBN: " + book.getIsbn() + " Title: " + book.getTitle() + "  ID: " + book.getId());
                }
            }
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



    public static void checkIn (Book[]inventory,int bookID, String checkedInTo){
            for (Book book : inventory) {
                if (book != null && book.getId() == bookID) {

                }
            }
        }




}

