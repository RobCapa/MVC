package OurProject;

import OurProject.Controller.ControllerUser;
import OurProject.Model.MainModel;
import OurProject.View.ViewUser;

public class Main {
    public static void main(String[] args) {
        MainModel model = new MainModel();
        ControllerUser controller = new ControllerUser();
        ViewUser view = new ViewUser();

        controller.setModel(model);
        controller.setView(view);
        view.setController(controller);

        view.showUsers(2);
        view.showAllUsers();
    }
}
