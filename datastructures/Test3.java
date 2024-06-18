package com.wipro.datastructures;

class User1 {
    public String username;

    User1(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User1 [username=" + username + "]";
    }
}

public class Test3 {

    public static void main(String[] args) {
        // Initializing an array using literals
        int numbers[] = new int[] {10, 20, 30, 40, 50};
        System.out.println("Array by literals: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " " + numbers[i]);
        }

        // Initializing an array of User1 objects
        User1[] users = new User1[] {new User1("Alex"), new User1("Alen"), new User1("Ja")};

        // Printing the User1 objects
        for (User1 u : users) {
            System.out.println(u);
        }
    }
}
