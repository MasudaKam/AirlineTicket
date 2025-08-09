/*
Apache NetBeans IDE 22
I, Masuda Kamilova, pledge that this code is my own work.
*/
package airlineticket;

import java.util.ArrayList;
import java.util.Scanner;

public class AirlineTicket {
    private static ArrayList<Traveler> travelerList = new ArrayList<>(); 
    private static String[][] seating = new String[7][3]; 
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        initializeSeating();

        while (true) {
            System.out.println("Welcome to Airline Reservations System");
            System.out.println("\n1. View Boarding Pass");
            System.out.println("2. Make a reservation");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                viewBoardingPass(scanner);
            } else if (choice == 2) {
                makeReservation(scanner);           
            } else {
                System.out.println("Please select 1 or 2.");
            }
        }
        
    }

    
    private static void initializeSeating() {
        for (int row = 0; row < 7; row++) {
            for (int col = 0; col < 3; col++)seating[row][col] = "A";
            }
        }
    

    
    public static void showSeating() {
        System.out.printf("%-3s%-3s%-3s%-3s%n", " ", "0", "1", "2"); 
        for (int row = 0; row < 7; row++) {
            System.out.printf("%-3d", row);
            for (int col = 0; col < 3; col++)System.out.printf("%-3s", seating[row][col]);
            
            System.out.println();
        }
    }

    
    private static void viewBoardingPass(Scanner scanner) {
        System.out.print("Enter telephone number: ");
        String phoneNumber = scanner.nextLine();

        for (Traveler traveler : travelerList) {
            if (traveler.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("Boarding Pass:");
                System.out.println("Name: " + traveler.getName());
                System.out.println("Seat: Row " + traveler.getRow() + ", Seat " + traveler.getCol());
                return;
            }
        }
        System.out.println("Passenger not found.");
    }

    
    private static void makeReservation(Scanner scanner) {
        System.out.print("Enter passenger's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter passenger's age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter passenger's gender (M/F): ");
        char gender = scanner.nextLine().charAt(0);
        System.out.print("Enter passenger's telephone number: ");
        String phoneNumber = scanner.nextLine();

        
        System.out.println("Available seats:");
        showSeating();

        int row, col;
        while (true) {
            System.out.print("Enter row (0-6): ");
            row = scanner.nextInt();
            System.out.print("Enter seat (0-2): ");
            col = scanner.nextInt();

            
            if (row< 7&&col<3&&!seating[row][col].equals("X")) {
            seating[row][col] = "X";
                Traveler traveler = new Traveler(name, age, gender, phoneNumber, row, col);
                travelerList.add(traveler);
                System.out.println("Reservation complete.");
                showSeating();
                break;
            } else {
                System.out.println("Incorrect selection, try again.");
            }
        }
    }
}

