# Airline Reservations System

This Java program simulates a small airline reservation system for a plane with 7 rows and 3 seats per row.

## Features

- The program displays a menu where users can view a boarding pass by entering their phone number or make a new reservation.
- Passenger information (name, age, gender, and phone number) is collected during reservation.
- The seating chart shows available seats marked with "A" and taken seats marked with "X".
- Users select seats from the available ones, and the program prevents selecting an already taken seat.
- Once a reservation is made, the boarding pass is displayed with passenger details and seat assignment.
- An ArrayList stores all passengers with confirmed reservations.
- The program uses static methods to keep the main method simple and organized.
- A two-dimensional static array represents the seating arrangement.
- The program does not currently check if the flight is full before making a reservation but can be extended to include this feature.

## How to Use

- Run the program in Apache NetBeans.
- Use the menu to view boarding passes or make reservations.
- Follow on-screen prompts to enter passenger information and select seats.
