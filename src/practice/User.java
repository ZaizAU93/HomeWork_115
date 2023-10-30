package Homework15.practice;
import java.util.Optional;
public class User {
    public String name;
    public User(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        User user = null;
        User user_2 = new User("RRRR");
        Optional<User> optionalUser = Optional.ofNullable(user);
        String userName = optionalUser.map(User::getName).orElse("DEFAULT");
        System.out.println(userName);
        Optional<User> optionalUser_2 = Optional.ofNullable(user_2);
        String user_2Name = optionalUser_2.map(User::getName).orElse("DEFAULT");
        System.out.println(user_2Name);
    }
}