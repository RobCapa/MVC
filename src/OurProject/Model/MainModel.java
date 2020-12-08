package OurProject.Model;

import java.util.ArrayList;
import java.util.List;

public class MainModel implements Model {
    private final DataBase dataBase = new DataBase();
    private List<User> displayData;

    @Override
    public void showAllUsers() {
        List<User> displayData = new ArrayList<>();
        for (User user : dataBase.getUsers()) {
            try {
                displayData.add(user.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        this.displayData = displayData;
    }

    @Override
    public void showUsers(int indexStart, int indexEnd) {
        List<User> displayData = new ArrayList<>();
        List<User> data = dataBase.getUsers();
        for (int i = indexStart; i < indexEnd; i++) {
            try {
                displayData.add(data.get(i).clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        this.displayData = displayData;
    }

    public List<User> getDisplayData() {
        return displayData;
    }
}
