import java.util.ArrayList;

public class Database {
    private static ArrayList<User> users = new ArrayList<>();

    public static void addUser(User user) {
        users.add(user);
    }

    public static void printAllUsers() {
        System.out.println("\n📋 Registered Users:");
        for (User user : users) {
            System.out.println("- " + user.getEmail());
        }
    }
}
