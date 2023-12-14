package myemailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private final String companySuffix = "XYZcompany.com";
    private Scanner inputScanner = new Scanner(System.in);
    private String password;
    private String email;
    private String altEmail;
    private final int passLength = 10;
    private int mailboxCapacity = 500;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = generateRandomPassword(passLength);
        this.email = generateEmail();
        this.altEmail = alternateEmail();
    }

    private String generateEmail() {
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }

    private String setDepartment() {
        System.out.print(
                "Department codes:\n1 for Sales\n2 for Development\n3 for Accounting\n4 for none\nEnter a code: ");
        int choice = inputScanner.nextInt();
        switch (choice) {
            case 1:
                return "Sales";
            case 2:
                return "Development";
            case 3:
                return "Accounting";
            default:
                return "";
        }
    }

    private String generateRandomPassword(int length) {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()_+{}[]|:;<>,.?/~";
        String allCharacters = upperCase + lowerCase + digits + specialChars;
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * allCharacters.length());
            password[i] = allCharacters.charAt(rand);
        }
        return new String(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    private String alternateEmail() {
        System.out.print("Enter an alternate email: ");
        String alternateEmail = inputScanner.next();
        return alternateEmail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String showInfo() {
        return "New Worker: " + getName() + "\n" +
                "Department: " + department + "\n" +
                "Email: " + email + "\n" +
                "Password: " + password + "\n" +
                "Mailbox Capacity: " + mailboxCapacity + "mb" + "\n" +
                "Alternate Email: " + (altEmail != null ? altEmail : "Not set");
    }
}
