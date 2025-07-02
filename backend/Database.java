package backend;

import java.util.HashSet;
import java.util.Set;

public class Database {
    private Set<String> emails = new HashSet<>();

    public boolean userExists(String email) {
        return emails.contains(email);
    }

    public void saveUser(User user) {
        emails.add(user.getEmail());
        System.out.println("Saved user: " + user.getEmail());
    }
}
