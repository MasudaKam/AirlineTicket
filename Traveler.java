/*
Apache NetBeans IDE 22
I, Masuda Kamilova, pledge that this code is my own work.
*/
package airlineticket;

public class Traveler {
    private String name;
    private int age;
    private char gender;
    private String phoneNumber;
    private int row;
    private int column;

   
    public Traveler(String name, int age, char gender, String phoneNumber, int row, int col) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.row = row;
        this.column = col;
    }

   
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return column;
    }
}
