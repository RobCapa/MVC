package OurProject.Model;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User("Свинка", 25));
        users.add(new User("Евгений", 45));
        users.add(new User("Оля", 17));
        users.add(new User("Юля", 47));
    }

    public List<User> getUsers() {
        return users;
    }
}
