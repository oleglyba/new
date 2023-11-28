package com.example.demo1;

public class UserCredentials {

    private static String username;
    private static String password;
    private static String firstName;
    private static String lastName;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        UserCredentials.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        UserCredentials.password = password;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        UserCredentials.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        UserCredentials.lastName = lastName;
    }
}
