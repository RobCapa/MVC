package OurProject.View;

import OurProject.Model.User;

import java.util.List;

public interface View {
    void showAllUsers();

    void drawing(List<User> users, ViewUser.DataExplanation explanation);

    void showUsers(int indexStart, int indexEnd);

    void showUsers(int indexEnd);
}
