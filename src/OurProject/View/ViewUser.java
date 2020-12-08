package OurProject.View;

import OurProject.Controller.Controller;
import OurProject.Model.User;

import java.util.List;

public class ViewUser implements View {
    private Controller controller;

    @Override
    public void showAllUsers() {
        controller.showAllUsers();
    }

    @Override
    public void showUsers(int indexStart, int indexEnd) {
        controller.showUsers(indexStart, indexEnd);
    }

    @Override
    public void showUsers(int indexEnd) {
        showUsers(0, indexEnd);
    }

    @Override
    public void drawing(List<User> users, DataExplanation explanation) {
        System.out.println(explanation.explanation);
        for (User user : users) {
            System.out.println("\t" + user);
        }
        System.out.println("===================================");
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public enum DataExplanation {
        ALL_USERS ("All users: "),
        USERS_OF_THE_SPECIFIED_RANGE ("Users of the specified range: ");

        private String explanation;

        DataExplanation(String explanation) {
            this.explanation = explanation;
        }

        public String getExplanation() {
            return explanation;
        }
    }
}
