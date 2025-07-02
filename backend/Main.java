package backend;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        if (db.userExists(email)) {
            System.out.println("User already exists.");
        } else {
            String otp = OtpManager.generateOTP();
            System.out.println("Sending OTP to email: " + email);
            EmailSender.send(email, otp);

            System.out.print("Enter OTP: ");
            String inputOtp = scanner.nextLine();

            if (otp.equals(inputOtp)) {
                db.saveUser(new User(email));
                System.out.println("User registered successfully!");
            } else {
                System.out.println("Invalid OTP. Try again.");
            }
        }

        scanner.close();
    }
}
