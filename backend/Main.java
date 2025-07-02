import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        String otp = OtpManager.generateOTP();
        EmailSender.send(email, otp);

        System.out.print("Enter the OTP you received: ");
        String userOtp = scanner.nextLine();

        if (otp.equals(userOtp)) {
            User user = new User(email);
            Database.addUser(user);
            System.out.println("✅ User registered successfully!");
            System.out.println("✅ Welcome email sent to: " + email);
            Database.printAllUsers();  // Admin dashboard simulation
        } else {
            System.out.println("❌ Incorrect OTP. Registration failed.");
        }
    }
}
