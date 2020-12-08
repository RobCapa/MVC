package OurProject.Model;

import java.util.List;

public interface Model {
    void showAllUsers();
    List<User> getDisplayData();

    void showUsers(int indexStart, int indexEnd);
}
